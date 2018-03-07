import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;

public class TestTest {

	public static AppiumDriver driver = null;


	@Test
	public static void webAppTest() throws MalformedURLException{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPhone");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("app", "settings");
		capabilities.setCapability("udid", "3bc7dd8b5c22793740afe7d216afb5ba2933e394");
		//capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		driver.findElementByName("Mobile").click();
	}
	
	
}
