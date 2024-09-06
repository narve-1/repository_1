package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase_Second_Day_3_;
import utility.ReadData;

public class LoginPage_Second_Day3 extends TestBase_Second_Day_3_
	{
		
		@FindBy(xpath = "//input[@id='user-name']") private WebElement UseNameTxt;
		@FindBy(xpath = "//input[@id='password']") private WebElement PassTxtBox;
		@FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;
		
		public LoginPage_Second_Day3()
		{
			PageFactory.initElements(driver, this);
		}
		 
		public String LoginApplication() throws IOException 
		{
			UseNameTxt.sendKeys(ReadData.readPropertyFile("Username"));
			PassTxtBox.sendKeys(ReadData.readPropertyFile("Password"));
			LoginBtn.click();
			return driver.getCurrentUrl();
		}
		//when we have multiple data to check the we use parameterise method
		public String verifyLogin(String un,String password) 
		{
			UseNameTxt.sendKeys(un);
			PassTxtBox.sendKeys(password);
			LoginBtn.click();
			return driver.getCurrentUrl();
		}
		
	  public String verifyUrlOfApllication() 
	  {
		return driver.getCurrentUrl();
		  
	  }
		public String verifyTitleOfApplication() 
		{
			return driver.getTitle();
			
		}
		
}
