package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitCommands {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bookotrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element;
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Flight-Search-Submit")));
		element.click();

	}

}
