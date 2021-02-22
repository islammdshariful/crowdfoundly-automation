package tools;

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
        invokeBrowser();
        driver.get(Urls.dev);
        Config.allow_cookies();

        Config.quickCreate = true;

        // Login to your account
        modules.Login.loginToAccount(driver, "forusualtest+fr1@gmail.com", "123456");

        // Create campaign
        for(int i = 0; i < 3; i++){
            modules.CreateCampaign.create(driver, "reward", "nodate", "no");
        }
    }
}
