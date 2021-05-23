package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewCampaign;
import pom.OrganizationSettingsPage;
import utils.DriverManager;
import utils.Menus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SetupOrgMedia {

    public static void all(WebDriver driver){
        Menus.clickSettings();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.media_xpth)).click();
        SetupOrgMedia.logo(driver);
        SetupOrgMedia.fav(driver);
        SetupOrgMedia.cover(driver);
        SetupOrgMedia.slider(driver);
    }
    public static void logo(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.logo_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetLogo/logo_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.logo_crop_xpth)).click();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void fav(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.favicon_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetFav/fav_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.fav_crop_xpth)).click();
        } catch (InterruptedException  | IOException e) {
            e.printStackTrace();
        }
    }

    public static void cover(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.cover_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetCover/cover_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.cover_img_crop_xpth)).click();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void slider(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetSlider/slider_fileupload_1.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_img_crop_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_more_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetSlider/slider_fileupload_2.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_img_crop_xpth)).click();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeMedia() {
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Menus.clickSettings();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.media_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_logo_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_confirm_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_fav_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_confirm_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_cover_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_confirm_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_slider2_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_confirm_xpth)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_slider1_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.remove_confirm_xpth)).click();
    }
}
