package testcases;

import modules.*;
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
        Config.setEnv("dev"); //for DEV: dev & LIVE: live
        invokeBrowser();
        driver.get(Urls.getURLS("root"));
        Config.allow_cookies();

        // Login to Organization Account
        Login.loginToAccount(driver, "organizer");
        System.out.println("A. Login to organization");

        if (Config.dev) {
            // Create Subscription
            CreateSubscription.createSubs(driver, "plus");
            System.out.println("B. Subscription created");

            // Create Organization
            Menus.profileMenu.clickSubscription();
            Menus.profileMenu.clickAllPlans();
            CreateOrganization.create(driver);
            System.out.println("C. Organization Created");

            // Setup media
            SetupOrgMedia.all(driver);

            // Set up payment gateway
            SetupPaymentGateway.paymentGateway(driver);
            System.out.println("D. payment Gatway Setup Completed");

            // Set up Tips
            SetupCrowdfundly.allowTips(driver);
            System.out.println("E. Allow tips Activated");

            // Set up   Login
            SetupCrowdfundly.allowLogin(driver);
            System.out.println("E1. Allow Login Activated");

            //Set up Refund
            SetupCrowdfundly.activeEscrow(driver);
            System.out.println("F. Escrow Activated");

            // Save Crowdfundly
            SetupCrowdfundly.saveCrowdfundly(driver);
        }

        // Create Campaign - Donation
        modules.CreateCampaign.create("no", "donation", "nodate", "yes", "yes");
        System.out.println("G. Create Campaign - Donation: COMPLETED");

        // Ask for Refund
        driver.get(Urls.getURLS("root")); // for app.crowdfundly.io/.dev: root, Subscribe: subs, LTD: ltd
        Menus.clickLogouts();
        Login.loginToAccount(driver, "contributor");
        System.out.println("H. Login to Contributor");
        CreateRefundRequest.create(driver);
        System.out.println("I. Refund Request Sent");

        // Login to Organization Account
        Login.loginToAccount(driver, "organizer");
        System.out.println("J. Organization Login");

        // Manage Refund
        ManageRefundRequest.approve(driver);
        System.out.println("K. Refund Request Approved");

//        // Again Create Campaign - Donation with date
//        modules.CreateCampaign.create(driver, "no", "donation", "date", "yes", "yes");
//        System.out.println("L. Create Campaign - Reward");
//
//        // Again Create Campaign - Reward with no date
//        driver.get(Urls.getURLS("root"));
//        Menus.clickCampaigns();
//        modules.CreateCampaign.create(driver, "no", "reward", "nodate", "yes", "yes");
//        System.out.println("M. Create Campaign - Reward with date");
//
//        // Again Create Campaign - Reward with date
//        driver.get(Urls.getURLS("root"));
//        Menus.clickCampaigns();
//        modules.CreateCampaign.create(driver, "no", "reward", "date", "yes", "yes");
//        System.out.println("N. Create Campaign - Reward with date");
//
        // Go to Campagin Page
        driver.get(Urls.getURLS("root")); // for app.crowdfundly.io/.dev: root, Subscribe: subs, LTD: ltd
        Menus.clickCampaigns();
        System.out.println("O. Navigated to Campaign page");

        // Delete Campaign
        DeleteCampaign.deleteAllCampaign(driver);
        System.out.println("P. Campaign Deleted Successfully");

//        // Delete Organization
//        DeleteAccounts.deleteOrganization(driver);
//        System.out.println("P. Organization Deleted Successfully");
    }
}
