package testcases;

import modules.GiveDonation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Urls;

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
        invokeBrowser();
//        (driver, url, campaign type, tip, login)
//        GiveDonation.donate(driver, "https://tu3testorganization1.crowdfundly.dev/campaigns/automation-donation-date-14599", "donation", "yes", "yes");
//        GiveDonation.donate(driver, "https://tu3testorganization1.crowdfundly.dev/campaigns/automation-reward-date", "reward", "yes", "yes");
        GiveDonation.donate(driver, "https://orgbyautomation.crowdfundly.dev/campaigns/automation-donation-nodate", "donation", "", "yes");
    }
}
