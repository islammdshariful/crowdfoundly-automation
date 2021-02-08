package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.CampaignPage;
import pom.NewCampaign;
import utils.Config;
import utils.Menus;

import java.io.IOException;

public class CreateCampaign {
    public static void create(WebDriver driver, String cmp_type, String duration, String do_donate) {
        Menus.clickCampaigns();
        try {
            // Add new campaign
            driver.findElement(By.xpath(CampaignPage.Locators.add_new_xpth)).click();

            // Campaign type
            if (cmp_type.equals("reward")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_type_reward_xpth)).click();
            } else {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_type_donation_xpth)).click();
            }

            // Campaign Catagory
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_catagory_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_cat_nxt_btn_xpth)).click();


            // Write title
            driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).click();
            driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).clear();
            if (cmp_type.equals("reward") && duration.equals("nodate")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).sendKeys(NewCampaign.Text.rwd_nodate_cmp_title_txt);
            } else if (cmp_type.equals("reward") && duration.equals("date")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).sendKeys(NewCampaign.Text.rwd_date_cmp_title_txt);
            } else if (cmp_type.equals("donation") && duration.equals("nodate")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).sendKeys(NewCampaign.Text.donate_nodate_cmp_title_txt);
            } else {
                driver.findElement(By.xpath(NewCampaign.Locator.cam_title_xpth)).sendKeys(NewCampaign.Text.donate_date_cmp_title_txt);
            }
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_title_nxt_btn_xpth)).click();


            // Target amount
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_trgt_amount_xpth)).sendKeys(NewCampaign.Text.ammout_txt);
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_trgt_amt_nxt_btn_xpth)).click();


            // Duration
            if (duration.equals("date")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cmp_deadline_xpth)).click();
                driver.findElement(By.id(NewCampaign.Locator.cmp_target_date_id)).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(NewCampaign.Locator.next_month_xpth)).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(NewCampaign.Locator.date_xpth)).click();
            } else {
                driver.findElement(By.xpath(NewCampaign.Locator.cmp_nodeadline_xpth)).click();
            }

            driver.findElement(By.xpath(NewCampaign.Locator.cmp_dur_nxt_btn_xpth)).click();


            // Gallery
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_upload_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec("C:\\Users\\shari\\IdeaProjects\\CROWDFUNDLY\\autoit\\CreateCampaign\\cmp_fileupload.exe");
            driver.findElement(By.xpath(NewCampaign.Locator.img_crop_xpth)).click();
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_gal_nxt_btn_xpth)).click();


            // Video
            driver.findElement(By.id(NewCampaign.Locator.cmp_upload_vdo_id)).click();
            driver.findElement(By.id(NewCampaign.Locator.cmp_upload_vdo_id)).sendKeys(NewCampaign.Text.youtube_vdo_link);
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_add_vdo_xpth)).click();
            driver.findElement(By.xpath(NewCampaign.Locator.cmp_vdo_nxt_btn)).click();


            // Story
            // H1
            driver.findElement(By.xpath(NewCampaign.Locator.stry_h1_xpth)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_h1_field_id)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_h1_field_id)).sendKeys(NewCampaign.Text.header_txt);

            // Add quote
            driver.findElement(By.xpath(NewCampaign.Locator.stry_add_quote_xpth)).click();

            // Quote
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_quote_xpth)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_quote_field_id)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_quote_field_id)).sendKeys(NewCampaign.Text.quote_txt);

            // Add Body text
            driver.findElement(By.xpath(NewCampaign.Locator.stry_add_body_xpth)).click();

            // Body text
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_bodytxt_xpth)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_bodytxt_field_id)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_bodytxt_field_id)).sendKeys(NewCampaign.Text.body_txt);

            // Add Image
            driver.findElement(By.xpath(NewCampaign.Locator.stry_add_img_xpth)).click();

            // Image
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_xpth)).click();
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_field_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec("C:\\Users\\shari\\IdeaProjects\\CROWDFUNDLY\\autoit\\CreateCampaign\\Story\\stry_fileupload.exe");
            driver.findElement(By.xpath(NewCampaign.Locator.stry_img_crp_xpth)).click();

            // Add Video
            driver.findElement(By.xpath(NewCampaign.Locator.stry_add_vdo_xpth)).click();

            // Video
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewCampaign.Locator.stry_vdo_xpth)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_vdo_field_id)).click();
            driver.findElement(By.id(NewCampaign.Locator.stry_vdo_field_id)).sendKeys(NewCampaign.Text.vimeo_vdo_link);
            Thread.sleep(1000);


            if (cmp_type.equals("reward")) {
                driver.findElement(By.xpath(NewCampaign.Locator.cmp_sty_nxt_btn_xpth)).click();

                driver.findElement(By.xpath(NewCampaign.Locator.add_new_reward_xpth)).click();
                CreateReward.create(driver, "no");
                driver.findElement(By.xpath(NewCampaign.Locator.published_btn_xpth)).click();

            } else {
                driver.findElement(By.xpath(NewCampaign.Locator.published_btn_xpth)).click();
            }

            driver.findElement(By.xpath(NewCampaign.Locator.public_preview_xpth)).click();


            if (do_donate.equals("yes")) {
                GiveDonation.donate(driver, cmp_type, "");
            } else {
                Config.allow_cookies();
            }

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}