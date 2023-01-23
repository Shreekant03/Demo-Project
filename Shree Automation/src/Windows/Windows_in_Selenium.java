package Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_in_Selenium {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Windows_in_Selenium ws=new Windows_in_Selenium();
		ws.setup();
	}
	public void setup() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Chrome Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		String main_window=driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		System.out.println(driver.getTitle());
		
		Set<String> all_window = driver.getWindowHandles();
		
		for(String x:all_window)
		{
			if(!x.equals(main_window))
			{
				driver.switchTo().window(x);
				WebElement y=driver.findElement(By.id("sampleHeading"));
				System.out.println(y.getText());
				Thread.sleep(3000);
				//driver.close();
			}
		}
		
		driver.switchTo().window(main_window);
		driver.findElement(By.id("windowButton")).click();
		all_window = driver.getWindowHandles();
		
		for(String x:all_window)
		{
			if(!x.equals(main_window))
			{
				driver.switchTo().window(x);
				WebElement y=driver.findElement(By.id("sampleHeading"));
				System.out.println(y.getText());
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
}
