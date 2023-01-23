package Locators_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Class {
WebDriver driver;
public static void main(String[] args) {

	Locator_Class lc=new Locator_Class();
	lc.setup();
	
}

public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement pass_class=driver.findElement(By.className("inputtext"));
	pass_class.sendKeys("hello");
	
}
}