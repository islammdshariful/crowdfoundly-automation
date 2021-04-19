package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.OrganizationSettingsPage;
import utils.Menus;

public class SetupPolices {
    public static void setPolicy(WebDriver driver) {
        driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.policies_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.privacyPolicy_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.termsConditions_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.refundPolicy_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.privacyPolicy_des_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.privacyPolicy_des_xpth)).sendKeys(OrganizationSettingsPage.PoliciesText.privacyPolicy_txt);

        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.termsConditions_des_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.termsConditions_des_xpth)).sendKeys(OrganizationSettingsPage.PoliciesText.termsConditions_txt);

        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.refundPolicy_des_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.refundPolicy_des_xpth)).sendKeys(OrganizationSettingsPage.PoliciesText.refundPolicy_txt);

        driver.findElement(By.xpath(OrganizationSettingsPage.PoliciesLocator.save_btn_xpth)).click();
    }
}
