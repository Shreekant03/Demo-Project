package Web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_in_Selenium {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Web_Table_in_Selenium table=new Web_Table_in_Selenium();
		table.setup();
	}
	
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> table_data = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(WebElement x:table_data)
		{
			String company_name = x.findElement(By.xpath("td[1]")).getText();
			String prev_close = x.findElement(By.xpath("td[3]")).getText();
			String current_prise = x.findElement(By.xpath("td[4]")).getText();
			
			if(!company_name.contains("Ltd"))
			{
				System.out.println(company_name+"\t"+prev_close+"\t"+current_prise);
			}
		}
	}

}
