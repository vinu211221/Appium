package mobiletestingdemo;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
//import io.appium.java_client.functions.ExpectedCondition;

public class KhanAccademy extends KhanAccademyCap {
		AndroidDriver<AndroidElement> driver;
		
    @Test
	 public void test1() throws MalformedURLException, InterruptedException {
	 driver = cap();
	 WebDriverWait wait= new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.TextView")));
     driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")")).click();
     driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")")).click();
     wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.LinearLayout")));
     driver.findElements(MobileBy.className("android.widget.LinearLayout")).get(1).click();
	 //WebDriverWait wait = new WebDriverWait(driver, 30);
	 //wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("welcomeCardSignInButton")));
	 //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sing in\")")).click();
	 //WebDriverWait wait = new WebDriverWait(driver, 10);
	 //wait.until(ExpectedCondition.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sing in\")"))).click();
	 //Thread.sleep(3000);
	 //driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sing in with Google\")")).click();
	// Thread.sleep(3000);
	 //driver.findElement(MobileBy.id("com.google.android.gms:id/account_display_name")).click();
	 Thread.sleep(3000);
	 driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
	 Thread.sleep(3000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Economics\")")).click();
	 Thread.sleep(3000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Finance and capital markets\")")).click();
	 Thread.sleep(3000);
	 driver.findElement(MobileBy.AccessibilityId("Bookmarks tab")).click(); 
	 Thread.sleep(3000);
	 driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	 driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	 
	 
	 
		}

}

