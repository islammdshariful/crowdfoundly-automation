package testcases;

import modules.CreateRefundRequest;
import modules.Fundraiser;
import modules.Login;
import modules.ManageRefundRequest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_Cmp_Don_Ref_Fund_App_Don_Wit_App {
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
    }
}
