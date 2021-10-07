package testrunner.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/main/java"},
        glue = {"ltwebsite", "automation", "testrunner", "realtimetesting", "extra", "pricing","realdevice"},
        tags = "not @extra",
        monochrome = true,
        plugin = {
        		"pretty","com.epam.reportportal.cucumber.ScenarioReporter",
        		"json:target/cucumber-reports/CucumberTestReport.json",
        		"html:target/cucumber-reports/testReport.html",
        		"rerun:rerun/failed_scenarios.txt"
        		}
        )

public class LtRunner extends AbstractTestNGCucumberTests{
	
	public LtRunner() {
		super();
		System.setProperty("log4j.configurationFile","src/main/java/utility/utility/log4j2.yaml");
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	

}
