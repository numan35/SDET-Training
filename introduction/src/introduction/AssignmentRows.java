package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> rows=driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println(rows.size());
		
		List<WebElement> columns=driver.findElements(By.cssSelector("[class='table-display'] tbody:nth-child(1) th"));
		
		System.out.println(columns.size());
		
		List<WebElement> info=driver.findElements(By.cssSelector("[class='table-display'] tbody:nth-child(3) th"));
		
		
		
		for(int i=0; i<info.size(); i++)
		{
			System.out.println(info.get(i).getText());
		}
		
		
	}

}
