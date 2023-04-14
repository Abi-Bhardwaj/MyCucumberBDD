package awesomecucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import awesomecucumber.domainObjects.BillingDetails;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "billing_first_name") private WebElement billingFirstnameFld;
	@FindBy(id = "billing_last_name") private WebElement billingLastnameFld;
	@FindBy(id = "billing_address_1") private WebElement billingAddressOneFld;
	@FindBy(id = "billing_city") private WebElement billingCityFld;
	@FindBy(id = "billing_state") private WebElement billingStateDropdown;
	@FindBy(id = "select2-billing_state-container") private WebElement billingAlternateStateDropdown;
	@FindBy(id = "billing_postcode") private WebElement billingZipFld;
	@FindBy(id = "billing_email") private WebElement billingEmailFld;
	@FindBy(id = "place_order") private WebElement placeOrderBtn;
	@FindBy(css = ".woocommerce-notice") private WebElement noticeTxt;
	private final By overlay = By.cssSelector(".blockUI.blockOverlay");
	
	public CheckoutPage enterBillingFirstName(String billingFirstName) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingFirstnameFld));
		element.clear();
		element.sendKeys(billingFirstName);
		return this;
	}
	
	public CheckoutPage enterBillingLastname(String billingLastName) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingLastnameFld));
		element.clear();
		element.sendKeys(billingLastName);
		return this;
	}
	
	public CheckoutPage enterbillingAddressOne(String billingAddressOne) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingAddressOneFld));
		element.clear();
		element.sendKeys(billingAddressOne);
		return this;
	}
	
	public CheckoutPage enterbillingCity(String billingCity) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingCityFld));
		element.clear();
		element.sendKeys(billingCity);
		return this;
	}
	
	public CheckoutPage selectState(String billingState) {
		//Alternate for Firefox browser, since problem with Firefox.
//		wait.until(ExpectedConditions.elementToBeClickable(billingAlternateStateDropdown)).click();
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
//				By.xpath("//li[text()='" + billingState + "']")));
		
		Select select = new Select(wait.until(ExpectedConditions.visibilityOf(billingStateDropdown)));
		select.selectByVisibleText(billingState);
		return this;
	}
	
	public CheckoutPage enterbillingZip(String billingZip) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingZipFld));
		element.clear();
		element.sendKeys(billingZip);
		return this;
	}
	
	public CheckoutPage enterbillingEmail(String billingEmail) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
		element.clear();
		element.sendKeys(billingEmail);
		return this;
	}
	
	public CheckoutPage setBillingDetails(BillingDetails billingDetails) {
		return enterBillingFirstName(billingDetails.getBillingFistName())
				.enterBillingLastname(billingDetails.getBillingLastName())
				.enterbillingAddressOne(billingDetails.getBillingAddressOne())
				.enterbillingCity(billingDetails.getBillingCity())
				.selectState(billingDetails.getBillingState())
				.enterbillingZip(billingDetails.getBillingZip())
				.enterbillingEmail(billingDetails.getBillingEmail());	
	}
	
	public CheckoutPage placeOrder() {
		waitForOverlaysToDissapear(overlay);
		wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
		return this;
	}
	
	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
	} 

}
