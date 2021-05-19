package testcases;

import modules.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_Org_SetOrg {
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
}
