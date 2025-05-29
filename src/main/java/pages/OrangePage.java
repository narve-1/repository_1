package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePage 
{
   WebDriver driver;
	
   @FindBy(linkText = "https://www.linkedin.com/company/orangehrm/mycompany/")
   WebElement linkdin;
   
   @FindBy(xpath = "//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")
   WebElement facebook;
   
   @FindBy(xpath = "//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")
   WebElement twitter;
   
   public OrangePage() 
   {
	   PageFactory.initElements(driver, this);
   }
  
   public void linkdinLink() 
   {
	   linkdin.click();
   }
   public void facebookLink() 
   {
	   facebook.click();
   }
   public void twitterLinke() 
   {
	   twitter.click();
   }
}
