package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		String url = "https://phptravels.com/demo/";

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.findElement(By.linkText("Login")).click();

		Thread.sleep(4000);

		String parentWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> I1 = handles.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();

			if (!parentWindow.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
			}

		}

		Thread.sleep(4000);

		driver.findElement(By.id("inputEmail")).sendKeys("bhayijakatya@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("hsdfsjudf");

		driver.findElement(By.id("login")).click();

		String message = driver.findElement(By.xpath("/html/body/div/h2")).getText();

		System.out.println(message);

		Thread.sleep(2500);

	}

}
