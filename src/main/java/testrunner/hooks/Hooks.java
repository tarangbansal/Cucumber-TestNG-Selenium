package testrunner.hooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import testrunner.testrunner.EnvSetup;
import utility.utility.Constant;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Constant {

  org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(Hooks.class);
  private boolean noBrowser = false;

  public Hooks() {
    super();
  }

  private Capabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "Chrome");
    capabilities.setCapability("version", "latest");
    capabilities.setCapability("platform", "Windows 10");
    capabilities.setCapability("resolution", "1920x1080");
    capabilities.setCapability("build",
      "Automation_suit_Client_browser_Build_" + EnvSetup.JENKINS_JOB_IDENTIFIER.get());
    capabilities.setCapability("network", false);
    capabilities.setCapability("video", true);
    capabilities.setCapability("console", true);
    capabilities.setCapability("visual", true);
    capabilities.setCapability("idleTimeout", 300);
    capabilities.setCapability("user", EnvSetup.CLIENT_ENV_USERNAME);
    capabilities.setCapability("accessKey", EnvSetup.CLIENT_ENV_USERNAME);
    return capabilities;
  }

  private void createDriver() {
    Capabilities caps = getCapabilities();
    String gridURL = "https://" + EnvSetup.CLIENT_ENV_USERNAME + ":" + EnvSetup.CLIENT_ENV_KEY + "@" + EnvSetup.CLIENT_ENV_HUB_SUB_STR + ".lambdatest.com/wd/hub";
    try {
      RemoteWebDriver testDriver = new RemoteWebDriver(new URL(gridURL), caps);
      testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      testDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      testDriver.manage().window().maximize();
      EnvSetup.driver.set(testDriver);
      EnvSetup.CLIENT_ENV_SESSION_ID.set(testDriver.getSessionId().toString());
    } catch (MalformedURLException e) {
      ltLogger.error(
        "ERROR: cucumber.yaml file has incorrect values in mentioned fields: client_env_username, client_env_key");
      e.printStackTrace();
    }
  }

  private void createLocalDriver(String localBrowser) {
    switch (localBrowser) {
    case "chrome":
      System.setProperty("webdriver.chrome.driver",
        System.getProperty(Constant.DRIVER_PATH_KEY, "drivers/chromedriver"));
      EnvSetup.driver.set(new ChromeDriver());
      break;
    case "firefox":
      System.setProperty("webdriver.gecko.driver", System.getProperty(Constant.DRIVER_PATH_KEY, "drivers/geckodriver"));
      EnvSetup.driver.set(new FirefoxDriver());
      break;

    default:
      createLocalDriver("chrome");
      break;
    }
  }

  @Before(order = 10, value = "@nobrowser")
  public void beforeNoBrowser(Scenario scenario) {
    noBrowser = true;
  }

  @Before(order = 100)
  public void initateBrowser(Scenario scenario) {
    EnvSetup.CURRENT_USER_TUNNEL_NAME.remove();
    EnvSetup.JENKINS_JOB_IDENTIFIER.set(System.getProperty("JENKINS_JOB_IDENTIFIER", ""));
    EnvSetup.RTTFIXIP.set(System.getProperty("RTTFIXIP", ""));
    EnvSetup.CURRENT_USER_EMAIL.set(System.getProperty("RTT_USER_EMAIL", ""));
    EnvSetup.CURRENT_USER_PASS.set(System.getProperty("RTT_USER_PASS", ""));
    if (!noBrowser) {
      String localBrowser = System.getProperty("LOCAL_BROWSER", "false");
      ltLogger.info("localBrowser is '{}' ", localBrowser);
      if (localBrowser.equalsIgnoreCase("false")) {
        createDriver();
        EnvSetup.driver.get().executeScript("lambda-name=" + scenario.getName());
        ltLogger.info("remote webdriver is created");
      } else {
        createLocalDriver(localBrowser);
        ltLogger.info("Local webdriver is created");
      }

    }
  }

  @After(order = 100)
  public void closeTheBrowser(Scenario scenario) {
    if (EnvSetup.TEST_ENV_TEST_URLS.get() != null) {
      scenario.log("TEST_ENV_TEST_URLS: " + EnvSetup.TEST_ENV_TEST_URLS.get() + " ");
      String retinaUrl = "";
      if (EnvSetup.TEST_ENV_NAME.equalsIgnoreCase("stage")) {
        retinaUrl = RETINA_SESSION_URL_STAGE;
      } else if (EnvSetup.TEST_ENV_NAME.equalsIgnoreCase("prod")) {
        retinaUrl = RETINA_SESSION_URL_PROD;
      }
      String testEnvRetinaUrl = retinaUrl + EnvSetup.TEST_ENV_TEST_SESSION_ID.get();
      ltLogger.info("test retina url:-{} ", testEnvRetinaUrl);
      scenario.log("TEST_ENV_RETINA_TEST_URL: " + testEnvRetinaUrl + " ");
    }
    if (EnvSetup.CURRENT_USER_TUNNEL_NAME.get() != null) {
//      StopTunnelBinary stpTunnel = new StopTunnelBinary();
//      stpTunnel.start();
    }

    if (!noBrowser) {
      String clientTestUrl = "https://automation.lambdatest.com/logs/?testID=" + EnvSetup.driver.get().getSessionId()
        .toString();
      String clientRetinaUrl = RETINA_SESSION_URL_PROD + EnvSetup.driver.get().getSessionId().toString();
      scenario.log("CLIENT_ENV_TEST_URL: " + clientTestUrl + " ");
      scenario.log("CLIENT_ENV_RETINA_TEST_URL: " + clientRetinaUrl + " ");

      EnvSetup.driver.get().executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
      EnvSetup.driver.get().quit();
    }

    if (EnvSetup.TEST_ENV_TEST_SESSION_ID.get() != null) {
      try {
        if (!EnvSetup.FIXED_IP.get().equalsIgnoreCase("")) {
//          stopTestIfStillRunning();
        }
      } catch (Exception e) {
        ltLogger.info("session with sessionID {} is in queue", EnvSetup.TEST_ENV_TEST_SESSION_ID.get());
      }
    }
    if (!EnvSetup.RTTFIXIP.get().equals("")) {
      String payload = "{\"email\":\"" + EnvSetup.CURRENT_USER_EMAIL.get() + "\",\"ipv4\":\"\"}";
//      apiHelper.postReq(RTTFIXIP_API_URI, payload);
    }
  }

