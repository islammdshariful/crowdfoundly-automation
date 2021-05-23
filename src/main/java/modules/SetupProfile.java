package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.DashboardPage;
import pom.NewDonation;
import pom.Profile;
import utils.DriverManager;
import utils.Menus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SetupProfile {
    public static void updateProfile(String usr) {
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            if (driver.findElements(By.xpath(DashboardPage.Locators.overview_txt_xpth)).size() != 0) {
                driver.findElement(By.xpath(Profile.Locator.menu_btn_xpth)).click();
                driver.findElement(By.xpath(Profile.Locator.my_prfile_btn_xpth)).click();
            }
            Menus.profileMenu.clickSettings();

            driver.findElement(By.id(Profile.Locator.bio_id)).click();
            driver.findElement(By.id(Profile.Locator.bio_id)).clear();
            driver.findElement(By.id(Profile.Locator.bio_id)).sendKeys(Profile.Text.bio_txt);

            driver.findElement(By.id(Profile.Locator.name_id)).click();

            if (usr.equals("organizer")) {
                driver.findElement(By.id(Profile.Locator.name_id)).clear();
                driver.findElement(By.id(Profile.Locator.name_id)).sendKeys(Profile.Text.org_owner_name_txt);
            } else if (usr.equals("fundraiser")) {
                driver.findElement(By.id(Profile.Locator.name_id)).clear();
                driver.findElement(By.id(Profile.Locator.name_id)).sendKeys(Profile.Text.fundraiser_name_txt);
            } else {
                driver.findElement(By.id(Profile.Locator.name_id)).clear();
                driver.findElement(By.id(Profile.Locator.name_id)).sendKeys(Profile.Text.contributor_name_txt);
            }

            driver.findElement(By.id(Profile.Locator.choose_img_id)).click();
            Thread.sleep(1000);
            if (usr.equals("organizer")) {
                Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetProfile/orgprofile_fileupload.exe");
                Thread.sleep(1000);
                driver.findElement(By.xpath(Profile.Locator.crop_img_xpth)).click();
            } else if (usr.equals("fundraiser")) {
                Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetProfile/fundprofile_fileupload.exe");
                Thread.sleep(1000);
                driver.findElement(By.xpath(Profile.Locator.crop_img_xpth)).click();
            } else {
                Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetProfile/conprofile_fileupload.exe");
                Thread.sleep(1000);
                driver.findElement(By.xpath(Profile.Locator.crop_img_xpth)).click();
            }

            driver.findElement(By.xpath(Profile.Locator.save_btn_xpth)).click();

//            driver.findElement(By.xpath(Profile.Locator.dashboard_xpth)).click();
//            Menus.clickLogouts();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
