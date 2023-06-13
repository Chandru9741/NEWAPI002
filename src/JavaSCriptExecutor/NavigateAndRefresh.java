package JavaSCriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
      JavascriptExecutor js = new ChromeDriver();
      String url = "https://www.flipkart.com/";
      
      js.executeScript("window.location=arguments[0]", url);
      
	

	}

}
