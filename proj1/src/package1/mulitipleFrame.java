package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mulitipleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.get("https://fantasycricket.dream11.com/IN/");
		
		int i = getFrameNum(driverObj,By.xpath(".//*[@id='recaptcha-anchor']"));
		if(i != -1){
			driverObj.switchTo().frame(i);
		
			driverObj.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
			driverObj.switchTo().defaultContent();
		}
		
		i = getFrameNum(driverObj,By.xpath(".//*[@id='recaptcha-verify-button']"));
		if(i!= -1){
			driverObj.switchTo().frame(i);
			
		
			WebDriverWait w1 = new WebDriverWait(driverObj,7);
			w1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='recaptcha-verify-button']")));
						
			driverObj.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		
			driverObj.switchTo().defaultContent();
		
		}
		
	}
	
	
	static int getFrameNum(WebDriver driver, By by){
		int frameNum = -1;
		
		int frCount = driver.findElements(By.tagName("iframe")).size();
		
		for(int i = 0; i<frCount;i++)
		{
			driver.switchTo().frame(i);
			if(driver.findElements(by).size() >0)
			{
				frameNum = i;
				break;
			}
			driver.switchTo().defaultContent();
		}
		
		driver.switchTo().defaultContent();
		
		return frameNum;
	}

}
