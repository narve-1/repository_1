package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase_Second_Day_3_;



public class Screenshot extends TestBase_Second_Day_3_
{
	public static String getdate() 
	{
		return new SimpleDateFormat("dd-MM-YYYY ss-mm-HH").format(new Date());
		
	}
   public static void cs(String nameOfMethod) throws IOException 
   {
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("C:\\Users\\Namrata Pawar\\eclipse-workspace\\selenium_framework_project\\Screenshot\\"+nameOfMethod+"--"+getdate()+".jpeg");
	   FileHandler.copy(source, dest);
   }
	
}
