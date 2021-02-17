package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewRefundRequest;
import utils.Menus;

import java.awt.*;

public class ManageRefundRequest {
    public static void approve(WebDriver driver) {
        try {
            Menus.clickRefunds();
            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.action_btn_xpth)).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.approve_xpth)).click();

            driver.findElement(By.id(NewRefundRequest.OrgLocator.refund_note_id)).click();
            driver.findElement(By.id(NewRefundRequest.OrgLocator.refund_note_id)).sendKeys(NewRefundRequest.OrgText.approve_refun_txt);

            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.accept_btn_xpth)).click();

            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.yes_confrim_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void decline(WebDriver driver) {
        try {
            Menus.clickRefunds();
            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.action_btn_xpth)).click();
            Thread.sleep(500);
            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.decline_xpth)).click();

            driver.findElement(By.id(NewRefundRequest.OrgLocator.cancle_note_id)).click();
            driver.findElement(By.id(NewRefundRequest.OrgLocator.cancle_note_id)).sendKeys(NewRefundRequest.OrgText.decline_refun_txt);

            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.cancel_submit_xpth)).click();

            driver.findElement(By.xpath(NewRefundRequest.OrgLocator.yes_confrim_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
