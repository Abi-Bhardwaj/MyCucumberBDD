package awesomecucumber.hooks;

import org.openqa.selenium.WebDriver;

import awesomecucumber.context.TestContext;
import awesomecucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	private WebDriver driver;
	private final TestContext context;
	
	public MyHooks(TestContext context) {
		this.context = context;
	}
	
	@Before
	public void before(Scenario scenario) throws Exception {
		System.out.println("THREAD ID: " + Thread.currentThread().getId() + "," + 
	"SCENARIO NAME: "+ scenario.getName());
		driver = DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
		context.driver = driver;
//		Here the first argument will take the browser from mvn command 
//		and if not browser is specified in command, it will take chrome.
	}
	
	@After
	public void after(Scenario scenario) {
		driver.quit();
	} 
	
//	https://www.udemy.com/course/selenium-java-test-framework/?referralCode=3798296A64D1305BCA73
//		https://www.udemy.com/course/rest-assured-api-automation/?referralCode=94A1AD1B45228C9D6012
	
}
