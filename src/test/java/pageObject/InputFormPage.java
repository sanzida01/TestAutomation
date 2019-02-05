package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InputFormPage extends BasePage {
	
	public InputFormPage(WebDriver driver) {
		super(driver);

    }
	
	@FindBy(how = How.XPATH, using = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/a") 
	public static WebElement inputFormDropdown;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[1]/a") 
	public static WebElement simpleDemoLink;
	
	@FindBy(how = How.XPATH, using = "//*[@id='user-message']") 
	public static WebElement textField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='get-input']/button") 
	public static WebElement showMessageButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='display']") 
	public static WebElement verifyMessage;
	
	@FindBy(how = How.ID, using = "sum1") 
	public static WebElement valueForA;
	
	@FindBy(how = How.ID, using = "sum2") 
	public static WebElement valueForB;
	
	@FindBy(how = How.XPATH, using = "//*[@id='gettotal']/button") 
	public static WebElement getTotalButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='displayvalue']") 
	public static WebElement verifyResult;
	
	
}
