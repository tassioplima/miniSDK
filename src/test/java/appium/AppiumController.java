package appium;

import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import utils.AndroidCapabilities;
import utils.Env;
import utils.Utils;
import utils.iOSCapabilities;

public class AppiumController {
    public static final String server = "https://" + Env.AUTOMATE_USERNAME.getEnv() + ":" + Env.AUTOMATE_ACCESS_KEY.getEnv() + "@hub-cloud.browserstack.com/wd/hub";
    public static final String farm = "https://" + Utils.pathCapabilitie().getUserName() + ":" + Utils.pathCapabilitie().getAccessKey() + "@hub-cloud.browserstack.com/wd/hub";
    public static final String local = "http://127.0.0.1:4723/";
    public static AndroidDriver androidDriver;
    public static IOSDriver iOSDriver;

    public void startAppium() throws Exception{
            if (Env.MOBILE.getEnv().equalsIgnoreCase("android")) {

                if (Env.BOOLENV.getBool()){
                    androidDriver = new AndroidDriver(new URL(server), AndroidCapabilities.getAndroidCapabilities());
                } else {
                    androidDriver = new AndroidDriver(new URL(local), AndroidCapabilities.getAndroidCapabilitiesLocal());
                }
            } else if (Env.MOBILE.getEnv().equalsIgnoreCase("ios")) {
                if (Env.BOOLENV.getBool()){
                    iOSDriver = new IOSDriver(new URL(server), iOSCapabilities.getIOSCapabilities());
                } else {
                    iOSDriver = new IOSDriver(new URL(local), iOSCapabilities.getIOSCapabilitiesLocal());
                }
            }
    }

    public static void quitDriver() {
        try {
            if (Env.MOBILE.getEnv().equalsIgnoreCase("android") && androidDriver != null) {
                androidDriver.quit();
            } else if (Env.MOBILE.getEnv().equalsIgnoreCase("ios") && iOSDriver != null) {
                iOSDriver.quit();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }
}