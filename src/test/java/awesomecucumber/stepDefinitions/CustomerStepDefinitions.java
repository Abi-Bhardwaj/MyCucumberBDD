package awesomecucumber.stepDefinitions;

import org.openqa.selenium.WebDriver;

import awesomecucumber.constants.MyConstants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainObjects.BillingDetails;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.Given;

public class CustomerStepDefinitions {
	private final WebDriver driver;
	private TestContext context;
	
	
	public CustomerStepDefinitions(TestContext context) {
		driver = context.driver;
		this.context = context;
	}


	@Given("My billing details are")
	public void my_billing_details_are(BillingDetails billingDetails) {
		context.billingDetails = billingDetails;
	}
	
	@Given("Im guest user")
	public void im_guest_user() {
//		driver = DriverFactory.getDriver();
		new StorePage(driver).load(MyConstants.STORE);
	}

}
