package TstngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testngDemo3 {
	
	
	@Test(timeOut=4000)//wait till 40 seconds before u fail this function if failing. 
	@Parameters({"URL"})
	public void zmDemo31(String ulrname)
	{
		System.out.println("zndemo31");
		System.out.println(ulrname);
	}
	@Test(enabled=false)
	public void fmDemo32()
	{
		System.out.println("fmdemo32");
	}
	@BeforeClass(groups={"Smoke"})
	public void fmBeforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void fmAfterClass()//annotations are alphabetic order
	{
		System.out.println("AfterCLass 1");
	}
	@AfterClass
	public void amAfterClass()
	{
		System.out.println("AfterCLass 2");
	}
	@AfterTest(groups={"Smoke"})
	public void fmDemo33()
	{
		System.out.println("After test");
	}
	@BeforeTest(groups={"Smoke"})
	public void fmDemo35()
	{
		System.out.println("Before test");
	}
	@Test(groups={"Smoke"},dependsOnMethods={"zmDemo31"})
	public void fmdemo33()
	{
		System.out.println("fmdemo33");
	}
	@AfterSuite(groups={"Smoke"})
	public void fnAfterSuite()
	{
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void fnbeforeMethodDemo3()
	{
		System.out.println("before method demo3");
	}
	@Test // this dependsOnMethods should be of only @Test annotation
	public void fndemo1()
	{
		System.out.println("fndemo1");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][]= new Object[3][2];
		
		data[0][0] = "user1";
		data[0][1] = "pswd1";
		
		data[1][0] = "user2";
		data[1][1] = "pswd2";
		
		data[2][0] = "user3";
		data[2][1] = "pswd3";
		
		return data;
		
	}
	
	@Test(dataProvider="getData")
	public void acceptData(String user, String paswd)
	{
		System.out.println(user +"-"+paswd);
	}

}
