package testcases;

import modules.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pom.CampaignPage;
import pom.Profile;
import utils.Config;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.awt.*;
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
        driver.get(Urls.getURLS("root"));
        Config.allow_cookies();
        Login.loginToAccount("organizer");
        CreateCampaign.create("no", "reward", "date", "yes", "no");
    }
}
