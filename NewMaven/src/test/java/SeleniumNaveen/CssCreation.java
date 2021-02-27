package SeleniumNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CssCreation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\IEDriver.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

		Thread.sleep(3000);
		driver.close();
		// driver.quit();

	}

}
