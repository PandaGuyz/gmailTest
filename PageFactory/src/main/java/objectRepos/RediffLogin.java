//package objectRepos;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class RediffLogin {
//	WebDriver driver;
//
//	public RediffLogin(WebDriver driver){
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(id="login1")
//	WebElement userName;
//
//	@FindBy(xpath="//*[@id='password']")
//	WebElement password;
//
//	@FindBy(name="proceed")
//	WebElement go;
//
//	public WebElement userName(){
//		return userName;
//	}
//
//	public WebElement password(){
//		return password;
//	}
//
//	public WebElement Go(){
//		return go;
//	}
//
//}
