package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.studyisland.com/cfw/login/");
		driver.manage().window().maximize();
		WebElement element;
		element = driver.findElement(By.id("username"));
		element.sendKeys("DHEERAJMARDHAM@universal");
		element = driver.findElement(By.id("password"));
		element.sendKeys("dj630");
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		element = driver.findElement(By.id("btnSubmit"));
		element.click();
		element = driver
				.findElement(By.xpath("//*[@id=\"app-body\"]/app-root/div/app-sub-header/div/div/div[1]/div[1]/h3"));
		System.out.println("before wait ");
		// WE ARE ASKING THE DRIVER TO WAIT FOR SOME AMOUNT OF TIME TO CHECK THE
		// VISIBILITY OF THE ELEMENT.
		element = wait.until(ExpectedConditions.visibilityOf(element));
		String nameoftheTab;
		nameoftheTab = element.getAttribute("value");
		System.out.println("after wait " + nameoftheTab);

		String handle = driver.getWindowHandle();
		System.out.println("my window name is " + handle);

		Set<String> handles = driver.getWindowHandles();

		System.out.println(handles);

		// Pass a window handle to the other window

//		for (String handle1 : driver.getWindowHandles()) {
//
//			System.out.println(handle1);
//
//			driver.switchTo().window(handle1);
//
//		}
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		driver.navigate().back();
		Thread.sleep(1500);
		driver.close();
		driver.quit();

	}

}
