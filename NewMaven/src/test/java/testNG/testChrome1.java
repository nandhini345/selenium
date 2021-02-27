package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testChrome1 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("launching the chrome before method");
	}

	@Test
	public void openChrome() {

		String url = "https://www.Google.com/";
		System.out.println("launching the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		String title = "Google";
		String actual;
		actual = driver.getTitle();
		Assert.assertEquals(actual, title);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method after execution");
	}
}
