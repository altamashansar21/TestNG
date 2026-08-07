package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

	@Test
	void test_hardassertion ()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		Assert.assertEquals(1, 1);
		System.out.println("Testing....");
		System.out.println("Testing....");
	}
	
	
	@Test
	
	void test_Softassertion()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		SoftAssert so = new SoftAssert();
		so.assertEquals(1, 2);
		System.out.println("Testing....");
		System.out.println("Testing....");
		so.assertAll(); 	// mandatory
	}
	
}
