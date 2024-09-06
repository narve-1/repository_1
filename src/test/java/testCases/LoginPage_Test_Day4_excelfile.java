package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase_Second_Day_3_;
import pages.LoginPage_Second_Day3;
import utility.ReadData_Excelfile;

	public class LoginPage_Test_Day4_excelfile extends TestBase_Second_Day_3_
	{
		LoginPage_Second_Day3 login;
		@BeforeMethod
		public void setup() throws IOException 
		{
			initialization();
			login= new LoginPage_Second_Day3();
		}
		@Test
		public void verifyUrlOfApllicationTest() throws EncryptedDocumentException, IOException 
		{
			String expUrl=ReadData_Excelfile.readDataFile(0, 0);//https://www.saucedemo.com/0,0
			String actUrl=login.verifyUrlOfApllication();
			Assert.assertEquals(expUrl, actUrl);
			Reporter.log("The URL is="+actUrl);
		}
		@Test
		public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException 
		{
			String expTitle = ReadData_Excelfile.readDataFile(0, 1);//Swag Labs;0,1
			String actTitle = login.verifyTitleOfApplication();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("The Title of Application="+actTitle);
		}
		@Test
		public void LoginApplicationTest() throws IOException 
		{
			String expURL=ReadData_Excelfile.readDataFile(0, 2);//https://www.saucedemo.com/inventory.html;0,2
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


