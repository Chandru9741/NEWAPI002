package sync;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class customwait {

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	
	WebElement element = null;
	int count =20;
	for(int i=0; i<count; i++)
	{ try {
		
	
		element = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	                     break;
	}
	catch(Exception e) 
	{ 
		
	Thread.sleep(1000);
    }

					

	System.out.println(element.getText());
	driver.quit();
		

		}
}
}
