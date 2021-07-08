package nature;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Village {
	
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
	public void fnVillFolks(String user, String paswd)
	{
		System.out.println("Village fnVillFolks "+user +"-"+paswd);
	}
	
	@Test(invocationCount =3)
	public void fnCattles()
	{
		System.out.println("Village fnCattles");
	}
	
	@Test
	public void fnWells()
	{
		System.out.println("Village fnWells");
	}
	

}
