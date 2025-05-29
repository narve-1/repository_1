
package testCases;

// we can make dependecy of method on eachother by 'dependsonmethod' method. ex. if i want my verifyurlapplication and verifytitle method 
//is depends on loginapplication method, if my loginapplication method is fails then remaining methods are automatically skipped.


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPage_Test extends TestBase
{
	LoginPage login;
	@BeforeMethod
	public void setup() 
	{
		initialization();
		login= new LoginPage();
	}
	@Test(dependsOnMethods = "LoginApplicationTest")
	public void verifyUrlOfApllicationTest() 
	{
		String expUrl="https://www.saucedemo.com/";
		String actUrl=login.verifyUrlOfApllication();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("The URL is="+actUrl);
	}
	@Test(dependsOnMethods = "verifyUrlOfApllicationTest")
	public void verifyTitleOfApplicationTest() 
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitleOfApplication();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("The Title of Application="+actTitle);
	}
	@Test
	public void LoginApplicationTest() 
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=login.LoginApplication();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("The original url="+actURL);
	}
	@AfterMethod
	public void close() 
	{
		driver.close();
	}
	
	
	
}
