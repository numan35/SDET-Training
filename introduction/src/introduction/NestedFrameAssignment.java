package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		// top=driver.findElement(By.name("frame top"));
		
		//WebElement top=driver.findElement(By.name("frame top"));
		
		//WebElement left=driver.findElement(By.name("frame left"));

		//WebElement middle=driver.findElement(By.name("frame middle")); 
		
		
		//driver.switchTo().frame(0).switchTo().frame(0).switchTo().frame(0);
		
		//WebElement middle=driver.findElement(By.cssSelector("frameset[frameborder='1']")); 
		
		//System.out.println(middle);
		
		
		

	}

}
