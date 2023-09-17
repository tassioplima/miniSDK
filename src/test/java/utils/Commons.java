package utils;

import appium.AppiumController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Commons extends AppiumController {

    private static Duration duration = Duration.ofSeconds(30);
    public static void waitForVisibilityElement(WebElement mobile) {
        WebDriverWait wait = new WebDriverWait(androidDriver, duration);
        wait.until(ExpectedConditions.visibilityOf(mobile));
    }

    public static void hideKeyboard(){
        if (Env.MOBILE.getEnv().equalsIgnoreCase("android")){
            androidDriver.hideKeyboard();
    } else {
            iOSDriver.hideKeyboard();
        }
    }

}
