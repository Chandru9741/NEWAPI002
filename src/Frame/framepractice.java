package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * scenario
 * open the browser
 * enter snapdel.com
 * mousehoverto  sign in
 * click on login
 * enter mob nu
 * close the frame
 * type watches in search context
 * 
 * 
 * 
 */
public class framepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin =driver.findElement(By.className("accountUserName"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("56567565");
		Thread.sleep(2000);
		
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.name("keyword")).sendKeys("watches");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
