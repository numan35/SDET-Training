package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrabbingPassword {

	public static String main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		
		
		String passwordText=(driver.findElement(By.cssSelector("form p")).getText());
		
		String password=passwordText.split("'")[1];
		
		return password;

	}
	
	
	
	
	
	

}
