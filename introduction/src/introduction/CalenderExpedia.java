package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExpedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		
		//April 14
		
		driver.findElement(By.id("d1-btn")).click();
		List<WebElement> days=driver.findElements(By.cssSelector(".uitk-date-picker-day-number"));
		
		int count=days.size();
		
		for(int i=0; i<count; i++)
		{
			String date=days.get(i).getText();
			
			if(date.equalsIgnoreCase("23"))
			{
				days.get(i).click();
				break;
			}
		}
		
	}

}
