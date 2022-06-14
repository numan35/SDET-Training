package test;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class day3 {
	
	
	
	@Test
	public void WebloginCarLoan()
	{
		//selenium
		System.out.println("weblogincar");
	}
	
	
	@Test
	public void MobilesigninCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@Test
	public void MobilelogouCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@Test
	public void MobileloginCarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@AfterSuite
	public void LoginAPIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}

}
