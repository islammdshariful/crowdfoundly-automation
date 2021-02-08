package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.NewDonation;
import utils.Config;

public class GiveDonation {
    public static void donate(WebDriver driver, String cmp_type, String url) {
        if (!url.equals("")) {
            driver.get(url);
            Config.allow_cookies();
        } else {
            Config.allow_cookies();
        }

        driver.findElement(By.xpath(NewDonation.Locator.backit_contribute_xpth)).click();

        if (cmp_type.equals("reward")) {
            driver.findElement(By.xpath(NewDonation.Locator.get_now_btn_xpth)).click();
        } else {
            driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_xpth)).click();
            driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_xpth)).sendKeys(NewDonation.Text.custom_amnt_text);
            driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_nxt_btn_xpth)).click();
        }


        // Contribution Info
        driver.findElement(By.id(NewDonation.Locator.message_id)).click();
        driver.findElement(By.id(NewDonation.Locator.message_id)).sendKeys(NewDonation.Text.message_txt);

        driver.findElement(By.id(NewDonation.Locator.name_id)).click();
        driver.findElement(By.id(NewDonation.Locator.name_id)).sendKeys(NewDonation.Text.name_txt);

        driver.findElement(By.id(NewDonation.Locator.email_id)).click();
        driver.findElement(By.id(NewDonation.Locator.email_id)).sendKeys(NewDonation.Text.email_txt);

        driver.findElement(By.xpath(NewDonation.Locator.contribute_xpth)).click();


        // Contribution Payment
        driver.findElement(By.xpath(NewDonation.Locator.debit_crd_xpth)).click();

        driver.switchTo().frame(driver.findElement(By.xpath(NewDonation.Locator.debit_crd_iframe_xpth)));
        WebElement creditcardNumber = driver.findElement(By.name(NewDonation.Locator.debit_crd_num_name));
        creditcardNumber.sendKeys(NewDonation.Text.debit_crd_num_txt);
        driver.findElement(By.name(NewDonation.Locator.debit_crd_postal_name)).click();
        driver.findElement(By.name(NewDonation.Locator.debit_crd_postal_name)).sendKeys(NewDonation.Text.debit_crd_postal_txt);

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath(NewDonation.Locator.contribute_now_btn_xpth)).click();
    }
}
