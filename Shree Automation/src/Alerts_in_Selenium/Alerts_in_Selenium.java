package Alerts_in_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_in_Selenium {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
Alerts_in_Selenium ais=new Alerts_in_Selenium();
ais.setup();

	}
public void setup() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement btn_alert =driver.findElement(By.id("alertButton")); 
	btn_alert.click();

	Alert alert=driver.switchTo().alert();
	Thread.sleep(5000);
	System.out.println(alert.getText());
	alert.accept();
	
	WebElement btn_confirm=driver.findElement(By.id("confirmButton"));
	btn_confirm.click();
	
	alert=driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(alert.getText());
	alert.dismiss();

	WebElement btn_promt=driver.findElement(By.id("promtButton"));
	Thread.sleep(3000);
	btn_promt.click();
	
	alert=driver.switchTo().alert();
	Thread.sleep(3000);
	alert.sendKeys("Hello");
	alert.accept();
}
}
