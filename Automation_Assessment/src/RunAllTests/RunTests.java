package RunAllTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LaunchBrowser.LaunchBrowser;
import Tests.AutomationTest;

public class RunTests {
	public static WebDriver driver;

	@Test
	public void runAllTest()  {
		AutomationTest.testcase01login(driver);
		AutomationTest.testcase02filterLowPrice(driver);
		AutomationTest.testcase03addProducts(driver);
		AutomationTest.testcase04addtoCart(driver);
		AutomationTest.testcase05removeProductsandContinueShopping(driver);
		AutomationTest.testcase06filterPrice(driver);
		AutomationTest.testcase07addProducts(driver);
		AutomationTest.testcase08addtoCart(driver);
		AutomationTest.testcase09totalitems(driver);
		AutomationTest.testcase10checkout(driver);
	}

	// Launch Browser
	@BeforeTest
	public void openBrowser() {
		driver = LaunchBrowser.getDriver("chrome");

		System.out.println("Browser opened Successfully");

	}

	// Quit Browser
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
