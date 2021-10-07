package utility.utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import testrunner.testrunner.EnvSetup;

public class WebDriverHelper extends Constant {
  private final RemoteWebDriver driver;
  private final org.apache.logging.log4j.Logger ltLogger = LogManager.getLogger(WebDriverHelper.class);
  protected Actions actions;

  public WebDriverHelper() {
    super();
    driver = EnvSetup.driver.get();
    if (driver != null) {
      actions = new Actions(driver);
    }
  }
}
