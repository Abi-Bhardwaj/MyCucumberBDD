package awesomecucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
//	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver initializeDriver(String browser) throws Exception {
		WebDriver driver;
		switch(browser) {
			case "chrome":
//				System.setProperty("webdriver.chrome.driver", "E:\\Work\\Softwares & Tools\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
//				ChromeOptions chromeOptions = new ChromeOptions(); 
//				chromeOptions.addArguments("--remote-allow-origins=*");
//				driver = new ChromeDriver(chromeOptions);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
//				System.setProperty("webdriver.gecko.driver", "E:\\Work\\Softwares & Tools\\BrowserDrivers\\FireFoxDriver\\geckodriver.exe");
//				FirefoxOptions options = new FirefoxOptions();
//		        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		        driver = new FirefoxDriver(options);
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			default:
				throw new IllegalStateException("INVALID BROWSER " + browser);
			}		    
	    driver.manage().window().maximize();
//	    DriverFactory.driver.set(driver);
	    return driver;
	}
	
//	public static WebDriver getDriver() {
//		return driver.get();
//	}

}
