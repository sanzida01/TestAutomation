package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.EasySeleniumHomePage;

public class EasySeleniumHomePageDef {
	
	
	public WebDriver driver;
	 
	 
	 public EasySeleniumHomePageDef()
	    {
	        driver = Hooks.driver;
	       
	    }
	 
	
	
	 @Given("^User Navigate to the Easy Selenium Home Page$")
	 public void user_Navigate_to_the_Easy_Selenium_Home_Page() throws Throwable {
		 driver.get("https://www.seleniumeasy.com/test/");
	       PageFactory.initElements(driver, EasySeleniumHomePage.class);
		   Thread.sleep(10000);
		   System.out.println(driver.getTitle());
	 }

	 @Then("^User Verify Easy Selenium Logo$")
	 public void user_Verify_Easy_Selenium_Logo() throws Throwable {
		 PageFactory.initElements(driver, EasySeleniumHomePage.class);
		 EasySeleniumHomePage.easySeleniumLogo.isDisplayed();
		 Thread.sleep(10000);
		 System.out.println("Easy Selenium Logo Present");
	 }

	 @And("^User verify Easy Selenium Text$")
	 public void user_verify_Easy_Selenium_Text() throws Throwable {
		 PageFactory.initElements(driver, EasySeleniumHomePage.class);
		 EasySeleniumHomePage.easySeleniumText.getText().equalsIgnoreCase("Selenium Easy");
		 System.out.println(EasySeleniumHomePage.easySeleniumText.getText());
		  Thread.sleep(10000);
		 EasySeleniumHomePage.autoTestText.getText().equalsIgnoreCase("Complete Automation Testing Tutorials");
		 System.out.println(EasySeleniumHomePage.autoTestText.getText());
		 
	 }

	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	

}
