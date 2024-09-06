package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.util.test.TestResult;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase_Second_Day_3_;
import pages.Inventory_Page_Day_4_removecart;
import pages.LoginPage_Second_Day3;
import utility.ReadData_Excelfile;



	public class Inventory_Page_Test_Day4_excelfile extends TestBase_Second_Day_3_
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
		public void meanuTest() throws EncryptedDocumentException, IOException 
		{
			String expTitle=ReadData_Excelfile.readDataFile(0, 3);//Open Menu";0,3
			String actTitle=invent.meanu();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("The meanu Title is"+actTitle);
		}
		@Test
		public void verifyProdTitleTest() throws EncryptedDocumentException, IOException 
		{
			String expetTitle=ReadData_Excelfile.readDataFile(0, 4);//Products";0,4
			String actualTitle=invent.verifyProdTitle();
			Assert.assertEquals(expetTitle, actualTitle);
			Reporter.log("The prod title is "+actualTitle);
		}
		@Test
		public void addProductTest() throws EncryptedDocumentException, IOException 
		{
			String expectedCount=ReadData_Excelfile.readDataFile(0, 5);//"6";0,5
			String actualCount=invent.addProduct();
			Assert.assertEquals(expectedCount, actualCount);
			Reporter.log("The count is "+actualCount);
		}
		@Test
		public void removecartTest() throws EncryptedDocumentException, IOException 
		{
			String expectedCount=ReadData_Excelfile.readDataFile(1, 0);//"4";1,0
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
		public void verifyCopyTest() throws EncryptedDocumentException, IOException 
		{
		    String expectText=ReadData_Excelfile.readDataFile(1, 1);//"© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";1,1
		    String actulText=invent.verifyCopy();
		    Assert.assertEquals(expectText, actulText);
		    Reporter.log("The text is"+actulText);
		    
		}
		@Test
		public void veriFyCartOpetionTest() throws EncryptedDocumentException, IOException, InterruptedException 
		{
			Thread.sleep(3000);
			String expeurl=ReadData_Excelfile.readDataFile(1, 2);//"https://www.saucedemo.com/cart.html";1,2
			String acturl=invent.veriFyCartOpetion();
			Assert.assertEquals(expeurl, acturl);
			Reporter.log("The url is"+acturl);
		}
		@AfterMethod
		public void close()
		{
			driver.close();
		}
	}

