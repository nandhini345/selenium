package SeleniumBasics;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Frameworks\\HybridFWnan\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://demoqa.com/text-box");
		WebElement element;
		element = driver.findElement(By.id("firstName"));
		element.sendKeys("viraj");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.keyDown(element, Keys.SHIFT);
		actions.sendKeys("viraj");
		actions.keyUp(Keys.SHIFT);
		actions.build().perform();
		element = driver.findElement(By.id("currentAddress"));
		element.sendKeys("13-13,arcot road ,nayan,uttarpradeh");
		actions.click(element).sendKeys("13-13,arcot road ,nayan,uttarpradeh").perform();
		actions.keyDown(element, Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.keyDown(element, Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();

		element = driver.findElement(By.id("permanentAddress"));
		actions.keyDown(element, Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
//		WebElement element;
//		driver.get("https://demoqa.com/radio-button");
//		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
//		for (int i = 0; i < radio.size(); i++) {
//			WebElement radioValues = radio.get(i);
//			String str = radioValues.getAttribute("id");
//			if (str.contentEquals("impressiveRadio")) {
//				element = driver.findElement(By.xpath("//*[@id=\"impressiveRadio\"]"));
//				Actions actions1 = new Actions(driver);
//				actions1.click(element).build().perform();
//
//			}
//			System.out.println(str);

		Thread.sleep(8000);
		driver.close();

	}

}
