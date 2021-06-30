package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		
		driverObj.get("https://www.ebay.com/");
		
		System.out.println(driverObj.findElements(By.tagName("a")).size());
		
		WebElement web1 = driverObj.findElement(By.xpath("//*[@id='glbfooter']"));
		System.out.println(web1.findElements(By.tagName("a")).size());
		
		WebElement web2 = driverObj.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
		System.out.println(web2.findElements(By.tagName("a")).size());
		
		/*for(int i =0 ; i < web2.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(web2.findElements(By.tagName("a")).get(i).getText());
		}*/
		
		String beforeCliktitle = driverObj.getTitle();
		System.out.println("beforeCliktitle "+beforeCliktitle);
		for(int i =0 ; i < web2.findElements(By.tagName("a")).size(); i++)
		{			
			if(web2.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				web2.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		String afterCliktitle = driverObj.getTitle();
		System.out.println("afterCliktitle "+afterCliktitle);
		if(beforeCliktitle.equals(afterCliktitle))
		{
			System.out.println(driverObj.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).getText());
			if(driverObj.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).getText().contains("Sitemap"))
			{
				System.out.println("TRUE");
			}
			else
			{
				System.out.println("FAIL");
			}
			
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
