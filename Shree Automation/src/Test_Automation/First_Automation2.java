package Test_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Automation2 {

	WebDriver driver_chrome;
	WebDriver driver_edge;
	
	public static void main(String[] args) throws InterruptedException {
		
		First_Automation2 f=new First_Automation2();
		f.setup_chrome();
	}
	
	public void setup_chrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver_chrome=new ChromeDriver();
		driver_chrome.manage().window().maximize();
		driver_chrome.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver_chrome.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver_chrome.close();
	
	}
	
}
