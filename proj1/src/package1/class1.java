package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.out.println("My first program");
		
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		//FirefoxDriver
		//InternetExplorerDriver
		
		/*driverObj.get("https://www.google.com");
		System.out.println(driverObj.getTitle());
		System.out.println(driverObj.getCurrentUrl());
		
		driverObj.navigate().to("https://www.yahoo.com");
		System.out.println(driverObj.getCurrentUrl());
		
		driverObj.navigate().back();
		System.out.println(driverObj.getCurrentUrl());
		
		driverObj.navigate().forward();
		System.out.println(driverObj.getCurrentUrl());*/
		
		
		driverObj.get("https://www.facebook.com");
		String email = "shwetha.ks7@gmail.com";
		String id= "email";
		//driverObj.findElement(By.id(id)).sendKeys(email);
		//driverObj.findElement(By.className("inputtext")).sendKeys("hello");
		//driverObj.findElement(By.className("inputtext")).sendKeys("hiii");
		//driverObj.findElement(By.linkText("Forgotten account?")).click();
		
		driverObj.findElement(By.xpath("//*[@id='email']")).sendKeys("userid");
		//driverObj.findElement(By.linkText("Forgotten account?")).click();
		driverObj.findElement(By.xpath("//*[@id='loginbutton']/input")).click();
		Thread.sleep(3000L);
		//System.out.println(driverObj.findElement(By.partialLinkText("Please enter your email")).getText());
		//System.out.println(driverObj.findElement(By.xpath("//*[id='globalContainer']/div[2]/form/div/div[2]/div[2]")).getText());
		//System.out.println(driverObj.findElement(By.xpath("//*[id='globalContainer']/div[3]/div/div/div")).getText());
		
		
		//driverObj.close();
	}

}
