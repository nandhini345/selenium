package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.bookotrip.com/";
		driver.get(url);
		Thread.sleep(4000);
		WebElement element;

		element = driver.findElement(By.id("txtFlyFrom"));
		element.sendKeys("dfw");
		// String flyfromText;
//		flyfromText = element.getAttribute("value");
//		System.out.println(flyfromText);
//		System.out.println(element.getTagName());

		element = driver.findElement(By.id("txtFlyTo"));
		element.sendKeys("chennai");
		driver.findElement(By.className("btn"));
		element.submit();

//		Thread.sleep(4000);
//		String url = "https://app.studyisland.com/cfw/login/";
//		driver.get(url);
//		driver.manage().window().maximize();
//
//		Thread.sleep(2000);
//		WebElement element;
//		driver.findElement(By.id("username")).sendKeys("DHEERAJMARDHAM@universal");
//		driver.findElement(By.id("password")).sendKeys("dj630");
//
//		// element = driver.findElement(By.id("btnSubmit"));
//		element = driver.findElement(By.linkText("Forgot Password?"));
//		element.click();
//		System.out.println(element.getTagName());
//		element.submit();

		Thread.sleep(2000);
		/*
		 * here in this programme i learnt about all the web elements and commands
		 */
	}

}
