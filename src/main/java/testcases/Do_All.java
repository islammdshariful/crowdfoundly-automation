package testcases;

import modules.CreateOrganization;
import modules.CreateSubscription;
import modules.DeleteAccounts;
import modules.SetupPaymentGateway;
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
    public void nxCommentsTestCase() {
        invokeBrowser();
        driver.get(Urls.dev);
        Config.allow_cookies();
        modules.Login.loginToAccount(driver, "organizer");
        CreateSubscription.createSubs(driver, "plus");
        Menus.profileMenu.clickSubscription();
        Menus.profileMenu.clickAllPlans();
        CreateOrganization.create(driver);
        SetupPaymentGateway.paymentGateway(driver);
        modules.CreateCampaign.create(driver, "donation", "nodate", "yes");
        driver.get(Urls.dev);
        Menus.clickCampaigns();
        DeleteAccounts.deleteOrganization(driver);
    }
}
