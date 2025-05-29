package utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class HandleWindowUtility 
{
	public  WebDriver driver;
 
	public static void WindowHandle(WebDriver driver,String targetTitle) 
	{
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String window:allWindow)
		{
			String W1 = driver.switchTo().window(window).getTitle();
			System.out.println(W1);
			if(W1.equals(targetTitle)) 
			{
			   driver.switchTo().window(targetTitle);
			}
		}
		driver.switchTo().defaultContent();
		driver.close();
	}
	
}
