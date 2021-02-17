package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pom.DashboardPage;
import pom.LoginPage;
import utils.Credentials;

public class Login {
    public static void loginToAccount(WebDriver driver) {
        SoftAssert softassert = new SoftAssert();

        softassert.assertEquals(driver.findElement(By.xpath(LoginPage.Locators.header_xpth)).getText(), LoginPage.Texts.header_txt);
        softassert.assertEquals(driver.findElement(By.xpath(LoginPage.Locators.des_xpth)).getText(), LoginPage.Texts.des_xpth);

        softassert.assertEquals(driver.findElement(By.xpath(LoginPage.Locators.signup_txt_xpth)).getText(), LoginPage.Texts.signup_txt);

        driver.findElement(By.id(LoginPage.Locators.email_id)).click();
        driver.findElement(By.id(LoginPage.Locators.email_id)).clear();
        driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.dev.email);

        driver.findElement(By.id(LoginPage.Locators.pass_id)).click();
        driver.findElement(By.id(LoginPage.Locators.pass_id)).clear();
        driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.dev.password);

        driver.findElement(By.xpath(LoginPage.Locators.signin_btn_xpth)).click();

        //Check Dashboard
        softassert.assertEquals(driver.findElement(By.xpath(DashboardPage.Locators.overview_txt_xpth)).getText(), DashboardPage.Texts.overview_txt);

        softassert.assertAll();
    }

    public static void loginToAccount(WebDriver driver, String usr) {
        SoftAssert softassert = new SoftAssert();

        try {
            Thread.sleep(1000);
            driver.findElement(By.id(LoginPage.Locators.email_id)).click();
            driver.findElement(By.id(LoginPage.Locators.email_id)).clear();
            if (usr.equals("contributor")) {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.dev.con_email);
            } else if (usr.equals("organizer")) {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.dev.org_email);
            } else {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.dev.fund_email);
            }

            driver.findElement(By.id(LoginPage.Locators.pass_id)).click();
            driver.findElement(By.id(LoginPage.Locators.pass_id)).clear();
            if (usr.equals("contributor")) {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.dev.con_password);
            } else if (usr.equals("organizer")) {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.dev.org_password);
            } else {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.dev.fund_password);
            }

            driver.findElement(By.xpath(LoginPage.Locators.signin_btn_xpth)).click();

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
