package day43;

import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionDemo {

	@Test
	void TestTitle ()
	{
		String exp_title = "OpenCart";
		String act_title = "Openshop";
		
//		if (exp_title.equals(act_title)) {
//			System.out.println("Test Passed.");
//		} else {
//			System.out.println("Test failed..");
//		}
		
	//	Assert.assertEquals(exp_title, act_title);
		
		if (exp_title.equals(act_title)) {
			System.out.println("Test Passed.");
			Assert.assertTrue(true);
		} else {
			System.out.println("Test failed..");
			Assert.assertTrue(false);
		}
	}
}
