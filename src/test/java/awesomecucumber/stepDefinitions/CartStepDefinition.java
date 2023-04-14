package awesomecucumber.stepDefinitions;

import org.testng.Assert;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainObjects.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CartStepDefinition {

//	private final WebDriver driver;
	private final CartPage cartPage;
	
	public CartStepDefinition(TestContext context) {
//		driver = context.driver;
		cartPage = PageFactoryManager.getCartPage(context.driver);
	}
	
	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {
//	    new CartPage(driver).checkout();
	    cartPage.checkout();

	}

	@Then("I should see {int} {product} in the cart")
	public void iShouldSeeInTheCart(int qty, Product product) {
//		CartPage cartPage = new CartPage(driver);
	    Assert.assertEquals(product.getName(), cartPage.getProductName());
	    Assert.assertEquals(qty, Integer.parseInt(cartPage.getProductQuantity()));
	}
}
