package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase_Second_Day_3_;
import utility.HandleDropDown;

	public class Inventory_Page_Day_4_removecart extends TestBase_Second_Day_3_
	{
	   //object repositoy
		@FindBy(xpath = "//div[@class='app_logo']") private WebElement pageTitle;
		@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement meanuBar;
		@FindBy(xpath = "//span[@class='title']") private WebElement prodTitle;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement prodSauceBackpack;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement prodBikeLight;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement prodBoltTshirtl;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement prodFleeceJacket;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement prodOnesie;
		@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement prodAllthethings;
		@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement dropDown;
		@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartimage;
		@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartCount;
		@FindBy(xpath = "//button[@name='remove-sauce-labs-bolt-t-shirt']") private WebElement removeprodBoltTshirtl;
		@FindBy(xpath = "//button[@name='remove-sauce-labs-fleece-jacket']") private WebElement removeprodFleeceJacket;
		@FindBy(xpath = "//a[text()='Facebook']")private WebElement facebookLogo;
		@FindBy(xpath = "//a[text()='LinkedIn']")private WebElement linkdinLogo;
		@FindBy(xpath = "//div[@class='footer_copy']")private WebElement copyRight;
		@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement cartClick;
		
		
		//calling create constuctor of classname 
		 public Inventory_Page_Day_4_removecart()
		 {
			 PageFactory.initElements(driver, this);
		 } 
		//method
		public String vrifyPageTitle() 
		{
			
			return pageTitle.getText();
		}
		public String meanu() 
		{
			return meanuBar.getText();
		}
		public String verifyProdTitle() 
		{
			return prodTitle.getText();
			
		}
		public String addProduct() 
		{
			HandleDropDown.handleDropDownList(dropDown,"Price (low to high)");
			prodSauceBackpack.click();
			prodBikeLight.click();
			prodBoltTshirtl.click();
			prodFleeceJacket.click();
			prodOnesie.click();
			prodAllthethings.click();
			return cartCount.getText();
		}
		public String removecart() 
		{
			addProduct();
			removeprodBoltTshirtl.click();
			removeprodFleeceJacket.click();
			return cartCount.getText();
			
		}
		public boolean verifyFacebook() 
		{
			return facebookLogo.isDisplayed();
			
		}
		public boolean veriFyLinkidn() 
		{
			return linkdinLogo.isDisplayed();
			
		}
		public String verifyCopy() 
		{
			return copyRight.getText();
			
		}
		public String veriFyCartOpetion() throws InterruptedException 
		{
			Thread.sleep(3000);
			cartClick.click();
			return driver.getCurrentUrl();
		
		}

	}

