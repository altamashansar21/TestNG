package day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test (priority = 1)
	void abc ()
	{
		System.out.println("This is abc form c1.... ");
	}
	
	@BeforeTest
	void BT()
	{
		System.out.println("This is breforeTest Method..");
	}

}
