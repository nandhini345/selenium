package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://demoqa.com/links");
		// driver.get("https://demoqa.com/tabs");
		driver.get("https://demoqa.com/tool-tips");
		WebElement element;
//		element = driver.findElement(By.id("simpleLink"));
//		element.click();
//		Set<String> hanldes = driver.getWindowHandles();
//		int index = 0;
//		int currentWindow = 1;
//		String currentWindowname;
//		for (String handle : hanldes) {
//			if (index == currentWindow) {
//				currentWindowname = handle;
//				driver.switchTo().window(currentWindowname);
//				break;
//			}
//			index++;
//		}

//		element = driver.findElement(By.id("demo-tab-origin"));
//		element.click();
//		element = driver.findElement(By.id("demo-tab-use"));
//		element.click();
		element = driver.findElement(By.id("toolTipButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		WebElement element1;
		element1 = driver.findElement(By.className("tooltip-inner"));
		String str = element1.getText();
		System.out.println(str);
		Thread.sleep(5000);
		driver.close();
	}

}
