package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test (priority = 1)
	void openweb()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority = 2 , dependsOnMethods = {"openweb"})
	void Login()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority = 3, dependsOnMethods = {"Login"})
	void Search()
	{
		Assert.assertTrue(false);
	}
	
	@Test (priority = 4, dependsOnMethods = {"Login","Search"})
	void ADVsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority = 5, dependsOnMethods = {"Login"})
	void Logout()
	{
		Assert.assertTrue(true);
	}

}
