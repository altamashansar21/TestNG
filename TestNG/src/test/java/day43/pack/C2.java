package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test (priority = 2)
	void xyz ()
	{
		System.out.println("This is xyz form c2.... ");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("This is AfterTest Method..");
	}

}
