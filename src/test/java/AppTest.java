import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageMini;

public class AppTest extends Hooks{
    public PageMini pageMini;

    @Test
    @DisplayName("Validate change of interstitial status")
    public void changeStatusInterstitial() {
        pageMini = new PageMini(driver);
        pageMini.openInterstitialAd();
        pageMini.validateStatusInterstitial();
    }

    @DisplayName("Validate change of banner status")
    public void changeStatusBanner() {
        pageMini = new PageMini(driver);
        pageMini.openBannerAd();
        pageMini.validateStatusBanner();
        pageMini.closeBannerValidateStatus();
    }
    @Test
    @DisplayName("Validate starting status Interstitial")
    public void validateStatusInterstitial() {
        pageMini = new PageMini(driver);
        pageMini.loadStatusInterstitial();
    }
    @Test
    @DisplayName("Validate starting status Banner")
    public void validateStatusBanner() {
        pageMini = new PageMini(driver);
        pageMini.loadStatusBanner();
    }

}