package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculator1 {
	AppiumDriver<MobileElement> driver;

	public calculator1(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;

	}

	public void numb()
	{
		System.out.println(driver);
	}
	MobileElement el1 = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
	public void number1()
	{
		el1.click();
	}

	MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	public void plus()
	{
		el2.click();
	}
	MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
	public void number2()
	{
		el2.click();
	}


}
