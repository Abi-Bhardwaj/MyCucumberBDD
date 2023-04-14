package awesomecucumber.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainObjects.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreStepDefinitions {
//	private final WebDriver driver;
	private StorePage storePage;
	
	public StoreStepDefinitions(TestContext context) {
//		driver = context.driver;
		storePage = PageFactoryManager.getStorePage(context.driver);
		
	}

	@Given("Im on store page")
	public void imOnStorePage() {
//	    driver = DriverFactory.getDriver();
	    storePage.load(EndPoint.STORE.url);
	}

	@When("I add a {product} to the cart")
	public void iAddAToTheCart(Product product) throws InterruptedException {
	    storePage.addToCart(product.getName());
	}
	
	@Given("I have product in the cart")
	public void i_have_product_in_the_cart() throws InterruptedException {
		storePage.addToCart("Blue Shoes");
	}
	

}
