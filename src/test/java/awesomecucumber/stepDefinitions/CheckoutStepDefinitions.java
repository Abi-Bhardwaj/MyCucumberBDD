package awesomecucumber.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainObjects.BillingDetails;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinitions {
	
//	private final WebDriver driver;
	private final TestContext context;
	private CheckoutPage checkoutPage;
	
	public CheckoutStepDefinitions(TestContext context) {
//		driver = context.driver;
		this.context = context;
		checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
	}

	
	
	
	

	

	

	@When("I provide billing details")
	public void i_provide_billing_details() throws InterruptedException {
//	    CheckoutPage checkoutPage = new CheckoutPage(driver);
	    checkoutPage.setBillingDetails(context.billingDetails);
	}

	@When("I place an order")
	public void i_place_an_order() throws InterruptedException {
		checkoutPage.placeOrder();
	}

	@Then("The order should be placed sucessfully")
	public void the_order_should_be_placed_sucessfully() throws InterruptedException {
	    Assert.assertEquals("Thank you. Your order has been received.", new CheckoutPage(context.driver).getNotice());
	    
	}

}
