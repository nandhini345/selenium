package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		int i = title.length();
		String url = driver.getCurrentUrl();
		int j = url.compareTo("https://www.google.com");
		String pagesource = driver.getPageSource();
		int x = pagesource.length();

		System.out.println(title + "length of the title" + i + "page source length" + x);
		System.out.println(j);

		Thread.sleep(2500);
		driver.close();

	}

}
