package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebElement element;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Frameworks\\HybridFWnan\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// element =
		// driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));

		// element = driver.findElement(By.xpath("//input[@name=\"q\"]"));

//		element = driver.findElement(By.xpath("//*[@class=\"RNNXgb\"]/div[1]/div[2]/input"));
//		element.sendKeys("testing");
//		Thread.sleep(5000);
//		List<WebElement> pagesize = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
//		int size;
//		size = pagesize.size();
//		System.out.println(size);
//		for (int i = 0; i < size; i++) {
//			String search = pagesize.get(i).getText();
//			if (search.contentEquals("testing")) {
//
//				element = driver.findElement(By.xpath("//*[@class=\"FPdoLc tfB0Bf\"]/center/input[1]"));
//				Thread.sleep(5000);
//				Actions action = new Actions(driver);
//				// action.click().build().perform();
//				action.click(element).build().perform();
//				Thread.sleep(4000);
//				break;
//			}
//
//		}

		element = driver.findElement(By.xpath("//*[@class=\"gb_zg gb_i\"]/div[1]/a"));
		element.click();

		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();

	}

}
