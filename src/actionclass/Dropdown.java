package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
		Select s =new Select(dropdown);
		List<WebElement> dropdownList =s.getOptions();
		for(WebElement WebElement :dropdownList) {
			System.out.println(WebElement.getText());
			
		}
driver.quit();
	}

}
