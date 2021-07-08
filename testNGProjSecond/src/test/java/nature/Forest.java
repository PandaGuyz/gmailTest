package nature;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Forest {
	//tests will run in alphabetic order if priority is not mentioned
	@Test(priority=-1)
	public void fnTrees()
	{
		System.out.println("Forest fnTrees");
	}
	
	@Test()
	@Parameters ({"browser","version"})
	public void fnAnimals(String browser,String version){
		System.out.println("Forest fnAnimals browser and version parameter "+browser +" and "+version);
	}
	
	@Test()
	public void fnBirds(){
		System.out.println("Forest fnBirds");
		Assert.assertFalse(true);
	}
	
	@Test(priority=6)
	public void fnMountains(){
		System.out.println("Forest fnMountains");
	}
	
	@Test(priority=0) //priority 0 is same as default which is without priority. 
	public void fnRiver(){
		System.out.println("Forest fnRiver");
	}
	
	@Test(priority=6)
	public void fnGod(){
		System.out.println("Forest fnGod");
	}

}
