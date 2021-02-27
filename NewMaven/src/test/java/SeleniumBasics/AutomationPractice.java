package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutomationPractice {
	@Test
	public void automationPractice() throws InterruptedException {

		WebDriver driver;
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		element.click();
		List<WebElement> addtocart = driver
				.findElements(By.xpath("//*[@class=\"button ajax_add_to_cart_button btn btn-default\"]"));

		int sizeofcart = addtocart.size();
		System.out.println("Number of add to carts" + sizeofcart);

		JavascriptExecutor gobjJScript = (JavascriptExecutor) driver;
		element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[3]/div[2]/form"));
		gobjJScript.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);

		element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

		Thread.sleep(5000);
		element = driver.findElement(
				By.xpath("//*[@class=\"product_list row list\"]/li[2]/div/div/div[3]/div/div[2]/a[1]/span"));

		element.click();
//		for (int i = 1; i < sizeofcart; i++) {
//
//			element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + i + "]/div/div/div[2]/h5/a"));
//
//			String dressmessage = element.getText();
//			if (dressmessage.contains("Blouse")) {
//				element = driver.findElement(
//						By.xpath("// *[@id=\"center_column\"]/ul/li[" + i + "]/div/div/div[3]/div/div[2]/a[1]/span"));
//
//				element.click();
//				break;
//			}
//		}

		Thread.sleep(5000);
		driver.close();

	}
}
