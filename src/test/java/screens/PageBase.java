package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.*;

public class PageBase {

    public PageBase(AndroidDriver androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }
    public PageBase(IOSDriver iosDriver){
        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
    }
}