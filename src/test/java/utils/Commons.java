package utils;

import appium.AppiumController;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commons extends AppiumController {

    public static void waitForVisibilityElement(MobileElement mobile) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void hideKeyboard(){
        driver.hideKeyboard();
    }
    
}
