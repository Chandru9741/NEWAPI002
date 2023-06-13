package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSS {

	public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement Login=driver.findElement(By.name("login"));
			//Dimension d=Login.getSize();
			//System.out.println(d.getWidth());
			//System.out.println(d.getHeight());
			System.out.println("font"+Login.getCssValue("font"));
             System.out.println("background"+Login.getCssValue("background-color"));
			driver.quit();
			

	}

}
