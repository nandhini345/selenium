package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		WebElement element;
		driver.get("https://www.bookotrip.com/");
		Thread.sleep(5000);
		element = driver
				.findElement(By.xpath("//select[@class=\"form-control cur-first mid-dspc-slt valid\"]/option[3]"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

		element.click();
		// element = driver.findElement(By.id("ddlAdult"));
//		Select oSelect = new Select(element);
//		// oSelect.selectByValue("2");
//		List<WebElement> gettingOptions = oSelect.getOptions();
//		int isize = gettingOptions.size();
//		System.out.println(isize);
//		for (int i = 0; i < isize; i++) {
//			String str = gettingOptions.get(i).getText();
//			if (str.equalsIgnoreCase("9")) {
//				System.out.println(str + "my index is" + i);
//				gettingOptions.get(i).click();
//			}
//		}
		Thread.sleep(2500);
		driver.close();

	}

}
