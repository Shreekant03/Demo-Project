package Select;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Select {
WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Test_Select t1=new Test_Select();
		t1.setup();
	}	
		public void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/register.php");

WebElement select_tag=driver.findElement(By.name("country"));
		
Select s1=new Select(select_tag);
Thread.sleep(3000);
s1.selectByIndex(1);

Thread.sleep(3000);
s1.selectByValue("BANGLADESH");

Thread.sleep(3000);
s1.selectByVisibleText("INDIA");

Thread.sleep(3000);
WebElement test=driver.findElement(By.xpath("//option[@value='ANDORRA']"));
test.click();
}
	}
