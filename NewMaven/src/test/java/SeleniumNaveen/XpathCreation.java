package SeleniumNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCreation {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Frameworks\\HybridFWnan\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("");

	}

}
