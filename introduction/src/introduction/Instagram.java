package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("numan_41@hotmail.com");
		
		driver.findElement(By.name("password")).sendKeys("8967Numan");
		
		driver.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > main:nth-child(2) > article:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(3)")).click();
		
		Thread.sleep(2000);
		
		WebElement m=driver.findElement(By.cssSelector("svg[aria-label='Messenger']"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(m).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class*='HoLwm']")).click();
		
		WebElement n=driver.findElement(By.cssSelector("svg[aria-label='New Message']"));
		
		Actions b=new Actions(driver);
		
		b.moveToElement(n).click().build().perform();

		
		
		
		
		
	}

}
