package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect 
{ 
	public static void main(String[] args)

		{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Login=driver.findElement(By.name("login"));
	Rectangle d=Login.getRect();
	//System.out.println(d.getWidth());
  //stem.out.println(d.getHeight());
	System.out.println(d.getX());
	System.out.println(d.getY());
	System.out.println(d.getHeight());
	System.out.println(d.getWidth());
	driver.quit();
	
}

}
