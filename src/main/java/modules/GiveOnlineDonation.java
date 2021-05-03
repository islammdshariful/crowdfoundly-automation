package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.NewDonation;
import utils.Config;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;

public class GiveOnlineDonation {
    public static void donate(String url, String cmp_type, String tip, String log, String other_info) {
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        try {
            if (!url.equals("")) {
                driver.get(url);
                Config.allow_cookies();
            } else {
                Config.allow_cookies();
            }

            if (log.equals("yes")) {
                String cmp_url = driver.getCurrentUrl();
                System.out.println(cmp_url);
                WebDriver driver1 = DriverManager.driver;
                driver1.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                if (driver1.findElements(By.xpath(NewDonation.Locator.login_btn1_xpth)).size() != 0) {
                    driver1.findElement(By.xpath(NewDonation.Locator.login_btn1_xpth)).click();
                    System.out.println(cmp_type + " 1 a. Login to Contributor Account...");
                    Login.loginToAccount(driver, "contributor");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.get(cmp_url);
                } else if (driver1.findElements(By.xpath(NewDonation.Locator.login_btn2_xpth)).size() != 0) {
                    driver1.findElement(By.xpath(NewDonation.Locator.login_btn2_xpth)).click();
                    System.out.println(cmp_type + " 2 a. Login to Contributor Account...");
                    Login.loginToAccount(driver, "contributor");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    driver.get(cmp_url);
                }
            }


            driver.findElement(By.xpath(NewDonation.Locator.backit_contribute_xpth)).click();
            Thread.sleep(1000);

            if (cmp_type.equals("reward")) {
                driver.findElement(By.xpath(NewDonation.Locator.get_now_btn_xpth)).click();
            } else {
                driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_xpth)).click();
                driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_xpth)).sendKeys(NewDonation.Text.custom_amnt_text);
                driver.findElement(By.xpath(NewDonation.Locator.custom_amnt_nxt_btn_xpth)).click();
            }
            System.out.println(" b. Amount is set");


            if (tip.equals("yes")) {
                driver.findElement(By.id(NewDonation.Locator.tip_amnt_field_id)).click();
                driver.findElement(By.xpath(NewDonation.Locator.tip_amnt_xpth)).click();
                driver.findElement(By.xpath(NewDonation.Locator.tip_amnt_continue_btn_xpth)).click();
            }


            // Contribution Info
            driver.findElement(By.id(NewDonation.Locator.message_id)).click();
            driver.findElement(By.id(NewDonation.Locator.message_id)).sendKeys(NewDonation.Text.message_txt);

            System.out.println(" c. Information filled up");
            if (!log.equals("yes")) {
                driver.findElement(By.id(NewDonation.Locator.name_id)).click();
                driver.findElement(By.id(NewDonation.Locator.name_id)).sendKeys(NewDonation.Text.name_txt);

                driver.findElement(By.id(NewDonation.Locator.email_id)).click();
                driver.findElement(By.id(NewDonation.Locator.email_id)).sendKeys(NewDonation.Text.email_txt);
                System.out.println(" c. Information filled up");
            }

            // Additional Information
            if(other_info.equals("yes")){
                driver.findElement(By.id(NewDonation.Locator.oi_number_id)).click();
                driver.findElement(By.id(NewDonation.Locator.oi_number_id)).clear();
                driver.findElement(By.id(NewDonation.Locator.oi_number_id)).sendKeys(NewDonation.Text.oi_number_txt);

                if(cmp_type.equals("reward")){
                    driver.findElement(By.xpath(NewDonation.Locator.oi_agree_2_xpth)).click();
                }else {
                    driver.findElement(By.xpath(NewDonation.Locator.oi_agree_xpth)).click();
                }
            }

            Thread.sleep(1000);
            driver.findElement(By.xpath(NewDonation.Locator.contribute_xpth)).click();
            Thread.sleep(1000);

            // Contribution Payment
            driver.findElement(By.xpath(NewDonation.Locator.debit_crd_xpth)).click();

            Thread.sleep(1000);
            driver.switchTo().frame(driver.findElement(By.xpath(NewDonation.Locator.debit_crd_iframe_xpth)));
            WebElement creditcardNumber = driver.findElement(By.name(NewDonation.Locator.debit_crd_num_name));
            creditcardNumber.sendKeys(NewDonation.Text.debit_crd_num_txt);
            driver.findElement(By.name(NewDonation.Locator.debit_crd_postal_name)).click();
            driver.findElement(By.name(NewDonation.Locator.debit_crd_postal_name)).sendKeys(NewDonation.Text.debit_crd_postal_txt);

            driver.switchTo().parentFrame();
            System.out.println(" d. Card information fille dup");
            driver.findElement(By.xpath(NewDonation.Locator.contribute_now_btn_xpth)).click();
            Thread.sleep(4000);
            // Download PDF Flyer
//            driver.findElement(By.xpath(NewDonation.Locator.dwnld_pdf_flyer_xpth)).click();
            System.out.println(" e. PDF downloaded");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
