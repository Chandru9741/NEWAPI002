package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		if(loginButton.isEnabled())
 System.out.println("Login button enabled");
		else
			System.out.println("Login button is disabled");
		driver.quit();
			
	}

}
