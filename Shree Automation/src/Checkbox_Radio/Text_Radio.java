package Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Radio {
	
WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Text_Radio t1=new Text_Radio();
		t1.setup();
	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement radio_mozilla=driver.findElement(By.xpath("//form//input[@name='browser'][2]"));
		Thread.sleep(3000);
		System.out.println("Mozilla Enabled or Not : "+radio_mozilla.isEnabled());
		radio_mozilla.click();
		System.out.println("Mozilla Selected or Not : "+radio_mozilla.isSelected());
		
		WebElement radio_opera=driver.findElement(By.xpath("//blockquote[@class='Example'][2]//form//following-sibling::input[3]"));
		Thread.sleep(3000);
		System.out.println("Opera Enabled or Not : "+radio_opera.isEnabled());
		radio_opera.click();
		System.out.println("Opera Selected or Not : "+radio_opera.isSelected());
		
		System.out.println("Mozilla Selected or Not : "+radio_mozilla.isSelected());
	}


	}

