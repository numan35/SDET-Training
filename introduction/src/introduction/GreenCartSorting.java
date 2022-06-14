package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenCartSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("select[id='page-menu'] :last-child")).click();
		
		//Thread.sleep(2000);
		
		WebElement sorting=driver.findElement(By.cssSelector("thead tr th:first-child"));
		
		
		List<String> originalList=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
	
		List<String> price=originalList.stream().filter(a->a.getText).con
		
	
	}
	

}
