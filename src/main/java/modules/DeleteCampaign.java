package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pom.CampaignPage;
import utils.DriverManager;
import utils.Menus;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class DeleteCampaign {
    public static void deleteCampaign(WebDriver driver) {
        try {
            driver.get(Urls.dev);
            Menus.clickCampaigns();
            Thread.sleep(1000);

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(1000);

            WebDriver driver1 = DriverManager.driver;
            driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            int i = 1;
            while (driver1.findElements(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + i + "]/td[7]/div/div[1]/button/div/img")).size() != 0) {
                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + i + "]/td[7]/div/div[1]/button/div/img")).click();
                Thread.sleep(1000);
                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + i + "]/td[7]/div/div[1]/ul/li[4]/button")).click();
                Thread.sleep(1000);
                driver1.findElement(By.xpath(CampaignPage.Locators.confirm_dlt_btn_xpth)).click();
                i++;
            }
//            driver.findElement(By.xpath(CampaignPage.Locators.action_btn_xpth)).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath(CampaignPage.Locators.action_dlt_btn_xpth)).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath(CampaignPage.Locators.confirm_dlt_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
