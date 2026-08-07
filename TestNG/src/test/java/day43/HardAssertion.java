package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	 void hard ()
	 {
//		 Assert.assertEquals("xyz", "xyz");
//		 Assert.assertEquals(123, "123");
//		 Assert.assertEquals("123", abc);
//		 Assert.assertEquals(123,123);
		
		//Assert.assertNotEquals(123, 123); 		// Failed
		//Assert.assertNotEquals(123, 213); 		// passed
		
		//Assert.assertTrue(true); 				// passed
		//Assert.assertTrue(false); 				// failed
		
		//Assert.assertTrue(1==2); 		// failed
		//Assert.assertTrue(1==1); 		// passed 
		
		//Assert.assertFalse(1==2); 		// passed
		//Assert.assertTrue(1==1); 		// failed
		
		Assert.fail();
	 }
}
