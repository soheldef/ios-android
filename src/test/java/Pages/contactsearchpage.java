package Pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class contactsearchpage {
	AppiumDriver<MobileElement> driver;

	public contactsearchpage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//MobileElement el11 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
	@AndroidFindBy (id = "main_search") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeSearchField[@name=\"Search for contact\"]") 
	MobileElement searchField;

	public void search(String name) {
		searchField.sendKeys(name);
	}
}
