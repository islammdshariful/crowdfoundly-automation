package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pom.OrganizationSettingsPage;

public class SetupCrowdfundly {
    public static void allowCommision(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();

            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.commision_id)).click();
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.commision_id)).clear();
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.commision_id)).sendKeys(OrganizationSettingsPage.CrowdfundlyText.commision_txt);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void allowTips(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.allow_tip_xpth)).click();

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void autoApprovval(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.auto_approv_xpth)).click();

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void updateAutoApprovval(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.update_auto_approv_xpth)).click();

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void allowLogin(WebDriver driver){
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.allow_login_xpth)).click();

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void activeEscrow(WebDriver driver) {
        try {
            driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.crowdfundly_xpth)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.escrow_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.id(OrganizationSettingsPage.CrowdfundlyLocator.escrow_duration_id)).click();
            driver.findElement(By.id(OrganizationSettingsPage.CrowdfundlyLocator.escrow_duration_id)).clear();
            driver.findElement(By.id(OrganizationSettingsPage.CrowdfundlyLocator.escrow_duration_id)).sendKeys(OrganizationSettingsPage.CrowdfundlyText.escrow_duration_txt);
            Thread.sleep(1000);
            System.out.println("F - a: Escrow toggle ON");
            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.allow_refund_xpth)).click();
            Thread.sleep(1000);
            System.out.println("F- b: Refund toggle ON");

//            driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void saveCrowdfundly(WebDriver driver){
        driver.findElement(By.xpath(OrganizationSettingsPage.CrowdfundlyLocator.save_xpth)).click();
    }
}
