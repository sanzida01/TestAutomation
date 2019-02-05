package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"},
		monochrome = true, //Display the console output in a readable format
		dryRun = false,
		//tags = {"@SMOKE"}
		//tags = {"@Regression"}
		//tags = {"~@Test4"}   // will run all Scenarios without the Test4 tag
		//tags = {"@SmoketestFiP2"}
		//tags = {"@SmoketestFiP7,@SmoketestSP2"}
		tags = {"@Regression"}
		)
public class Runner{
	
}