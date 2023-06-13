package sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abd {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
try {
	wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	
}
catch(Exception e)
{
	System.out.println("Disabled");
	
}
driver.findElement(By.name("username")).sendKeys("456567678");
driver.findElement(By.name("password")).sendKeys("125336667");

	
	try {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
	catch(Exception e)
	{
		System.out.print("Disabled");
		
	}
	
	driver.quit();
}
}