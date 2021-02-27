package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement element;

		element = driver.findElement(By.id("windowButton"));
		element.click();

//		int i = handles.size();
//		System.out.println(i);
//		String firstWinHandle = driver.getWindowHandle();
//		System.out.println(firstWinHandle);
//		handles.remove(firstWinHandle);
//		String secondWinHandle = handles.iterator().next();
//
//		System.out.println(secondWinHandle);
//		driver.switchTo().window(secondWinHandle);
//
//		driver.switchTo().window(firstWinHandle);
//		System.out.println(firstWinHandle);
//		Thread.sleep(5000);
//		driver.close();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		int windownumber = 0;
		String newWindowHanle = null;
		for (String strnew : handles) {
			if (windownumber == 1) {
				newWindowHanle = strnew;
				System.out.println(newWindowHanle);
				driver.switchTo().window(newWindowHanle);
				Thread.sleep(5000);
				driver.close();
			}
			windownumber++;

		}
	}
}
