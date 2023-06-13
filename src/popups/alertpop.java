package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertpop {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("__remote_allow_origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button['onclick=\"jsAlert()']")).click();
		Alert al=(driver).switchTo().alert();
		System.out.println(al.getText());
		//al.sendKeys("ABCD");
		al.accept();
				
		
	}

}
