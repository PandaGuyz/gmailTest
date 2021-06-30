package TstngPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataDriven {

	WebDriver driver;
		
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\shwetha\\selenium\\workspace1\\TestNG\\testngDataDriven.properties");
		prop.load(ip);
		String id1 = prop.getProperty("username");
		System.out.println(id1);
		
		if(prop.getProperty("browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		
		
	}
}
