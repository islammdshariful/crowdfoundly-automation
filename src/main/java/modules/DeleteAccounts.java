package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pom.OrganizationSettingsPage;
import utils.Menus;

public class DeleteAccounts {
    public static void deleteOrganization(WebDriver driver) {
        try {
            Menus.clickSettings();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,743)", "");
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.BasicLocator.delete_org_btn_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.BasicLocator.confirm_delete_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
