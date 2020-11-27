package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = { "C:\\official_projects\\community-project\\src\\test\\java\\partnershipFeature\\PostPartneship.feature" }, 
		glue = {"stepDefinitions" }, 
		monochrome = true, 
		tags = {}, 
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })



public class PartnershipRunner extends AbstractTestNGCucumberTests{

	
	
}
