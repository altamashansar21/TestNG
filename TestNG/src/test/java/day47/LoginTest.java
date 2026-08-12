package day47;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void loginTest()
	{
		LoginPage2 lp = new LoginPage2(driver);
		lp.SetUserName("Admin");
		lp.SetPassword("admin123");
		lp.clickUp();
		assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@AfterClass
	void tearDown ()
	{
		driver.quit();
	}
}
