package testCase;

import objectRepos.rediffHome;
import objectRepos.rediffLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginApplication {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","D:\\shwetha\\selenium\\thirdpartyExe\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		rediffHome rh = new rediffHome(driver);
		
		rh.HomePageSearch().sendKeys("Login");
		rh.searchSubmit().click();
		driver.navigate().back();
		rh.loginClick().click();
		
		rediffLogin rl = new rediffLogin(driver);
		rl.userName().sendKeys("shwetha");
		rl.password().sendKeys("passwd");
		rl.Go().click();
		
		
	}

}
