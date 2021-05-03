package testcases;

import modules.GiveOnlineDonation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class Do_Donation {
    WebDriver driver = null;

    public void invokeBrowser() {
        driver = DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCase() {
        Config.setEnv("dev"); //for DEV: dev & LIVE: live
        invokeBrowser();
//        (driver, url, campaign type, tip, login, other_info)
        GiveOnlineDonation.donate("https://orgbyautomation.crowdfundly.app/campaigns/automation-reward-date-49199", "reward", "yes", "yes", "no");
    }
}
