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
    public static void deleteAllCampaign(WebDriver driver) {
        try {
            driver.get(Urls.getURLS("root"));
            Menus.clickCampaigns();
            Thread.sleep(1000);

//            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 321)");
            Thread.sleep(1000);

            WebDriver driver1 = DriverManager.driver;
            driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            int xpth = 1;
            while (driver1.findElements(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).size() != 0) {
                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).click();
                Thread.sleep(1000);
                String camStatus = driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/ul/li[4]/button")).getText();

                if (camStatus.equals("Draft")) {
                    driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).click();
                    xpth++;
                    continue;
                }

                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/ul/li[4]/button")).click();
                Thread.sleep(1000);
                driver1.findElement(By.xpath(CampaignPage.Locators.confirm_dlt_btn_xpth)).click();
                xpth++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void deleteCampaign(WebDriver driver, int camCount) {
        try {
            driver.get(Urls.getURLS("root"));
            Menus.clickCampaigns();
            Thread.sleep(1000);

//            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 321)");
            Thread.sleep(1000);

            WebDriver driver1 = DriverManager.driver;
            driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            int xpth = 1;
            int count = 1;
            while (driver1.findElements(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).size() != 0) {
                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).click();
                Thread.sleep(1000);
                String camStatus = driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/ul/li[4]/button")).getText();

                if (camStatus.equals("Draft")) {
                    driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/button/div/img")).click();
                    xpth++;
                    continue;
                }

                driver1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[" + xpth + "]/td[7]/div/div[1]/ul/li[4]/button")).click();
                Thread.sleep(1000);
                driver1.findElement(By.xpath(CampaignPage.Locators.confirm_dlt_btn_xpth)).click();
                xpth++;
                if (count == camCount) {
                    break;
                }
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
