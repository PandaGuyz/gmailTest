package objectRepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffHome {
	WebDriver driver;
	
	@FindBy(id="srchword") WebElement searchText;
	@FindBy(xpath="//*[@id='queryTop']/input") WebElement searchIcon;
	@FindBy(xpath="//*[@id='signin_info']/a[1]") WebElement login;

	public RediffHome(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchText(String searchValue)
	{
		searchText.sendKeys(searchValue);
	}
	
	public void clickSearchIcon(){
		searchIcon.click();
	}
	

}
