package day44;

import org.testng.annotations.Test;

public class PymentTests {

	@Test(priority = 1 , groups = {"sanity","regression","functional"})
	void PymentInRupees ()
	{
		System.out.println("This is Pyment in the Rupees.. ");
	}
	
	@Test(priority = 2 , groups = {"sanity","regression","functional"})
	void PymentInDoller ()
	{
		System.out.println("This is Pyment in the Doller..");
	}
}
