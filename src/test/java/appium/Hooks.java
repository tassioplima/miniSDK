package appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import utils.Print;

public class Hooks extends AppiumController{

    @BeforeEach
    public void setUp() {
        try {
            startAppium();
        } catch (Exception e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }

    @AfterEach
    public void tearDown(TestInfo info) {
        try {
            Print.takeScreenShot(info);
            quitDriver();
        } catch (Exception e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }

}