package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_in_Selenium {
 
	WebDriver driver;
	
public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
	Robot_in_Selenium r=new Robot_in_Selenium();
		r.setup();
		
	}
public void setup() throws InterruptedException, AWTException
{
	String path=System.getProperty("user.dir");
	String actual_path=path+"\\Chrome Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",actual_path);
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/upload/");
	
	WebElement file_choose=driver.findElement(By.name("uploadfile_0"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(file_choose).click().build().perform();
	Thread.sleep(3000);

	String file_path="D:\\Testing Notes\\Automation Testing\\Java Questions.docx";
	StringSelection str=new StringSelection(file_path);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(3000);
	
	Robot r=new Robot();
	//for copy data
	r.keyPress(KeyEvent.VK_CONTROL); 
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL); 
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB); 

	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB); 

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER); 
	Thread.sleep(3000);


	driver.findElement(By.id("terms")).click();
	Thread.sleep(3000);

	driver.findElement(By.id("submitbutton")).click();
	
}
	}