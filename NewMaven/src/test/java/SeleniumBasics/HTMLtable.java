package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Frameworks\\NewMaven\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/dheeraj/Desktop/basicTable.html");
		WebElement element;
//		int rowSize = 2, colSize = 3;
//		element = driver.findElement(By.xpath("/html/body/table/tbody/tr[" + rowSize + "]/td[" + colSize + "]"));
//		String str;
//		str = element.getText();
//		System.out.println(str);

		for (int i = 1; i <= 3; i++) {
			element = driver.findElement(By.xpath("/html/body/table/tbody/tr[ 3]/td[" + i + "]"));

			String str;
			str = element.getText();
			if (str.equalsIgnoreCase("Jackson")) {
				for (int j = 1; j <= 3; j++) {
					element = driver.findElement(By.xpath("/html/body/table/tbody/tr[ 3]/td[" + j + "]"));
					str = element.getText();
					System.out.println(str);
				}
				break;
			}
		}
		Thread.sleep(2500);
		driver.close();

	}

}
