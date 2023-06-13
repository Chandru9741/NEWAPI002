package locators;
/*
 * open the browser
 * enter demo.actitime.com
 * clickon forgot your passward
 * click on return to login page
 * close the browser
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktextlocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
