package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.OrganizationSettingsPage;

public class SetupSocials {
    public static void setSocials(WebDriver driver) {
        driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.social_xpth)).click();

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.facebook_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.facebook_xpth)).sendKeys(OrganizationSettingsPage.SocilaText.facebook);

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.twitter_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.twitter_xpth)).sendKeys(OrganizationSettingsPage.SocilaText.twitter);

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.linkedin_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.linkedin_xpth)).sendKeys(OrganizationSettingsPage.SocilaText.linkedin);

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.instagram_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.instagram_xpth)).sendKeys(OrganizationSettingsPage.SocilaText.instagram);

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.youtube_xpth)).click();
        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.youtube_xpth)).sendKeys(OrganizationSettingsPage.SocilaText.youtube);

        driver.findElement(By.xpath(OrganizationSettingsPage.SocilaLocator.save_btn_xpth)).click();
    }
}
