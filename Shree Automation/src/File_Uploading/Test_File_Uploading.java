package File_Uploading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_File_Uploading {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Test_File_Uploading tf=new Test_File_Uploading();
		tf.setup();
		
	}
public void setup() throws InterruptedException
{
	String path=System.getProperty("user.dir");
	String actual_path=path+"\\Chrome Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",actual_path);
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/upload/");
	
	driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\SHREE\\Desktop\\New folder\\A1.docx");
	Thread.sleep(3000);
	driver.findElement(By.id("terms")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("submitbutton")).click();
	

}
}
