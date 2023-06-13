package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileuploadbyUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
		
	//WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//button[text()='Upload Resume']"));
Thread.sleep(2000);

//step 1: select file path to be upload
    StringSelection str = new StringSelection("C:\\Users\\dell\\Desktop\\ashwini resume-2.docx");
    
    Thread.sleep(2000);
    //Step 2: copy the path to clipboard
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
    
    //step3: press ctrl+v
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
    
    
    //Step 4: Press Eneter
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    Thread.sleep(3000);
    driver.quit();
    


	}

}
