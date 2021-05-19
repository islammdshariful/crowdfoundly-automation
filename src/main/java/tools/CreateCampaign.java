package tools;

import modules.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Config;
import utils.DriverManager;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class CreateCampaign {
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

        // Login to Organization Account;

        Config.quickCreate = true;

        // Login to your account
        modules.Login.loginToAccount("forusualtest+devautoorg1@gmail.com", "123456");

        // Create campaign
        for(int i = 0; i < 1; i++){
            modules.CreateCampaign.create("no", "reward", "date", "yes", "no");
            modules.CreateCampaign.create("no", "donation", "date", "yes", "no");
            modules.CreateCampaign.create("no", "donation", "nodate", "yes", "no");
            modules.CreateCampaign.create("no", "donation", "nodate", "yes", "no");
        }
    }
}
