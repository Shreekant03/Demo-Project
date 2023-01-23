package Checkbox_Radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Checkbox {

		WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			Test_Checkbox t1=new Test_Checkbox();
			t1.setup();
		}
		
		public void setup() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ironspider.ca/forms/checkradio.htm");

			WebElement check_red=driver.findElement(By.xpath("//input[@value='red']"));
			System.out.println(check_red.getAttribute("value"));
			Thread.sleep(3000);
			System.out.println("Red Enabled or Not : "+check_red.isEnabled());
			check_red.click();
			System.out.println("Red Selected or Not : "+check_red.isSelected());
			
			
			WebElement check_yellow=driver.findElement(By.xpath("//input[@value='yellow']"));
			System.out.println(check_yellow.getAttribute("value"));
			Thread.sleep(3000);
			System.out.println("Yellow Enabled or Not : "+check_yellow.isEnabled());
			check_yellow.click();
			System.out.println("Yellow Selected or Not : "+check_yellow.isSelected());
			
			
			Thread.sleep(3000);
			check_red.click();
			
			System.out.println("Red Selected or Not : "+check_red.isSelected());
			
			Thread.sleep(3000);
			check_yellow.click();
			
			System.out.println("Yellow Selected or Not : "+check_yellow.isSelected());
		}

	}



