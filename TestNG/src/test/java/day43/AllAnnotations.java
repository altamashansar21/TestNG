package day43;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void BS()
	{
		System.out.println("This is Before Suite method....");
	}
	
	@AfterSuite
	void AS()
	{
		System.out.println("This is After Suite method....");
	}
	
	@BeforeTest
	void BT()
	{
		System.out.println("This is Before Test method....");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("This is After Test method....");
	}
	
	@BeforeClass
	void BC()
	{
		System.out.println("This is Before Class method....");
	}
	
	@AfterClass
	void AC()
	{
		System.out.println("This is After Class method....");
	}

	@BeforeMethod
	void BM()
	{
		System.out.println("This is Before Method...");
	}
	
	@AfterMethod
	void AM()
	{
		System.out.println("This is After Method...");
	}
	
	@Test
	void tm1()
	{
		System.out.println("This is Test Method1....");
	}
	
	@Test
	void tm2()
	{
		System.out.println("This is Test Method....");
	}
}
