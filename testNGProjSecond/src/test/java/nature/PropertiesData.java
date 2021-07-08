package nature;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesData {

@Test
public void GlobalData() throws IOException
{
	Properties prop = new Properties();
	String curDir= System.getProperty("user.dir");

	FileInputStream ip = new FileInputStream(curDir+"\\src\\main\\java\\Resources\\testngDataDriven.properties");
	prop.load(ip);
	String env = prop.getProperty("env");
	System.out.println("properties file env is "+env);
	
	String userName = prop.getProperty("userName");
	System.out.println("properties file userName is "+userName);	
	
}
}
