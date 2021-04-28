package testcases;

import modules.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_Test {
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

//        Fundraiser.join(driver);
//        Menus.clickLogouts();
//        Login.loginToAccount(driver, "organizer");
//        Fundraiser.approveCampaign(driver);
//        Fundraiser.doDonate(driver);
//        driver.get(Urls.getURLS("root"));
//        Menus.clickLogouts();
//        Login.loginToAccount(driver, "fundraiser");

        driver.get(Urls.getURLS("root"));
        Config.allow_cookies();
        Login.loginToAccount(driver, "fundraiser");
//        Fundraiser.setupPayoutMethods(driver, "bank");
        Fundraiser.withdrawalRequest(driver, "bank");




//        driver.get(Urls.getURLS("root"));
//        Config.allow_cookies();

        // Login to Organization Account
//        Login.loginToAccount(driver, "organizer");
//        System.out.println("A. Login to organization");

        if (Config.dev) {
            // Create Subscription
//            CreateSubscription.createSubs(driver, "plus");
//            System.out.println("B. Subscription created");
//
//            // Create Organization
//            Menus.profileMenu.clickSubscription();
//            Menus.profileMenu.clickAllPlans();
//            CreateOrganization.create(driver);
//            System.out.println("C. Organization Created");
//
//            JoinFundraising.join(driver);
        }
    }
}
