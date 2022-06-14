package introduction;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1. count of the links on the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. count of the links on the footer section
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// 3. count of the links on first column on footer section
		
		WebElement firstcolumndriver=driver.findElement(By.xpath("//tbody/tr/td/ul"));
		
		System.out.println(firstcolumndriver.findElements(By.tagName("a")).size());
		
		List<WebElement> columnLinks=firstcolumndriver.findElements(By.tagName("a"));
		
		Actions a= new Actions(driver);
		
		
		for(int i=0; i<5; i++)
		{
			a.moveToElement(columnLinks.get(i)).keyDown(Keys.CONTROL).click().build().perform();	
			
			//Thread.sleep(5000);
		
		}
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		
		
	}


}
