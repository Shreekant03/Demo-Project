package Action_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_in_Selenium {

	WebDriver driver;
	String path;
	String properties_path;
	String actual_path;
	String base_url;
	Action a;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Actions_in_Selenium ais=new Actions_in_Selenium();
		ais.read_properties_file();
		ais.setup();
		ais.test_click_action();
		ais.test_double_click_action();
		ais.test_right_click_action();
		
	}
			public void read_properties_file() throws IOException
			{
			    path = System.getProperty("user.dir");
				actual_path=path+"\\Chrome Driver\\chromedriver.exe";
				properties_path=path+"\\Chrome Driver\\Test.Properties"; 
				
				//For Reading the Properties File
				File f=new File(properties_path);
				FileInputStream fin=new FileInputStream(f);
				
				//Loading file in Properties
				Properties p=new Properties();
				p.load(fin);
				base_url = p.getProperty("url");
			}
			
			public void setup()
			
			{
				System.setProperty("webdriver.chrome.driver", actual_path);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(base_url);		
			}
			
			public void test_click_action() throws InterruptedException
			
			{
				WebElement btn_click=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
				a=(Action) new Actions(driver);
				Thread.sleep(3000);
				((Actions) a).moveToElement(btn_click).click().build().perform();
			}
			
			public void test_double_click_action() throws InterruptedException
			
			{
				WebElement btn_double_click=driver.findElement(By.id("doubleClickBtn"));
				Thread.sleep(3000);
				((Actions) a).moveToElement(btn_double_click).doubleClick().build().perform();
			}
			
			public void test_right_click_action() throws InterruptedException
			
			{
				WebElement btn_right_click=driver.findElement(By.id("rightClickBtn"));
				Thread.sleep(3000);
				((Actions) a).moveToElement(btn_right_click).contextClick().build().perform();
			}	
		}
