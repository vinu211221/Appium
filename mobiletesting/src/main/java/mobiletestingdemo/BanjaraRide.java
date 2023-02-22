package mobiletestingdemo;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class BanjaraRide {
	AndroidDriver<AndroidElement> driver;
  @Test
  public void test1() throws MalformedURLException, InterruptedException {
		 driver = cap();
		 WebDriverWait wait= new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.Button")));
	     driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ENGLISH\")")).click();
	     Thread.sleep(3000);
	     driver.findElement(MobileBy.className("android.widget.RelativeLayout")).click();
	     Thread.sleep(3000);
	     driver.findElement(MobileBy.id("com.forbinary.banjararide:id/editText_search")).sendKeys("India");
	     driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
	     driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("9987443522");
	     driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	     driver.findElement(MobileBy.className("android.widget.ImageView")).click();
	     
	     
	     //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search...\")")).click();
	     //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
	     Thread.sleep(3000);
	     //driver.findElement(MobileBy.AccessibilityId("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("9987443522");
	    // Thread.sleep(3000);
	    // driver.findElement(MobileBy.AccessibilityId("com.forbinary.banjararide:id/imgNext")).click();
	  
}
  @BeforeTest
   public AndroidDriver<AndroidElement> cap() throws MalformedURLException {
             DesiredCapabilities dc = new DesiredCapabilities();
			 dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
			 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
			 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			 return driver;
			 
				}
  

  @AfterTest
  public void afterTest() {
  }

}
