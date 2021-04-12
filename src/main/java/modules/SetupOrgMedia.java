package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewCampaign;
import pom.OrganizationSettingsPage;

import java.io.IOException;

public class SetupOrgMedia {
    public static void logo(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.logo_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateCampaign/SetLogo/logo_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fav(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.favicon_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateCampaign/SetFav/fav_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cover(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.cover_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateCampaign/SetCover/cover_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void slider(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateCampaign/SetSlider/slider_fileupload_1.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.MediaLocator.slider_more_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateCampaign/SetSlider/slider_fileupload_2.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
