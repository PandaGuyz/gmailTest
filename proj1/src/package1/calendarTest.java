package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.get("https://www.path2usa.com/travel-companions");
		
		driverObj.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		while(!driverObj.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Jan"))
		{
			driverObj.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> L1 = driverObj.findElements(By.className("day"));
		
		//for(int i=0;i<driverObj.findElements(By.className("day")).size();i++)
		for(int i=0;i<L1.size();i++)
		{
			if(L1.get(i).getText().equals("21"))
			{
				L1.get(i).click();
				break;
			}
		}
		
	}

}
