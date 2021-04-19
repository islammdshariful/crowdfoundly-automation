package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewDonation;
import utils.Menus;

public class GiveOfflineDonation {
    public static void donate(WebDriver driver, String isAnonymous) {
        Menus.clickCampaigns();

        try {
            driver.findElement(By.xpath(NewDonation.OfflineLocator.action_btn_xpth)).click();
            driver.findElement(By.xpath(NewDonation.OfflineLocator.manage_xpth)).click();

            driver.findElement(By.xpath(NewDonation.OfflineLocator.offline_con_xpth)).click();
            driver.findElement(By.xpath(NewDonation.OfflineLocator.add_btn_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.id(NewDonation.OfflineLocator.name_id)).click();
            driver.findElement(By.id(NewDonation.OfflineLocator.name_id)).sendKeys(NewDonation.OfflineText.name_txt);
            driver.findElement(By.id(NewDonation.OfflineLocator.email_id)).click();
            driver.findElement(By.id(NewDonation.OfflineLocator.email_id)).sendKeys(NewDonation.OfflineText.email_txt);
            driver.findElement(By.id(NewDonation.OfflineLocator.address_id)).click();
            driver.findElement(By.id(NewDonation.OfflineLocator.address_id)).sendKeys(NewDonation.OfflineText.address_txt);
            driver.findElement(By.id(NewDonation.OfflineLocator.amount_id)).click();
            driver.findElement(By.id(NewDonation.OfflineLocator.amount_id)).sendKeys(NewDonation.OfflineText.amount_txt);

            if (isAnonymous.equals("yes")) {
                driver.findElement(By.xpath(NewDonation.OfflineLocator.do_anonymous_xpth)).click();
            }

            driver.findElement(By.xpath(NewDonation.OfflineLocator.add_con_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
