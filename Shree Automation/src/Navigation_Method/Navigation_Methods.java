package Navigation_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Navigation_Methods n=new Navigation_Methods();
		n.setup();
	}
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement g_search = driver.findElement(By.name("q"));
		g_search.sendKeys("shrikant dombe");
		Thread.sleep(3);
		g_search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3);
		driver.navigate().back();
		
		Thread.sleep(3);
		driver.navigate().forward();
		
		Thread.sleep(3);
		driver.navigate().refresh();
		
		

		
	}
}
	
