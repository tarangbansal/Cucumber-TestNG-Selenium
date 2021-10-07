package testrunner.testrunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.asserts.SoftAssert;
import org.yaml.snakeyaml.Yaml;
import testrunner.hooks.Hooks;

public class EnvSetup {

  private static org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(EnvSetup.class);

  public static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_USERNAME = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_KEY = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_EMAIL = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_PASS = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_TUNNEL_NAME = new ThreadLocal<>();
  public static final ThreadLocal<String> JENKINS_JOB_IDENTIFIER = new ThreadLocal<>();
  public static final ThreadLocal<String> CURRENT_USER_TUNNEL_COMMAND = new ThreadLocal<>();
  public static final ThreadLocal<String> TEST_ENV_TEST_URLS = new ThreadLocal<>();
  public static final ThreadLocal<SoftAssert> SOFT_ASSERT = new ThreadLocal<>();
  public static final ThreadLocal<String> TEST_ENV_TEST_SESSION_ID = new ThreadLocal<>();
  public static final ThreadLocal<String> CLIENT_ENV_SESSION_ID = new ThreadLocal<>();
  public static final ThreadLocal<String> RTT_BROWSER_VERSION = new ThreadLocal<>();
  public static final ThreadLocal<String> RTT_OS = new ThreadLocal<>();
  public static final ThreadLocal<String> FIXED_IP = new ThreadLocal<>();
  public static final ThreadLocal<String> RTTFIXIP = new ThreadLocal<>();
  public static final ThreadLocal<String> SELENIUM_VERSION_EXCEPTION = new ThreadLocal<>();
  public static final ThreadLocal<Map<String, String>> GIVEN_CAPS = new ThreadLocal<>();
  public static final ThreadLocal<Map<String, String>> ML_TEST_RESULTS = new ThreadLocal<>();
  
  public static final String TEST_ENV_NAME = System.getProperty("LT_ENV") == null ? "stage"
      : System.getProperty("LT_ENV");
  protected static Map<String, String> config = getEnvConfig();
  public static final String TEST_ENV_USERNAME = config.get("test_env_username");
  public static final String TEST_ENV_KEY = config.get("test_env_key");
  public static final String TEST_ENV_USER_EMAIL = config.get("test_env_email");
  public static final String TEST_ENV_USER_PASS = config.get("test_env_pass");
  public static final String TEST_ENV_HUB_SUB_STR = config.get("test_env_hub_url_sub_str");
  public static final String TEST_ENV_HUB_SUB_STR_REAL = config.get("test_env_hub_url_sub_str_real");
  public static final String TEST_ENV_URL_SUB_STR = config.get("test_env_url_sub_str");
  public static final String TEST_ENV_URL_SEPARATOR_STR = config.get("test_env_url_seprator_str");
  public static final String TEST_ENV_FULL_NAME = config.get("test_env_full_name");
  public static final String TEST_ENV_COMPANY_NAME = config.get("test_env_company_name");
  public static final String CLIENT_ENV_USERNAME = config.get("client_env_username");
  public static final String CLIENT_ENV_KEY = config.get("client_env_key");
  public static final String CLIENT_ENV_HUB_SUB_STR = config.get("client_env_hubUrlStr");
  public static final String CLIENT_ENV_URL_SUB_STR = config.get("client_env_url_sub_str");
  public static final String TEST_ENV_BASE_URL = config.get("test_env_base_url");
  public static final String TEST_ENV_HUB_URL = config.get("test_env_hub_url");
  public static final String TEST_ENV_RETINA_USERNAME = config.get("retina_username");
  public static final String TEST_ENV_RETINA_PASSWORD = config.get("retina_password");
  public static final String TEST_ENV_API_URL = setApiUrl();
  

 //MongoDB Details:
  public static final String MONGODB_CONNECTION_IP = config.get("mognodb_ip");
  public static final Integer MONGODB_CONNECTION_PORT = Integer.parseInt(config.get("mognodb_port"));

  // MySQL Details:
  public static final String ANALYTICS_PROD_DATABASE_SSH_HOST_IP = config.get("analyticsProdDBServerHost");
  public static final String ANALYTICS_PROD_DATABASE_SSH_USER_NAME = config.get("analyticsProdDBServerUsername");
  public static final String ANALYTICS_PROD_DATABASE_HOST_NAME = config.get("analyticsProdDatabaseHost");
  public static final String ANALYTICS_PROD_DATABASE_USERNAME = config.get("analyticsProdDatabaseUsername");
  public static final String ANALYTICS_PROD_DATABASE_PASSWORD = config.get("analyticsProdDatabasePassword");
  public static final Integer ANALYTICS_PROD_DATABASE_PORT = Integer.valueOf(config.get("analyticsProdDatabasePort"));


  EnvSetup() {
    super();
  }

  @SuppressWarnings("unchecked")
  private static Map<String, String> getEnvConfig() {
    File yamlFile = new File("src/main/java/testrunner/testrunner/cucumber.yaml");
    Yaml ymlFileReader = new Yaml();
    Object envValue = null;
    try {
      InputStream inStr = new FileInputStream(yamlFile);
      Map<String, Object> ymlObj = ymlFileReader.load(inStr);
      envValue = ymlObj.get(TEST_ENV_NAME);
      return (HashMap<String, String>) envValue;
    } catch (FileNotFoundException e) {
      ltLogger.error("ERROR: Cucumber.yaml file is not found / Error came while getting TEST_ENV_NAME");
      e.printStackTrace();
    }
    return (Map<String, String>) envValue;
  }
  
  private static String setApiUrl() {
    if (System.getProperty("CUSTOM_USER_API_URL", "").equalsIgnoreCase("")) {
      return config.get("test_env_api_url");
    } else {
      return System.getProperty("CUSTOM_USER_API_URL", "");
    }
    
  }
}