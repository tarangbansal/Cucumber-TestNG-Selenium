package automation.stepDefinition;

import java.net.URL;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import testrunner.testrunner.EnvSetup;

public class ToDoStepDefinition {

  WebDriver driver;
  public static String status = "failed";

  @Given("^user is on home Page with ([a-zA-Z0-9_=,:.+\\- ]+),([a-zA-Z0-9_=,:.+\\- ]+),([a-zA-Z0-9_=,:.+\\- ]+) and ([a-zA-Z0-9_=,:.+\\- ]+)$")
  public void userIsOnHomePageWithBrowserVersionOsAndResolution(String Browser, String Ver, String OS, String Resolution) throws Exception {
    String browser = Browser;
    String version = Ver;
    String os = OS;
    String res = Resolution;

    String username = EnvSetup.TEST_ENV_USERNAME;;
    String accesskey = EnvSetup.TEST_ENV_KEY;;

    DesiredCapabilities capability = new DesiredCapabilities();
    capability.setCapability(CapabilityType.BROWSER_NAME, browser);
    capability.setCapability(CapabilityType.VERSION, version);
    capability.setCapability(CapabilityType.PLATFORM, os);
    capability.setCapability("screen_resolution", res);
    capability.setCapability("build", "Cucumber-Selenium-TestNG Test");
    capability.setCapability("name", "Cucumber-Selenium-TestNG");
    capability.setCapability("network", true);
    capability.setCapability("video", true);
    capability.setCapability("console", true);
    capability.setCapability("visual", true);

    String gridURL = "https://" + username + ":" + accesskey + "@hub.lambdatest.com/wd/hub";
    driver = new RemoteWebDriver(new URL(gridURL), capability);
    driver.get("https://lambdatest.github.io/sample-todo-app/");
  }

  @When("^select First Item$")
  public void select_first_item() {
    driver.findElement(By.name("li1")).click();
  }

  @Then("^select second item$")
  public void select_second_item() {
    driver.findElement(By.name("li2")).click();
  }

  @Then("^add new item$")
  public void add_new_item() {
    driver.findElement(By.id("sampletodotext")).clear();
    driver.findElement(By.id("sampletodotext")).sendKeys("Yey, Let's add it to list");
    driver.findElement(By.id("addbutton")).click();
  }

  @Then("^verify added item$")
  public void verify_added_item() {
    String item = driver.findElement(By.xpath("/html/body/div/div/div/ul/li[6]/span")).getText();
    Assert.assertTrue(item.contains("Yey, Let's add it to list"));
    status = "passed";
  }

  @Then("^Update the result$")
  public void update_result() {
    ((JavascriptExecutor) driver).executeScript("lambda-status=" + status + "");
  }

  @Then("^Close the browser$")
  public void close_the_browser() {
    driver.quit();
  }
}

