package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pom.CampaignPage;
import pom.FundraiserDashboard;
import pom.OrgPage;
import utils.Config;
import utils.Menus;
import utils.Urls;

import java.io.IOException;
import java.util.ArrayList;

public class Fundraiser {
    public static void join(WebDriver driver) {
        driver.get(Urls.getURLS("org"));
        Config.allow_cookies();

        driver.findElement(By.xpath(OrgPage.Locator.start_fund_xpth)).click();
        Config.allow_cookies();

        Login.loginToAccount(driver, "fundraiser");

        CreateCampaign.create("yes", "reward", "date", "no", "no");
        driver.get(Urls.getURLS("root"));
    }

    public static void setupPayoutMethods(WebDriver driver, String method) {
        Menus.fundraiserMenu.clickPayoutMethods();

        driver.findElement(By.xpath(FundraiserDashboard.Locator.add_new_payouts_btn_xpth)).click();

        Select payoutmethods = new Select(driver.findElement(By.id(FundraiserDashboard.Locator.slelect_mehtod_id)));
        if (method.equals("bank")) {
            payoutmethods.selectByVisibleText(FundraiserDashboard.Text.Bank_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.beneficiary_name_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.beneficiary_name_id)).sendKeys(FundraiserDashboard.Text.beneficiary_name_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.account_number_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.account_number_id)).sendKeys(FundraiserDashboard.Text.account_number_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.bank_name_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.bank_name_id)).sendKeys(FundraiserDashboard.Text.bank_name_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.branch_name_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.branch_name_id)).sendKeys(FundraiserDashboard.Text.branch_name_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.swift_code_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.swift_code_id)).sendKeys(FundraiserDashboard.Text.swift_code_txt);

            driver.findElement(By.xpath(FundraiserDashboard.Locator.country_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.country_xpth)).sendKeys(FundraiserDashboard.Text.country_name_txt);
            driver.findElement(By.xpath(FundraiserDashboard.Locator.country_xpth)).sendKeys(Keys.ENTER);

            driver.findElement(By.xpath(FundraiserDashboard.Locator.save_btn_xpth)).click();
        } else {
            payoutmethods.selectByVisibleText(FundraiserDashboard.Text.paypal_txt);

            driver.findElement(By.id(FundraiserDashboard.Locator.paypal_email_id)).click();
            driver.findElement(By.id(FundraiserDashboard.Locator.paypal_email_id)).sendKeys(FundraiserDashboard.Text.paypal_email_txt);

            driver.findElement(By.xpath(FundraiserDashboard.Locator.save_btn_xpth)).click();
        }
    }

    public static void approveCampaign(WebDriver driver) {
        Menus.fundraiserMenu.clickCampaigns();
        driver.findElement(By.xpath(CampaignPage.Locators.action_btn_xpth)).click();
        driver.findElement(By.xpath(CampaignPage.Locators.fundraiser_action_published_btn_xpth)).click();
        driver.findElement(By.xpath(CampaignPage.Locators.confirm_btn_xpth)).click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void rejectCampaign(WebDriver driver) {
        Menus.fundraiserMenu.clickCampaigns();
        driver.findElement(By.xpath(CampaignPage.Locators.action_btn_xpth)).click();
        driver.findElement(By.xpath(CampaignPage.Locators.fundraiser_action_reject_btn_xpth)).click();
        driver.findElement(By.xpath(CampaignPage.Locators.confirm_btn_xpth)).click();
    }

    public static void doDonate(WebDriver driver) {
        Menus.fundraiserMenu.clickCampaigns();
        driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[3]/a/span")).click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs.get(1));
        GiveOnlineDonation.donate("", "reward", "yes", "yes", "no");
    }

    public static void withdrawalRequest(WebDriver driver, String method) {
        Menus.fundraiserMenu.clickWalletPayouts();

        driver.findElement(By.xpath(FundraiserDashboard.Locator.new_request_btn_xpth)).click();

        driver.findElement(By.id(FundraiserDashboard.Locator.amount_id)).click();
        driver.findElement(By.id(FundraiserDashboard.Locator.amount_id)).sendKeys(FundraiserDashboard.Text.amount_txt);

        Select payoutmethods = new Select(driver.findElement(By.id(FundraiserDashboard.Locator.payment_method_id)));
        if (method.equals("bank")) {
            payoutmethods.selectByVisibleText(FundraiserDashboard.Text.payment_bank_method_txt);
        } else {
            payoutmethods.selectByVisibleText(FundraiserDashboard.Text.payment_paypal_method_txt);
        }

        driver.findElement(By.id(FundraiserDashboard.Locator.note_id)).click();
        driver.findElement(By.id(FundraiserDashboard.Locator.note_id)).sendKeys(FundraiserDashboard.Text.note_txt);

        driver.findElement(By.xpath(FundraiserDashboard.Locator.send_btn_xpth)).click();
    }

    public static void acceptWithdrawalRequest(WebDriver driver) {
        try {
            Menus.clickWalletPayouts();

            driver.findElement(By.xpath(FundraiserDashboard.Locator.action_btn_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.accept_btn_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.confirm_btn_xpth)).click();

            Thread.sleep(1000);

            driver.findElement(By.xpath(FundraiserDashboard.Locator.action_btn_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.update_btn_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.choose_img_xpth)).click();
            Thread.sleep(1000);
            Runtime.getRuntime().exec(System.getProperty("user.dir") + "/autoit/SetReceipt/receipt_fileupload.exe");
            Thread.sleep(1000);
            driver.findElement(By.xpath(FundraiserDashboard.Locator.sent_xpth)).click();
            driver.findElement(By.xpath(FundraiserDashboard.Locator.confirm_btn_xpth)).click();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
