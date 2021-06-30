package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenJavaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.get("https://www.ksrtc.in");
		
		driverObj.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("BENG");
		
		JavascriptExecutor js= (JavascriptExecutor) driverObj;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text;
		
		int i=0;
		while(i <9)
		{
			driverObj.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(text.contains("AIRPRT"))
			{
				i=10;
			}
			else
			{
				i++;
			}
		}		
	}
}
