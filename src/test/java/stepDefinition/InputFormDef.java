package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.InputFormPage;


public class InputFormDef {
	
	public WebDriver driver;
	 
	 
	 public InputFormDef()
	    {
	        driver = Hooks.driver;
	       
	    }
	
	
	 @When("^User clicks simple demo form under input form$")
	 public void user_clicks_simple_demo_form_under_input_form() throws Throwable {
		 PageFactory.initElements(driver, InputFormPage.class); 
		 
		 InputFormPage.inputFormDropdown.click();
		 InputFormPage.simpleDemoLink.click();
		 
		 Thread.sleep(10000);
	 }

	 @Then("^User fill out the single input field$")
	 public void user_fill_out_the_single_input_field() throws Throwable {
		 //Text field
		 InputFormPage.textField.sendKeys("China");
		 Thread.sleep(5000);
		 
	 }

	 @And("^User clicks show message button$")
	 public void user_clicks_show_message_button() throws Throwable {
		 InputFormPage.showMessageButton.click();
		 Thread.sleep(5000);
		 System.out.println(InputFormPage.verifyMessage.getText());
	 }


	 @Then("^User fill out Two input field$")
	 public void user_fill_out_Two_input_field() throws Throwable {
		//Text field
		 InputFormPage.valueForA.sendKeys("10");
		 Thread.sleep(5000);
		 InputFormPage.valueForB.sendKeys("5");
		 Thread.sleep(5000);
	 }

	 @And("^User clicks Get Total button$")
	 public void user_clicks_Get_Total_button() throws Throwable {
		 InputFormPage.getTotalButton.click();
		 Thread.sleep(5000);
		 System.out.println(InputFormPage.verifyResult.getText());
	 }

	
	
	
	
	
	
	
	
	
	

}
