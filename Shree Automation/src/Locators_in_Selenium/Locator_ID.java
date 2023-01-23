package Locators_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {
WebDriver driver;
public static void main (String [] args ) throws InterruptedException {
	
	Locator_ID l=new Locator_ID();
	l.setup();
}
public void setup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");

Thread.sleep(3000);
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("shri@gmail.com");

Thread.sleep(3000);
WebElement pass=driver.findElement(By.id("pass"));
pass.sendKeys("098765");

Thread.sleep(3000);
WebElement btn_login=driver.findElement(By.name("login"));
btn_login.click();

Thread.sleep(3000);
driver.close();


}

}
