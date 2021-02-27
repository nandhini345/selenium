package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testChrome {

	WebDriver driver;

	@Test
	public void setUp() {
		String str = "www.google.com";
		// String strResult;

		driver.get(str);

	}

}
