package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Frameworks\\HybridFWnan\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://demoqa.com/upload-download");
		WebElement element;
		// element = driver.findElement(By.id("downloadButton"));
		// element.click();
		element = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));

		Actions action = new Actions(driver);
		action.click(element).build().perform();
		StringSelection str = new StringSelection("C:\\Users\\dheeraj\\Desktop\\sample.bmp");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(8000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(8000);
		driver.close();

	}

}
