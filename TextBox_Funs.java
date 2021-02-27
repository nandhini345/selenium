package appFunctions;

import org.openqa.selenium.chrome.ChromeDriver;

import frameworkUtils.ConstantVariables;
import frameworkUtils.GeneralUtils;
import frameworkUtils.GlobalObjects;
import frameworkUtils.LogMessage;

public class TextBox_Funs extends GlobalObjects {

	// Description: Navigates the URL in the specified browser.

	public static void App_Navigate_Url(String strUrl) throws Exception {

		try {
			LogMessage.Info("Function_start :App_Navigate_Url");
			String strDrivePath = ConstantVariables.Chrome_Driver_Path;
			System.setProperty("webdriver.chrome.driver", strDrivePath);
			System.setProperty("webdriver.chrome.silentOutput", "true");
			gobjDriver = new ChromeDriver();
			Thread.sleep(10000);
			gobjDriver.get(strUrl);
			gobjDriver.manage().deleteAllCookies();
			Thread.sleep(5000);
			gobjDriver.manage().window().maximize();
			GlobalObjects.Load_PageFactory();

			LogMessage.HtmlReporter("Passed", "Navigated the URL: " + strUrl + " in chrome browser");
			// GeneralUtils.VerifyPageTitle("TextBox", TextBox_Page.pageTitle);

		} catch (Exception e) {

			GeneralUtils.EndExecution(e.getMessage());
			throw e;
		}

		LogMessage.Info("Function End: App_Navigate_Url");
	}

}
