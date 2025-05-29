package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.github.dockerjava.api.model.Driver;

public class TestBaseNew {

	public static WebDriver driver;
	
 @BeforeMethod
	public void initilization()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

	}
 
 @AfterMethod
  public void tearDown() 
   {
	 driver.quit();
   }
}