//  public void fetchDriverStatsAndSaveTofile() {
//    double driverSetupTimeSum = 0.000;
//    double sessionCountForDriverStat = 0.000;
//    double driverQuitTimeSum = 0.000;
//    double vmDownLoadSpeedSum = 0.000;
//    double sessionCountForVmDownSpeed = 0.000;
//    List<String[]> csvlist = csvAsList("logs/" + EnvSetup.JENKINS_JOB_IDENTIFIER.get() + "TestDriverStatics.csv");
//    csvlist.remove(0);
//    for (String[] row : csvlist) {
//      sessionCountForDriverStat += 1;
//      driverSetupTimeSum += Double.parseDouble(row[1]);
//      driverQuitTimeSum += Double.parseDouble(row[2]);
//      if (!row[4].equalsIgnoreCase("local_test") && !row[3].equals("0.0")) {
//        vmDownLoadSpeedSum += Double.parseDouble(row[3]);
//        sessionCountForVmDownSpeed += 1;
//      }
//    }
//    Properties prop = new Properties();
//
//    if (sessionCountForDriverStat == 0.000) {
//      prop.put("AVERAGE_DRIVER_SETUP_TIME", "0.00 Sec");
//      prop.put("AVERAGE_DRIVER_QUIT_TIME", "0.00 Sec");
//    } else {
//      prop.put("AVERAGE_DRIVER_SETUP_TIME",
//        String.valueOf(Math.round((driverSetupTimeSum / sessionCountForDriverStat) * 100) / 100.00) + " Sec");
//      prop.put("AVERAGE_DRIVER_QUIT_TIME",
//        String.valueOf(Math.round((driverQuitTimeSum / sessionCountForDriverStat) * 100) / 100.00) + " Sec");
//    }
//    if (sessionCountForVmDownSpeed == 0.000) {
//      prop.put("AVERAGE_VM_DOWNLOAD_SPEED", "0.00 Mbps");
//    } else {
//      prop.put("AVERAGE_VM_DOWNLOAD_SPEED",
//        String.valueOf(Math.round((vmDownLoadSpeedSum / sessionCountForVmDownSpeed) * 100) / 100.00) + " Mbps");
//    }
//
//    String filePath = "logs/" + EnvSetup.JENKINS_JOB_IDENTIFIER.get() + "testStatics.properties";
//    try (FileOutputStream out = new FileOutputStream(filePath)) {
//      prop.store(out, "adding driver statics");
//    } catch (IOException e) {
//      ltLogger.error(e.getMessage());
//      e.printStackTrace();
//    }
//  }

//  public void stopTestIfStillRunning() {
//    String status = autApi.getTestStatus(EnvSetup.TEST_ENV_TEST_SESSION_ID.get());
//    if (status.equalsIgnoreCase("running")) {
//      HashMap<String, String> sessonValues = new HashMap<>();
//      sessonValues.put(SESSION_ID, EnvSetup.TEST_ENV_TEST_SESSION_ID.get());
//      apiHelper.putReq(autApi.getSessionDetailUri("stop", sessonValues));
//    }
//  }

  @After(order = 101, value = "@SeleniumVersionRegression")
  public void afterSeleniumVersionTest(Scenario scenario) {
    Map<String, String> givenCapHash = EnvSetup.GIVEN_CAPS.get();
    String[] rowValue = new String[] { givenCapHash.get("platform"), givenCapHash.get("browserName"),
      givenCapHash.get("version"), givenCapHash.get("selenium_version"), EnvSetup.TEST_ENV_TEST_SESSION_ID.get(),
      scenario.getStatus().toString(), EnvSetup.SELENIUM_VERSION_EXCEPTION.get(), givenCapHash.get(givenCapHash.get("browserName")+".driver"),
      String.valueOf(givenCapHash.values()) };

//    addValuesInCSVFile(EnvSetup.JENKINS_JOB_IDENTIFIER.get() + SELENIUM_VERSION_TEST_DETAILS,
//      SELENIUM_VERSION_TEST_STATICS_CSV_HEADER, rowValue);

  }
}
