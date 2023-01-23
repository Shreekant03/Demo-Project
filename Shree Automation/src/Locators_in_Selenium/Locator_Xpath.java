package Locators_in_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Locator_Xpath lx = new Locator_Xpath();
		lx.setup();
	}

	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email_xpath = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		Thread.sleep(3000);
		email_xpath.sendKeys("shri@gmail.com");

		WebElement pwd_xpath = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
		Thread.sleep(3000);
		pwd_xpath.sendKeys("76789000");

		Thread.sleep(3000);
		email_xpath.clear();

		WebElement email_relative = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		email_relative.sendKeys("shri@gmail.com");

		WebElement link_ad = driver.findElement(By.xpath("//a[@title='Advertise on Facebook']"));
		Thread.sleep(3000);
		link_ad.click();

	}

}
