package introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1.select any checkbox and grab the label
		//2.go to dropdown and select the option same as checkbox
		//3.enter the same option in Editbox
		//4. click Alert and verify if option  is present in popup message
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		//1.
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption2")).click();
		String abc=driver.findElement(By.cssSelector("label[for='benz']")).getText();

		//2.
		
		WebElement option=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(option);
		dropdown.selectByVisibleText(abc);
		
		//3.
		
		driver.findElement(By.id("name")).sendKeys(abc);
		
		//4.
		
		driver.findElement(By.id("alertbtn")).click();
		
		if(driver.switchTo().alert().getText().contains(abc))
		{
			
			System.out.println("Pass");
		}	
			else
			{
				System.out.println("fail");
			}
			
			
		
		
	}
}
