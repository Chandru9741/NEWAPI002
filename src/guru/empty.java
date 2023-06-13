package guru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("ChromeDriver", "./chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freejobalert.com/");

	}

}
