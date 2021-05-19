package testcases;

import modules.Fundraiser;
import modules.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_JoinFunraiser {
    WebDriver driver = null;

    public void invokeBrowser() {
        driver = DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() {
        Config.setEnv("dev"); //for DEV: dev & LIVE: live
        invokeBrowser();
        Fundraiser.join(driver);
        Menus.clickLogouts();
        Login.loginToAccount("organizer");
        Fundraiser.approveCampaign(driver);
        Fundraiser.doDonate(driver);
        driver.get(Urls.getURLS("root"));
        Menus.clickLogouts();
        Login.loginToAccount("fundraiser");
    }


}
