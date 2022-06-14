package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		Assert.assertTrue(true);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(3000L);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		
		while(i<5)
		
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
			i++;
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
	}

}
