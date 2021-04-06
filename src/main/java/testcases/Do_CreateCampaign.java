package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class Do_CreateCampaign {
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
        modules.Login.loginToAccount(driver, "organizer");
//        (driver, category, duration, other_info, do donation)
        modules.CreateCampaign.create(driver, "donation", "nodate", "no", "yes");
//        modules.CreateCampaign.create(driver, "donation", "date", "yes", "no");
//        modules.CreateCampaign.create(driver, "reward", "nodate", "yes", "no");
//        modules.CreateCampaign.create(driver, "reward", "date", "yes", "no");
//        modules.CreateCampaign.create(driver, "donation", "nodate", "no", "no");
//        modules.CreateCampaign.create(driver, "reward", "nodate", "no", "no");
    }
}