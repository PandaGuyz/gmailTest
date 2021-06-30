package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="abc";
		String passwd="abc";
		
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(userName);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();	
		if(driver.findElements(By.xpath("//*[@id='identifierId']")).size() > 0 )
		{
			System.out.println("login failed");
			
		}
		else
		{
			driver.findElement(By.xpath("//*[@id='password']/div/div/div/input")).sendKeys(passwd);
			driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			if(driver.findElements(By.xpath("//*[@id='password']/div/div/div/input")).size() > 0 )
			{
				System.out.println("login failed");
			}
		}
		
		
		
	}

}
