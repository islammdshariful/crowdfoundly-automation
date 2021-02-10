package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pom.NewReward;

import java.io.IOException;

public class CreateReward {
    public static void create(WebDriver driver, String shipping) {

        try {
            // Reward Title
            driver.findElement(By.id(NewReward.Locator.rwd_title_id)).click();
            driver.findElement(By.id(NewReward.Locator.rwd_title_id)).sendKeys(NewReward.Text.rwd_title_txt);

            // Regular Price
            driver.findElement(By.id(NewReward.Locator.rwd_regular_price_id)).click();
            driver.findElement(By.id(NewReward.Locator.rwd_regular_price_id)).sendKeys(NewReward.Text.rwd_regular_price_txt);

            // Reward Price
            driver.findElement(By.id(NewReward.Locator.rwd_offer_price_id)).click();
            driver.findElement(By.id(NewReward.Locator.rwd_offer_price_id)).sendKeys(NewReward.Text.rwd_offer_price_txt);

            // Stock
            driver.findElement(By.id(NewReward.Locator.rwd_stock_id)).click();
            driver.findElement(By.id(NewReward.Locator.rwd_stock_id)).sendKeys(NewReward.Text.rwd_stock_txt);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,666)", "");
            Thread.sleep(1000);

            // Shipping
            if (shipping.equals("yes")) {
                driver.findElement(By.id(NewReward.Locator.shipping_id)).click();
            } else {
//                driver.findElement(By.id(NewReward.Locator.noshipping_id)).click();
                driver.findElement(By.xpath(NewReward.Locator.noshipping_xpth)).click();
            }

            // Image
            driver.findElement(By.id(NewReward.Locator.rwd_img_id)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/CreateReward/rwd_fileupload.exe");
//            Runtime.getRuntime().exec("C:\\Users\\shari\\IdeaProjects\\CROWDFUNDLY\\autoit\\CreateReward\\rwd_fileupload.exe");
            driver.findElement(By.xpath(NewReward.Locator.img_crp_xpth)).click();

            // Describe Reward
            driver.findElement(By.id(NewReward.Locator.rwd_des_id)).click();
            driver.findElement(By.id(NewReward.Locator.rwd_des_id)).sendKeys(NewReward.Text.rwd_des_txt);

            // Create Reward
            driver.findElement(By.xpath(NewReward.Locator.create_rwd_xpth)).click();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
