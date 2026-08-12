package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// Locator
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	By logo_loc = By.xpath("By.xpath(\"//body\")");
	
	// Action Method	
	public void SetUserName(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void SetPassword(String pwd) {
		driver.findElement(txt_username_loc).sendKeys(pwd);
	}
	
	
	public void clickUp() {
		driver.findElement(txt_username_loc).click();
	}
}
