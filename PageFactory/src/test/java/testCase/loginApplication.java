package testCase;

import objectRepos.RediffHome;
//import objectRepos.RediffLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginApplication {

	RediffHome homePage;
	WebDriver driver;

	@BeforeTest
	public void initializeDriver(){
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
	}

	@Test
	public void search()
	{
		homePage = new RediffHome(driver);
		homePage.enterSearchText("iPhone 12 Pro");
		homePage.clickSearchIcon();


////		rh.HomePageSearch().sendKeys("Login");
//		rh.searchSubmit().click();
//		driver.navigate().back();
//		rh.loginClick().click();
//
//		RediffLogin rl = new RediffLogin(driver);
//		rl.userName().sendKeys("shwetha");
//		rl.password().sendKeys("passwd");
//		rl.Go().click();
		
		
	}

}
