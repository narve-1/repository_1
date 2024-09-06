package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase_Second_Day_3_;

public class Cart_Page extends TestBase_Second_Day_3_
{
  @FindBy(xpath = "//span[@class='title']") private WebElement youCartText;
  @FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement qytText;
  @FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement decrisptionText;
  @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement itemProd_1Text;
  @FindBy(xpath = "(//div[@class='inventory_item_name'])[2]")private WebElement itemProd_2Text;
  @FindBy(xpath = "(//div[@class='cart_quantity'])[1]") private WebElement serialNo_1text;
  @FindBy(xpath = "(//div[@class='cart_quantity'])[2]") private WebElement serialNo_2text;
  @FindBy(xpath = "(//div[@class='inventory_item_desc'])[1]") private WebElement firstProdText;
  @FindBy(xpath = "(//div[@class='inventory_item_desc'])[2]") private WebElement secondprodText;
  @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") private WebElement firstProdPrize;
  @FindBy(xpath = "(//div[@class='inventory_item_price'])[2]") private WebElement secondProdPrize;
  @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement removeProd_1;
  @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")private WebElement removeProd_2;
  @FindBy(xpath = "//button[@id='continue-shopping']")private WebElement contiuneBtn;
  @FindBy(xpath = "//button[@id='checkout']")private WebElement checkoutBtn;
	
public Cart_Page() 
{
	PageFactory.initElements(driver, this);
}
public String veriFyCartOpetion()
{
	return driver.getCurrentUrl();

}
public String yourCartTitle() 
{
	return youCartText.getText();	
}
public String qualityTitle() 
{
	return qytText.getText();
}
public String descriptioTitle() 
{
	return decrisptionText.getText();

}
public String verifyFirstItemTitle() 
{
	return itemProd_1Text.getText();	
}
public String verifySecondItemTitle() 
{
	return itemProd_2Text.getText();
}
public String verifySerialNo_1text()
{
	return serialNo_1text.getText();
}
public String verifySeralNo_2text() 
{
	return serialNo_2text.getText();
	
}
public String verifyfirstProdText() 
{
	return firstProdText.getText();
}
public String verifysecondprodText() 
{
	return secondprodText.getText();	
}
public void verifyremoveProd_1() 
{
	removeProd_1.click();	
}
public void verifyremoveProd_2() 
{
	removeProd_2.click();	
}
public String verifyContineBtn() 
{
	contiuneBtn.click();
	return driver.getCurrentUrl();	
}
public String verifyCheckoutBtn() 
{
	checkoutBtn.click();
	return driver.getCurrentUrl();	
}
}