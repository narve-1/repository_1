package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{
	public static String readPropertyFile(String value) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Namrata Pawar\\eclipse-workspace\\selenium_framework_project\\src\\main\\java\\config\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
		
	}
	
	

}
