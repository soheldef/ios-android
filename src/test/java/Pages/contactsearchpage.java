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
		System.out.println("this is 4");
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//MobileElement el11 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
	@AndroidFindBy (id = "main_search") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeSearchField[@name=\"Search for contact\"]") 
	MobileElement searchField;

	public void search(String name) {
		System.out.println("this is 6");
		searchField.clear();
		searchField.sendKeys(name);
	}
	
	@AndroidFindBy (id = "name") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Search results\"]/XCUIElementTypeCell\"]") 
	MobileElement validsearchresult;
	
	public String validsearchresult() {
		System.out.println("this is 7");
		String name = validsearchresult.getText();
		return name;
	}
	
	@AndroidFindBy (id = "main_text") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"No Results\"]") 
	MobileElement invalidsearchresult;
	
	public String invalidsearchresult() {
		System.out.println("this is 8");
		String name = invalidsearchresult.getText();
		return name;
	}

	
}
