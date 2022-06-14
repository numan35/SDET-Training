package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	
	
	@AfterTest
	public void ploan()
	{
		System.out.println("good");
	}

	@BeforeTest
	public void prerquisite()
	{
		System.out.println("I will execute first");
	}
	

}
