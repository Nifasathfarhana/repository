package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LaunchBrowser.LaunchBrowser;

public class AutomationTest {

	// Test for Login
	@Test
	public static void testcase01login(WebDriver driver) {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
	}

	// Select Price Low to High
	@Test
	public static void testcase02filterLowPrice(WebDriver driver) {
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select filterselect = new Select(filter);
		filterselect.selectByVisibleText("Price (low to high)");
	}

	// Select Products
	@Test
	public static void testcase03addProducts(WebDriver driver) {
		WebElement addtocart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
		String firstselectedProduct = addtocart.getAttribute("name");
		System.out.println("First Selected Product is: " + firstselectedProduct.substring(12));

		addtocart.click();

		WebElement addtocart1 = driver
				.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
		String secondselectedProduct = addtocart1.getAttribute("name");
		System.out.println("Second Selected Product is: " + secondselectedProduct.substring(12));
		addtocart1.click();

	}

	// Add to Cart and Checkout
	@Test
	public static void testcase04addtoCart(WebDriver driver) {
		WebElement clickcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		clickcart.click();

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();

		driver.navigate().back();
	}

	// Remove Products and Continue Shopping
	@Test
	public static void testcase05removeProductsandContinueShopping(WebDriver driver) {
		WebElement removeProduct = driver.findElement(By.id("remove-sauce-labs-onesie"));
		String productremoved = removeProduct.getAttribute("name");
		System.out.println("Removed Product is: " + productremoved.substring(7));
		removeProduct.click();

		WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
		String TextMessage = continueShopping.getText();
		continueShopping.click();
		System.out.println(TextMessage + " Button is clicked");

	}

	// Select Price High to Low
	@Test
	public static void testcase06filterPrice(WebDriver driver) {
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select filterselect = new Select(filter);
		filterselect.selectByIndex(3);

	}

	// Select Products
	@Test
	public static void testcase07addProducts(WebDriver driver) {
		WebElement addtocart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
		String selectedProduct = addtocart.getAttribute("name");
		System.out.println("Selected Product is: " + selectedProduct.substring(12));
		addtocart.click();
	}

	// Addtocart and Checkout
	@Test
	public static void testcase08addtoCart(WebDriver driver) {
		WebElement clickcart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		clickcart.click();

	}

	// Total items added
	@Test
	public static void testcase09totalitems(WebDriver driver) {
		List<WebElement> totalitems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for (WebElement item : totalitems) {
			System.out.println("Items Added: " + item.getText());

		}

	}

	// Checkout
	public static void testcase10checkout(WebDriver driver) {

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();

		System.out.println("Checkout is Clicked");

	}

}
