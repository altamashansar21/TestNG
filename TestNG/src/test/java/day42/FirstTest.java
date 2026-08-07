package day42;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test (priority = 1)
	void open ()
	{
		System.out.println("Open App ");
	}
	@Test (priority = 2)
	void Loging ()
	{
		System.out.println("Loging ");
	}
	
	@Test	(priority = 3)
	void Logour ()
	{
		System.out.println("Logout");
	}
	
	

}
