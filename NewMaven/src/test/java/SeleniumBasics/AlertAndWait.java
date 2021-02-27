package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertAndWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://demoqa.com/alerts");
		driver.get("https://demoqa.com/buttons");
		WebElement element;
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		element = driver.findElement(By.id("doubleClickBtn"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

		// element = driver.findElement(By.id("alertButton"));
		// element = driver.findElement(By.id("timerAlertButton"));
		// element = driver.findElement(By.id("confirmButton"));
//		element = driver.findElement(By.id("promtButton"));
//		element.click();
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//		Alert myalert = (Alert) wait.until(ExpectedConditions.alertIsPresent());
		// Alert myalert = driver.switchTo().alert();
//		Thread.sleep(5000);
//		myalert.sendKeys("viraj mardham");
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		myalert.accept();
		Thread.sleep(7000);
		driver.close();

	}

}
