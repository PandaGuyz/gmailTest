package objectRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class rediffHome {
	WebDriver driver;
	public rediffHome(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search =By.id("srchword");
	By submit = By.xpath("//*[@id='queryTop']/input");
	By login = By.xpath("//*[@id='signin_info']/a[1]");
	
	public WebElement HomePageSearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement searchSubmit(){
		return driver.findElement(submit);
	}
	public WebElement loginClick(){
		return driver.findElement(login);
	}
	

}
