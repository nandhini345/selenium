package SeleniumBasics;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadFileConcept {
	WebDriver driver;
	File folder;

	@BeforeMethod
	public void setUp() {

		folder = new File(UUID.randomUUID().toString());
		// folder = new File("Downloaded from website");
		folder.mkdir();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		// prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		System.out.println("my folder path" + folder.getAbsolutePath());

		options.setExperimentalOption("prefs", prefs);

//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
		// options.merge(cap);
		driver = new ChromeDriver(options);
	}

	@Test
	public void downloadileTest() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/download");

		driver.switchTo().alert().accept();

		Thread.sleep(5000);
		WebElement element;
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a[25]"));
//		// element = driver.findElement(By.linkText("some-file.txt"));
//		element = driver.findElement(By.xpath("//a[@href=\"download/some-file.txt\"]"));
		element.click();

		Thread.sleep(5000);

//		File listofFiles[] = folder.listFiles();
//		Assert.assertTrue(listofFiles.length > 0);

	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
//		for (File file : folder.listFiles()) {
//			file.delete();
//		}
//		folder.delete();
	}
}