package Test_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_in_Java2 {

	WebDriver driver;
	String path;
	String actual_path;
	String properties_path;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties_in_Java2 p=new Properties_in_Java2();
		p.setup();
	}
	public void setup() throws IOException
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Chrome Driver\\chromedriver.exe";
		properties_path=path+"\\Chrome Driver\\Test.Properties"; 
		
		//For Reading the Properties File
		
		File f=new File(properties_path);
		FileInputStream fin=new FileInputStream(f);

		//Loading file in Properties
		
		Properties p=new Properties();
		p.load(fin);
		
		String base_url=p.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		driver.get(base_url);

		//For Writing into the Properties File
		
		FileOutputStream fout=new FileOutputStream(f);
		p.setProperty("browser", "chrome");				
		p.setProperty("username", "shree@gmail.com");
		p.store(fout, "adding username and updating browser type");
				
	}
}
