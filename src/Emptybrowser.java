import org.openqa.selenium.chrome.ChromeDriver;

public class Emptybrowser {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getPageSource());
		driver.close();
		  }

}
	