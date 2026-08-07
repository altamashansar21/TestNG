package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test (priority = 3)
	void pqr ()
	{
		System.out.println("This is pr1 from C3...");
		
	}
	@AfterSuite
	void AS()
	{
		System.out.println("This is AfterSuite Method..");
	}
	
	@BeforeSuite
	void BS()
	{
		System.out.println("This is Before Shuite Method...");
	}
}
