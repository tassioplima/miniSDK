import appium.AppiumController;
import appium.Hooks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageMini;

public class AppTest extends Hooks{
    public PageMini pageMini;

    @BeforeEach
    public void setup(){
        pageMini = new PageMini(androidDriver);
    }
    @Test
    @Disabled("Flaky test")
    @DisplayName("Validate change of interstitial status")
    public void changeStatusInterstitial() {
        pageMini.openInterstitialAd();
        pageMini.validateStatusInterstitial();
    }
    @Test
    @Disabled("Banner close button can't be found")
    @DisplayName("Validate change of banner status")
    public void changeStatusBanner() {
        pageMini.openBannerAd();
        pageMini.validateStatusBanner();
        pageMini.closeBannerValidateStatus();
    }
    @Test
    @DisplayName("Validate starting status Interstitial")
    public void validateStatusInterstitial() {
        pageMini.loadStatusInterstitial();
    }
    @Test
    @DisplayName("Validate starting status Banner")
    public void validateStatusBanner() {
        pageMini.loadStatusBanner();
    }

}