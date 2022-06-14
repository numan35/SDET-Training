package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\New\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentId=it.next();
		
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		WebElement s=driver.findElement(By.className("example"));
		
		String newwindow=s.getText();
		
		System.out.println(newwindow);
	
		driver.switchTo().window(parentId);
		
		WebElement r=driver.findElement(By.cssSelector("h3[xpath='1']"));
		
		String open=r.getText();
		
		System.out.println(open);
		
	}

}
