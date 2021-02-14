package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.OrganizationSettingsPage;
import utils.Menus;

public class SetupPaymentGateway {
    public static void paymentGateway(WebDriver driver) {
        Menus.clickSettings();
        driver.findElement(By.xpath(OrganizationSettingsPage.TabsLocator.payment_xpth)).click();

        try {
            // Strip
            driver.findElement(By.xpath(OrganizationSettingsPage.PaymentLocator.strip_acc_drpdwn_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(OrganizationSettingsPage.PaymentLocator.strip_individual_xpth)).click();

            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.strip_key_id)).click();
            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.strip_key_id)).sendKeys(OrganizationSettingsPage.PaymentText.strip_key_txt);

            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.stripe_secret_id)).click();
            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.stripe_secret_id)).sendKeys(OrganizationSettingsPage.PaymentText.stripe_secret_txt);

            driver.findElement(By.xpath(OrganizationSettingsPage.PaymentLocator.strip_save_btn_xpth)).click();

            driver.findElement(By.xpath(OrganizationSettingsPage.PaymentLocator.active_strip_btn_xpth)).click();
            Thread.sleep(1000);

            // PayPal
            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.paypal_client_id)).click();
            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.paypal_client_id)).sendKeys(OrganizationSettingsPage.PaymentText.paypal_client_id_txt);

            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.paypal_client_secret_id)).click();
            driver.findElement(By.id(OrganizationSettingsPage.PaymentLocator.paypal_client_secret_id)).sendKeys(OrganizationSettingsPage.PaymentText.paypal_client_secret_txt);

            driver.findElement(By.xpath(OrganizationSettingsPage.PaymentLocator.paypal_save_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
