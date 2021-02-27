package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		WebElement element;
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("The alert message is" + alert.getText());

		Thread.sleep(1500);
		driver.close();
	}

}
