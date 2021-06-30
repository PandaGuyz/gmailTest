package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		
		driverObj.get("http://jqueryui.com/droppable/");
		
		//driverObj.switchTo().frame(0);
		//webelement should be whole frame box and not an frame object
		driverObj.switchTo().frame(driverObj.findElement(By.xpath("//*[@id='content']/iframe")));
		driverObj.findElement(By.id("draggable")).click();
		
		Actions A1 = new Actions(driverObj);
		WebElement source = driverObj.findElement(By.id("draggable"));
		WebElement target = driverObj.findElement(By.id("droppable"));
		A1.dragAndDrop(source, target).build().perform();
		driverObj.switchTo().defaultContent(); //to go back to windows app from frame block
		
		
	}

}
