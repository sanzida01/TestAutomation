package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EasySeleniumHomePage extends BasePage {
	
	public EasySeleniumHomePage(WebDriver driver) {
		super(driver);

    }
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[1]/div[1]/a/img") 
	public static WebElement easySeleniumLogo;
	
	
	@FindBy(how = How.LINK_TEXT, using = "Selenium Easy") 
	public static WebElement easySeleniumText;
	
	@FindBy(how = How.XPATH, using = "//*[@id='site-slogan']") 
	public static WebElement autoTestText;
	
	
	
	
	

	
}