package Wait_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implicit_Wait i = new Implicit_Wait();
		i.setup();
	}

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");

		WebElement btn_visibleafter = driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visibleafter.getText());
	}
}
