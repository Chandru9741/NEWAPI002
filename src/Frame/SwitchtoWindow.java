package Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/");
driver.close();
Thread.sleep(2000);
driver.quit();


	}

}
