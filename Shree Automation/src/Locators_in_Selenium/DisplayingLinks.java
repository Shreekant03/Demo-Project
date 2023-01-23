package Locators_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayingLinks {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DisplayingLinks dl=new DisplayingLinks();
		dl.setup();
		
	}

	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msbte.org.in/");
		
	List<WebElement> a_tag = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		System.out.println("Count :"+a_tag.size());
		
		for(WebElement x:a_tag)
		{
			System.out.println(x.getText()+" : "+x.getAttribute("href"));
		}
		
	}
}
