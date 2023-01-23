package Test_Properties;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Properties_in_Java_browser {

		WebDriver driver;
		String path;
		String actual_chrome_path;
		String actual_firefox_path;
		String actual_edge_path;
		String properties_path;
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			Properties_in_Java_browser p=new Properties_in_Java_browser();
			p.setup();
		}
		
		
		public void setup() throws IOException
		{
			path=System.getProperty("user.dir");
			
			actual_chrome_path=path+"\\Chrome Driver\\chromedriver.exe";
			actual_edge_path=path+"\\Driver\\msedgedriver.exe";
			actual_firefox_path=path+"\\Driver\\geckodriver.exe";
			properties_path=path+"\\Chrome Driver\\Test.Properties"; 
			
			
			//For Reading the Properties File
			File f=new File(properties_path);
			FileInputStream fin=new FileInputStream(f);
			
			//Loading file in Properties
			Properties p=new Properties();
			p.load(fin);
			
			String base_url=p.getProperty("url");
			String browser_type=p.getProperty("browser");
			
			if(browser_type.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", actual_chrome_path);
				driver=new ChromeDriver();

			}
			else if(browser_type.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", actual_firefox_path);
				driver=new FirefoxDriver();
			}
			else
			{
				System.setProperty("webdriver.edge.driver", actual_edge_path);
				driver=new EdgeDriver();
			}
			
			driver.get(base_url);
		}
	}
