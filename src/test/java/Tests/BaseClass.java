package Tests;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {

		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability("platformName", "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-55546");
			caps.setCapability(MobileCapabilityType.UDID, "");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability(MobileCapabilityType.APP, "");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "");
			caps.setCapability("appPackage", "com.google.android.calculator");
			caps.setCapability("appActivity", "com.android.calculator2.Calculator");


			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,caps);
			//      For browser URL Get
			//		driver.get("http://www.ally.com");
			//      driver.close();
		}

		catch(Exception exp){
			System.out.println("Cause is :"+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();

		}
	}

	@AfterSuite
	public void teardown() {
		driver.quit();

	}

}
