package introduction;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentAutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("tur");
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		List<WebElement> b=driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
		
		String turkey="Turkey";
		
		int i =0;
		
		while(!b.get(i).getText().equalsIgnoreCase(turkey));
		{
		 
			a.moveToElement(b.get(i)).click().build().perform();
			
			i++;
		}
	
		
	}

}
