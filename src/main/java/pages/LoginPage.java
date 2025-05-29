package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UseNameTxt;
	@FindBy(xpath = "//input[@id='password']") private WebElement PassTxtBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	 
	public String LoginApplication() 
	{
		UseNameTxt.sendKeys("standard_user");
		PassTxtBox.sendKeys("secret_sauce");
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
