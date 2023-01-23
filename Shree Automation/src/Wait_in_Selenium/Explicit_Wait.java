package Wait_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Explicit_Wait e=new Explicit_Wait();
		e.setup();
		
	}

		public void setup()
		{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement btn_visibleafter = wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		
System.out.println(btn_visibleafter.getText());
	}

}
