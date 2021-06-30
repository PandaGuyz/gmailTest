package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		
		driverObj.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driverObj.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		System.out.println(driverObj.switchTo().alert().getText());
		Thread.sleep(5000L);
		driverObj.switchTo().alert().accept();
		//driverObj.switchTo().alert().dismiss();
		//driverObj.switchTo().alert().sendKeys("hello");
		

	}

}
