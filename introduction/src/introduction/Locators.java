package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait-
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Numan");
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshet yacademy");
		
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Numan");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("numan35@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("numan_41@hotmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		 
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.className("go-to-login-btn")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Numan");
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.className("submit")).click();
		
		
		
		
	}
	
}	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
