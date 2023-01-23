package Test_Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_in_Java {

	WebDriver driver;
	String path;
	String actual_path;
	String properties_path;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties_in_Java p=new Properties_in_Java();
		p.setup();
	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Chrome Driver\\chromedriver.exe";
		properties_path=path+"\\Chrome Driver\\Test.Properties"; 
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
}
