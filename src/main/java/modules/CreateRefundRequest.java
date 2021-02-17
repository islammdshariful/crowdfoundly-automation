package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.NewRefundRequest;
import pom.TopbarMenu;
import utils.Menus;

public class CreateRefundRequest {
    public static void create(WebDriver driver) {
        try {
            Menus.profileMenu.clickContribution();
            driver.findElement(By.xpath(NewRefundRequest.ConLocator.action_btn_xpth)).click();
            driver.findElement(By.xpath(NewRefundRequest.ConLocator.refund_req_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.id(NewRefundRequest.ConLocator.refund_note_id)).click();
            driver.findElement(By.id(NewRefundRequest.ConLocator.refund_note_id)).sendKeys(NewRefundRequest.ConText.refund_note_txt);
            driver.findElement(By.xpath(NewRefundRequest.ConLocator.submit_btn_xpth)).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath(TopbarMenu.Profile.dropdown_menu_xpth)).click();
            Thread.sleep(1000);

//            driver.findElement(By.xpath(TopbarMenu.Profile.logout_xpth)).click();

            WebElement logout = driver.findElement(By.xpath(TopbarMenu.Profile.logout_xpth));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", logout);

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
