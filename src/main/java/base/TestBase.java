
package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	
  public void initialization() 
  {
	   WebDriverManager.chromedriver();
	   driver =new ChromeDriver ();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://www.saucedemo.com/");
	   
  }
	
}
