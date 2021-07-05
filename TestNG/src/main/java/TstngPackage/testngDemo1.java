package TstngPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class testngDemo1 {

	@Test
	public void test1() {
		// TODO Auto-generated method stub		
		System.out.println("Hello World");
	}
	@Test
	public void test2() {
		// TODO Auto-generated method stub		
		System.out.println("Hello World second");
	}
	@BeforeMethod(groups={"Smoke"})
	public void BeforeMethod ()
	{
		System.out.println("Before Method");
	}
	@AfterMethod(groups={"Smoke"})
	public void AfterMethod ()
	{
		System.out.println("After Method");
	}
	@BeforeClass(groups={"Smoke"})
	public void BeforeClas ()
	{
		System.out.println("Before Class");
	}
	@AfterClass(groups={"Smoke"})
	public void AfterClas ()
	{
		System.out.println("After Class");
	}
	@BeforeTest(groups={"Smoke"})
	public void eforeTes ()
	{
		System.out.println("Before Test");
	}
	@AfterTest(groups={"Smoke"})
	public void AfterTest ()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite(groups={"Smoke"})
	public void fnAfterSuite2 ()
	{
		System.out.println("After suite");
	}
	@BeforeSuite(groups={"Smoke"})
	public void fnBeforeSuite2 ()
	{
		System.out.println("Before suite");
	}

}
