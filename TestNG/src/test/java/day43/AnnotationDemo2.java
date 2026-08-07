package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 1). Login  ---> 
 2). Search --->
 3). Logout --->
 4). Login  --->
 5). Advance Search --->
 6). Logout --->
 */
public class AnnotationDemo2 {

	@BeforeClass
	void Login()
	{
		System.out.println("This is Login..");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("This is Logout..");
	}
	
	@Test (priority = 1)
	void Search()
	{
		System.out.println("This is search..");
	}
	
	@Test (priority = 2)
	void AdvSearch()
	{
		System.out.println("This Advaced search..");
	}
	
	

	
}
