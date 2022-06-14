package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String name="Numan";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password=getPassword(driver);
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
	
		driver.close();
	
	
	
	
	
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		
		
		String passwordText=(driver.findElement(By.cssSelector("form p")).getText());
		
		String password=passwordText.split("'")[1];
		
		return password;

	}
	
	
	
	
}
