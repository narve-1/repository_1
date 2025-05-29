package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBaseNew;
import pages.OrangePage;
import utility.HandleWindowUtility;

public class OrangeTestCase extends TestBaseNew

{

   @Test 
   public void check() 
   {
	   HandleWindowUtility hw=new HandleWindowUtility();
	   OrangePage op=new OrangePage();
	   op.linkdinLink();
	   op.facebookLink();
	   op.twitterLinke();
	   hw.WindowHandle(driver,"https://www.linkedin.com/company/orangehrm/mycompany/");
   }
}
