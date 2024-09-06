package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import base.TestBase_Second_Day_3_;
import pages.Inventory_Page_Day_4_removecart;
import pages.LoginPage_Second_Day3;
import utility.Screenshot;

public class Inventory_Page_Test_Day_4_removecart extends TestBase_Second_Day_3_
{
	LoginPage_Second_Day3 login;
	Inventory_Page_Day_4_removecart invent;
	@BeforeMethod
	public void setup() throws IOException 
	{
		initialization();
		login= new LoginPage_Second_Day3();
		invent=new Inventory_Page_Day_4_removecart();
		login.LoginApplication();
		
	}
	@Test
	public void vrifyPageTitleTest() 
	{
		String expTitle="Swag Labs";
		String actTitle=invent.vrifyPageTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("The title is "+actTitle);
	}
	@Test
	public void meanuTest() 
	{
		String expTitle="Open Menu";
		String actTitle=invent.meanu();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("The meanu Title is"+actTitle);
	}
	@Test
	public void verifyProdTitleTest() 
	{
		String expetTitle="Products";
		String actualTitle=invent.verifyProdTitle();
		Assert.assertEquals(expetTitle, actualTitle);
		Reporter.log("The prod title is "+actualTitle);
	}
	@Test
	public void addProductTest() 
	{
		String expectedCount="6";
		String actualCount=invent.addProduct();
		Assert.assertEquals(expectedCount, actualCount);
		Reporter.log("The count is "+actualCount);
	}
	@Test
	public void removecartTest() 
	{
		String expectedCount="4";
		String actualCount=invent.removecart();
		Assert.assertEquals(expectedCount, actualCount);
		Reporter.log("The count after removeing item is "+actualCount);
	}
	@Test
	public void verifyFacebookTest() 
	{
		boolean result = invent.verifyFacebook();
		Assert.assertEquals(result, true);
		Reporter.log("The logo is "+result);
	}
	@Test
	public void veriFyLinkidnTest() 
	{
		boolean result_1 = invent.veriFyLinkidn();
		Assert.assertEquals(result_1, true);
		Reporter.log("The logo is "+result_1);
	}
	@Test
	public void verifyCopyTest() 
	{
	    String expectText="© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
	    String actulText=invent.verifyCopy();
	    Assert.assertEquals(expectText, actulText);
	    Reporter.log("The text is"+actulText);
	    
	}
	@Test
	public void veriFyCartOpetionTest() throws InterruptedException 
	{
		
		String expURl="https://www.saucedemo.com/cart.html";
		String actualUrl=invent.veriFyCartOpetion();
		Assert.assertEquals(expURl, actualUrl);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void close(ITestResult it) throws IOException 
	{
		if(it.FAILURE==it.getStatus()) 
		{
			Screenshot.cs(it.getName());
		}
		driver.close();
	}
}
