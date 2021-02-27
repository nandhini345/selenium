package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimeMonthYear {

	public static WebElement element;
	public static WebDriver driver;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
			driver = new ChromeDriver();

			driver.get("https://www.southwest.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			element = driver.findElement(By.xpath("//input[@value=\"oneway\"]"));
			element.click();
			element = driver.findElement(By.id("LandingAirBookingSearchForm_departureDate"));
			String date = "10/02";

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value', '" + date + "');", element);
			js.executeScript("arguments[0].getAttribute('value');", element);
			// element);
			// js.executeScript("arguments[0]. click();", element);
			// js.executeAsyncScript("arguments[0].setAttribute('value', '" + date + "');",
			System.out.println("javascript working");
			// element.sendKeys("10/2/2020");
			Thread.sleep(5000);
			// driver.close();

		} catch (Exception e) {
			System.out.println("the error message" + e.getMessage().toString());
		}
	}

}
