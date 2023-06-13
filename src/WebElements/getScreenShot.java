package WebElements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getScreenShot 
{
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginbutton=driver.findElement(By.name("login"));
	File src = loginbutton.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/"+loginbutton.getText()+".png");
	FileUtils.copyFile(src, dest);
	Thread.sleep(2000);

}
}
