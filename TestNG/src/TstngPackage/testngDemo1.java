package TstngPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class testngDemo1 {

	@Test
	public void fnDemo() {
		// TODO Auto-generated method stub		
		System.out.println("Hello World");
	}
	@Test
	public void faDemwo() {
		// TODO Auto-generated method stub		
		System.out.println("Hello World second");
	}
	@BeforeMethod(groups={"Smoke"})
	public void BeforeMethod ()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod(groups={"Smoke"})
	public void AfterMethod ()
	{
		System.out.println("AfterMethod");
	}
	@BeforeClass(groups={"Smoke"})
	public void BeforeClas ()
	{
		System.out.println("BeforeClas");
	}
	@AfterClass(groups={"Smoke"})
	public void AfterClas ()
	{
		System.out.println("AfterClas");
	}
	@BeforeTest(groups={"Smoke"})
	public void eforeTes ()
	{
		System.out.println("beforeTes");
	}
	@AfterTest(groups={"Smoke"})
	public void AfterTest ()
	{
		System.out.println("AfterTes");
	}
	
	@AfterSuite(groups={"Smoke"})
	public void fnAfterSuite2 ()
	{
		System.out.println("after suite");
	}
	@BeforeSuite(groups={"Smoke"})
	public void fnBeforeSuite2 ()
	{
		System.out.println("before suit");
	}

}
