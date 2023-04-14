package awesomecucumber.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import awesomecucumber.constants.EndPoint;
import awesomecucumber.constants.MyConstants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainObjects.BillingDetails;
import awesomecucumber.domainObjects.Product;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef {
	 WebDriver driver;
	 
	 public MyStepDef(TestContext context) {
		 driver = context.driver;
	 }
	
	

	
	
	//-------------------------SCENARIO 2--------------------------------//

	private BillingDetails billingDetails;
	
	
	
	
}
