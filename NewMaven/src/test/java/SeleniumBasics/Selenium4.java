package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// String url = "https://www.bookotrip.com/";
//		driver.get(url);
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
//		radio.size();
//		for (int i = 0; i < radio.size(); i++) {
//			WebElement localRadio = radio.get(i);
//			String str = localRadio.getAttribute("name");
//			System.out.println("The radio buttons " + radio.get(i).getAttribute("name") + str);
//		}
//		boolean b;
//		b = radio.get(0).isSelected();
//		System.out.println(radio.get(1).getAttribute("name") + b);
//
//		if (b == false) {
//			WebElement oneWayRadio = driver.findElement(By.xpath("//*[@id=\"frmIndex\"]/div[2]/label[2]/span"));
//
//			oneWayRadio.click();
//		} else {
//			WebElement multiCity = driver.findElement(By.xpath("//*[@id=\"frmIndex\"]/div[2]/label[3]/span"));
//			multiCity.click();
//		}
//
//		Thread.sleep(2500);
//		driver.close();

		driver.get("https://www.saucedemo.com/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		int cartsize = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div")).size();
		System.out.println("cartsize is" + cartsize);
		// WebElement element;

	}

}
