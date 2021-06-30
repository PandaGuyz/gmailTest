package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe");
		WebDriver driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.get("http://www.cricbuzz.com/live-cricket-scorecard/17859/rsa-vs-aus-1st-test-australia-tour-of-south-africa-2018");
		driverObj.manage().deleteAllCookies();
		
		
	}

}
