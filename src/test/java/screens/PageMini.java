package screens;

import appium.AppiumController;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


public class PageMini extends PageBase{

    public PageMini(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    public PageMini(IOSDriver iosDriver) {
        super(iosDriver);
    }

    @AndroidFindBy(id = "interstitialTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement interstitial;

    @AndroidFindBy(id = "interstitialCurrentStateTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement interstitialStatus;

    @AndroidFindBy(id = "interstitialButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement interstitialButton;

    @AndroidFindBy(id = "bannerTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement bannerText;

    @AndroidFindBy(id = "bannerCurrentStateTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement bannerStatus;

    @AndroidFindBy(id = "bannerButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement bannerButton;

    @AndroidFindBy(id = "imageView2")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement interstitialAd;

    @AndroidFindBy(id = "closeButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement closeButton;

    public void openInterstitialAd(){
        this.interstitialButton.click();
        this.interstitialAd.isDisplayed();
        this.closeButton.click();
    }

    public void validateStatusInterstitial(){
        String statusInterstitial = interstitialStatus.getText();
        Assertions.assertEquals("Ad Dismissed", statusInterstitial);
    }

    public void openBannerAd(){
        this.bannerButton.click();
    }

    public void validateStatusBanner(){
        String statusBanner =  bannerStatus.getText();
        Assertions.assertEquals("Showing...", statusBanner);
    }

    public void closeBannerValidateStatus(){
        this.closeButton.click();
        String statusBanner =  bannerStatus.getText();
        Assertions.assertEquals("Ad Dismissed", statusBanner);
    }

    public void loadStatusInterstitial(){
        String status = this.interstitialStatus.getText();
        Assertions.assertEquals("Starting", status);
    }

    public void loadStatusBanner(){
        String status = this.bannerStatus.getText();
        Assertions.assertEquals("Starting", status);
    }

}