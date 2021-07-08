package nature;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class City {
	/*@BeforeSuite
	public void fnBeforeSUite() {
		System.out.println("inside City fnBeforeSUite");
	}
	@AfterSuite
	public void fnAfterSUite() {
		System.out.println("inside City fnAfterSUite");
	}
	
	@BeforeTest
	public void fnBeforeTest() {
		System.out.println("inside City fnBeforeTest");
	}
	@AfterTest
	public void fnAfterTest() {
		System.out.println("inside City fnAfterTest");
	}
	
	@AfterMethod
	public void fnAfterMethod() {
		System.out.println("inside City fnAfterMethod");
	}
	
	@BeforeMethod
	public void fnBeforeMethod() {
		System.out.println("inside City fnBeforeMethod");
	}
	
	@AfterGroups
	public void fnAfterGroups() {
		System.out.println("inside City fnAfterGroups");
	}
	
	@BeforeGroups
	public void fnBeforeGroups() {
		System.out.println("inside City fnBeforeGroups");
	}
	*/
	
	
	
	@Test(timeOut=4000,groups={"SmokeGp"})//wait till 40 seconds before u fail this function if failing. 
	@Parameters({"browser","version"})
	public void fnCar(String browserNm, String versionNum) {
		System.out.println("inside City fnCar with parameter "+browserNm +" "+versionNum);
	}
	@Test(groups={"SmokeGp"})
	public void fnHouse() {
		System.out.println("inside City fnHouse");
	}
	@Test(groups={"RegressionGp"})
	public void fnFactory() {
		System.out.println("inside City fnFactory");
	}
	@Test(groups={"RegressionGp"},dependsOnMethods = {"fnFactory"})
	public void fnPollution() {
		System.out.println("inside City fnPollution");
	}
	@Test(enabled= false,groups={"RegressionGp"})
	public void fnCrowd() {
		System.out.println("inside City fnCrowd");
	}

}
