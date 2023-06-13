package locators;
/*
 * Scenario
 * open the browser
 * enter snappdeal.com
 * type 'iphone'in search text field
 * click on search
 * close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.className("searchforInput")).sendKeys("iphone");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(3000);
	driver.quit();
	
		
		
	}

}
