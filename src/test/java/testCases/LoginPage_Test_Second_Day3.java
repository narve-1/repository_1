package testCases;

import java.io.IOException;

import org.apache.commons.lang3.Validate;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase_Second_Day_3_;

import pages.LoginPage_Second_Day3;
import utility.Screenshot;

	public class LoginPage_Test_Second_Day3 extends TestBase_Second_Day_3_
	{
		LoginPage_Second_Day3 login;
		@BeforeMethod
		public void setup() throws IOException 
		{
			initialization();
			login= new LoginPage_Second_Day3();
		}
		@Test
		public void verifyUrlOfApllicationTest() 
		{
			String expUrl="https://www.saucedemo.com/";
			String actUrl=login.verifyUrlOfApllication();
			Assert.assertEquals(expUrl, actUrl);
			Reporter.log("The URL is="+actUrl);
		}
		@Test
		public void verifyTitleOfApplicationTest() 
		{
			String expTitle = "Swag Labs";
			String actTitle = login.verifyTitleOfApplication();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("The Title of Application="+actTitle);
		}
		@Test
		public void LoginApplicationTest() throws IOException 
		{
			String expURL="https://www.saucedemo.com/inventory.html";
			String actURL=login.LoginApplication();
			Assert.assertEquals(expURL, actURL);
			Reporter.log("The original url="+actURL);
		}
		@DataProvider(name="validation")
		public Object[][] getdata()
		{
			
			return new Object[][] 
			{
				{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"},
				{"error_user","secret_sauce"},
				{"visual_user","secret_sauce"},
				{"namrata_pawar","secret_password"},
				{"namrata_narve","password_sauce"}
			};
				
		}
		@Test(dataProvider ="validation")
		public void verifyLoginTest(String un,String password) 
		{
			SoftAssert s=new SoftAssert();
			String expURL="https://www.saucedemo.com/inventory.html";
			String actURL=login. verifyLogin(un,password);
			s.assertEquals(expURL, actURL);
			s.assertAll();
			
			
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


