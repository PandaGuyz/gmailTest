package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		
		driverObj.get("https://www.amazon.com/");
		Actions A1 = new Actions(driverObj);
		A1.moveToElement(driverObj.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		A1.moveToElement(driverObj.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform();
		A1.moveToElement(driverObj.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).contextClick().build().perform();
		//Keys.chord(Keys.CONTROL,Keys.TAB)
//smoke endtoend regression
		//scrum master, backlog, manual is takinggg lot og time
		
		//after sprint : smoke 30 min
		//regression : before every release
		//host port user id passwd
		//key tool: certificate issue
		//proxy issue: port host user id passwd
		//time line, agile : so modulerize
		//step num  :step name : expecte : actual result
		
		
		
		
		
	}

}
