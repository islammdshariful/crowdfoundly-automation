package testcases;

import modules.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_All {
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
        driver.get(Urls.dev);
        Config.allow_cookies();

        // Login to Organization Account
        Login.loginToAccount(driver, "organizer");

        // Create Subscription
        CreateSubscription.createSubs(driver, "plus");

        // Create Organization
        Menus.profileMenu.clickSubscription();
        Menus.profileMenu.clickAllPlans();
        CreateOrganization.create(driver);

        // Set up payment gateway
        SetupPaymentGateway.paymentGateway(driver);

        // Set up Tips
        SetupCrowdfundly.allowTips(driver);

        //Set up Refund
        SetupCrowdfundly.activeEscrow(driver);

        // Create Campaign - Donation
        modules.CreateCampaign.create(driver, "donation", "nodate", "yes");

//        driver.get(Urls.dev);
//        Menus.clickCampaigns();

        // Ask for Refund
        driver.get(Urls.dev);
        Menus.clickLogouts();
        Login.loginToAccount(driver, "contributor");
        CreateRefundRequest.create(driver);

        // Login to Organization Account
        Login.loginToAccount(driver, "organizer");

        // Manage Refund
        ManageRefundRequest.approve(driver);

        // Again Create Campaign - Reward
        modules.CreateCampaign.create(driver, "reward", "nodate", "yes");

        // Again Create Campaign - Reward with date
        driver.get(Urls.dev);
        Menus.clickCampaigns();
        modules.CreateCampaign.create(driver, "reward", "date", "yes");

        // Again Create Campaign - Reward with date
        driver.get(Urls.dev);
        Menus.clickCampaigns();
        modules.CreateCampaign.create(driver, "donation", "date", "yes");

        // Go to Campagin Page
        driver.get(Urls.dev);
        Menus.clickCampaigns();

        // Delete Campaign
        DeleteCampaign.deleteCampaign(driver);

        // Delete Organization
//        DeleteAccounts.deleteOrganization(driver);
    }
}
