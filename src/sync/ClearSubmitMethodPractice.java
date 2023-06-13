package sync;
/*
 * scenario
 * open the browser
 * enter the url Facebook.com
 * enter the number into the username text field
 * clear the username text field
 * enter emailiD and password
 * clickon login button
 * close the browser
 */

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSubmitMethodPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameTF=driver.findElement(By.id("email"));
		usernameTF.sendKeys("1234456467");
		usernameTF.clear();
		
		usernameTF.sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("565656");
		
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
