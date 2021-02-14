package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.CampaignPage;
import utils.Menus;
import utils.Urls;

public class DeleteCampaign {
    public static void deleteCampaign(WebDriver driver) {
        try {
            driver.get(Urls.dev);
            Menus.clickCampaigns();
            Thread.sleep(1000);

            driver.findElement(By.xpath(CampaignPage.Locators.action_btn_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(CampaignPage.Locators.action_dlt_btn_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(CampaignPage.Locators.confirm_dlt_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
