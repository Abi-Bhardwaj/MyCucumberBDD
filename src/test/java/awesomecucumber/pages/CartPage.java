package awesomecucumber.pages;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "td[class='product-name'] a") private WebElement productNameFld;
	@FindBy(css = "input[type='number']") private WebElement productQuatitiyFld;
	@FindBy(css = ".checkout-button") private WebElement proceedToCheckoutBtn;
	
	public String getProductName() {
		return wait.until(ExpectedConditions.elementToBeClickable(productNameFld)).getText();
	}
	
	public String getProductQuantity() {
		return wait.until(ExpectedConditions.visibilityOf(productQuatitiyFld)).getAttribute("value");
	} 
	
	public void checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
	}

}
