package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_in_Selenium {
WebDriver driver;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Frames_in_Selenium fs=new Frames_in_Selenium();
		fs.setup();
	}
	public void setup()
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Chrome Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

WebElement frame1=driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame1);
	
driver.findElement(By.name("fname")).sendKeys("shrikant");
driver.findElement(By.id("lname")).sendKeys("dombe");
driver.findElement(By.xpath("//*[@type='submit']")).submit();
driver.switchTo().defaultContent();
	}

}
