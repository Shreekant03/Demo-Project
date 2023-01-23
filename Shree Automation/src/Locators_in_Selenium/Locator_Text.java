package Locators_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Text {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Locator_Text lt=new Locator_Text();
		lt.setup();
	}
	public void setup() throws InterruptedException
		
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://msbte.org.in/");
		
		WebElement p_text=driver.findElement(By.xpath("//p[contains(text(),'autonomous Board of Government')]"));
		Thread.sleep(3000);
		
		System.out.println(p_text.getText());

		}

	}


