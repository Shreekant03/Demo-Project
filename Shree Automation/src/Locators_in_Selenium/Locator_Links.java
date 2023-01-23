package Locators_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Links {
 WebDriver driver;
 public static void main(String[] args) {
	 
	 Locator_Links l=new Locator_Links();
	 l.setup();
 }
 
 public void setup()
 {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

WebElement msg_link=driver.findElement(By.linkText("Messenger"));
System.out.println("Link Text : "+msg_link.getText());
System.out.println("Attribute Href: "+msg_link.getAttribute("href"));
System.out.println("Attribute Title: "+msg_link.getAttribute("Title"));
msg_link.click();

WebElement privacy_link=driver.findElement(By.partialLinkText("Privacy"));
System.out.println("Link Text : "+privacy_link.getText());
System.out.println("Attribute Href: "+privacy_link.getAttribute("href"));
System.out.println("Attribute Title :"+privacy_link.getAttribute("title"));
privacy_link.click();

 }
}
