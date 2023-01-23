package Test_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Automation {

	WebDriver driver;
	
	public static void main(String[] args) {

	First_Automation f=new First_Automation();
	f.setup();
	   
	}

	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().minimize();
	}
}