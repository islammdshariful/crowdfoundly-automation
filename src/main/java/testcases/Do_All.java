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
        Login.loginToAccount("organizer");
        System.out.println("A. Login to organization");

//            // Create Subscription
//            CreateSubscription.createSubs(driver, "plus");
//            System.out.println("B. Subscription created");
//
//            // Create Organization
//            Menus.profileMenu.clickSubscription();
//            Menus.profileMenu.clickAllPlans();
//            CreateOrganization.create(driver);
//            System.out.println("C. Organization Created");
//
//            // Setup media
//            SetupOrgMedia.all(driver);
//
//            // Set up payment gateway
//            SetupPaymentGateway.paymentGateway(driver);
//            System.out.println("D. payment Gatway Setup Completed");
//
//            // Set up Tips
//            SetupCrowdfundly.allowTips(driver);
//            System.out.println("E. Allow tips Activated");
//
//            // Set up   Login
//            SetupCrowdfundly.allowLogin(driver);
//            System.out.println("E1. Allow Login Activated");
//
//            //Set up Refund
//            SetupCrowdfundly.activeEscrow(driver);
//            System.out.println("F. Escrow Activated");
//
//            // Save Crowdfundly
//            SetupCrowdfundly.saveCrowdfundly(driver);


        // Create Campaign - Donation
        modules.CreateCampaign.create("no", "donation", "nodate", "no", "yes");
        System.out.println("G. Create Campaign - Donation: COMPLETED");

        // Ask for Refund
        driver.get(Urls.getURLS("root")); // for app.crowdfundly.io/.dev: root, Subscribe: subs, LTD: ltd
        Menus.clickLogouts();
        Login.loginToAccount("contributor");
        System.out.println("H. Login to Contributor");
        CreateRefundRequest.create(driver);
        System.out.println("I. Refund Request Sent");

        // Login to Organization Account
        Login.loginToAccount("organizer");
        System.out.println("J. Organization Login");

        // Manage Refund
        ManageRefundRequest.approve(driver);
        System.out.println("K. Refund Request Approved");

//        // Again Create Campaign - Donation with date
//        modules.CreateCampaign.create(driver, "no", "donation", "date", "no", "yes");
//        System.out.println("L. Create Campaign - Reward");
//
//        // Again Create Campaign - Reward with no date
//        driver.get(Urls.getURLS("root"));
//        Menus.clickCampaigns();
//        modules.CreateCampaign.create(driver, "no", "reward", "nodate", "no", "yes");
//        System.out.println("M. Create Campaign - Reward with date");
//
//        // Again Create Campaign - Reward with date
//        driver.get(Urls.getURLS("root"));
//        Menus.clickCampaigns();
//        modules.CreateCampaign.create(driver, "no", "reward", "date", "no", "yes");
//        System.out.println("N. Create Campaign - Reward with date");
//
//        // Go to Campagin Page
//        driver.get(Urls.getURLS("root")); // for app.crowdfundly.io/.dev: root, Subscribe: subs, LTD: ltd
//        Menus.clickCampaigns();
//        System.out.println("O. Navigated to Campaign page");
//
//        // Delete Campaign
//        DeleteCampaign.deleteAllCampaign(driver);
//        System.out.println("P. Campaign Deleted Successfully");

        // Join a Fundraiser
        Menus.clickLogouts();
        Fundraiser.join(driver);

        // Approve Campaign
        Menus.clickLogouts();
        Login.loginToAccount("organizer");
        Fundraiser.approveCampaign(driver);

        // Donate Campaign
        Fundraiser.doDonate(driver);
        driver.get(Urls.getURLS("root"));

        // Request a withdrawal request
        Menus.clickLogouts();
        Login.loginToAccount("fundraiser");
        Fundraiser.withdrawalRequest(driver, "bank");

        // Approve withdrawal request
        Menus.clickLogouts();
        Login.loginToAccount("organizer");
        Fundraiser.acceptWithdrawalRequest(driver);

        Menus.clickLogouts();

        // Setup Profile Picture
        Login.loginToAccount("organizer");
        SetupProfile.updateProfile("organizer");

//        // Delete Organization
//        DeleteAccounts.deleteOrganization(driver);
//        System.out.println("P. Organization Deleted Successfully");
    }
}
