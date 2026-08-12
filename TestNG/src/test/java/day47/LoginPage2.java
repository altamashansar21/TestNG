package day47;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	// Constructor
	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		//Mandatory 
	}
	
	// Locator	----> without using pageFactory 
	/*By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	By logo_loc = By.xpath("By.xpath(\"//body\")");	*/
	
	
	// Using PageFactory
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username_loc;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password_loc;         
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement btn;
	
	@FindBy(tagName="a") List<WebElement> link;

	// Using PageFactor 
	// Action Method	
	public void SetUserName(String user) {
		//driver.findElement(txt_username_loc).sendKeys(user);
		txt_username_loc.sendKeys(user);
	}
	
	public void SetPassword(String pwd) {
		txt_password_loc.sendKeys(pwd);
	}
	
	
	public void clickUp() {
		btn.click();
	}
}
