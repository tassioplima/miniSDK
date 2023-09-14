package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.jupiter.api.Assertions;
import utils.Commons;

public class PageMini extends PageBase{

    private MobileDriver<MobileElement> driver;

    public PageMini(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    @AndroidFindBy(id = "interstitialTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement interstitial;

    @AndroidFindBy(id = "interstitialCurrentStateTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement interstitialStatus;

    @AndroidFindBy(id = "interstitialButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement interstitialButton;

    @AndroidFindBy(id = "bannerTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement bannerText;

    @AndroidFindBy(id = "bannerCurrentStateTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement bannerStatus;

    @AndroidFindBy(id = "bannerButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement bannerButton;

    @AndroidFindBy(id = "imageView2")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement interstitialAd;

    @AndroidFindBy(id = "closeButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement closeButton;

    public void openInterstitialAd(){
        this.interstitialButton.click();
        Commons.waitForVisibilityElement(interstitialAd);
        this.interstitialAd.isDisplayed();
        this.closeButton.click();
    }

    public void validateStatusInterstitial(){
        Commons.waitForVisibilityElement(interstitialStatus);
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
        Commons.waitForVisibilityElement(closeButton);
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