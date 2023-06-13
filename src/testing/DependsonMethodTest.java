package testing;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DependsonMethodTest 
{
	private ChromeDriver driver;

	@Test
	public void navigateToActitime()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");

		}
	@Test(dependsOnMethods = "navigateToActitime")
	public void  loginToActitime()
	{
		driver.findElement(By.id(null));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
