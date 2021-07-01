package LaunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LaunchBrowser {

	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		String url = "https://www.saucedemo.com/";
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "E:\\webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			Assert.assertTrue(false, "No Browser type sent");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);

		return driver;

	}

}
