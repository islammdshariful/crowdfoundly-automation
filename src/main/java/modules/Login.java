package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.LoginPage;
import utils.Config;
import utils.Credentials;

public class Login {
    public static void loginToAccount(WebDriver driver, String email, String pass) {

        driver.findElement(By.id(LoginPage.Locators.email_id)).click();
        driver.findElement(By.id(LoginPage.Locators.email_id)).clear();
        driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(email);

        driver.findElement(By.id(LoginPage.Locators.pass_id)).click();
        driver.findElement(By.id(LoginPage.Locators.pass_id)).clear();
        driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(pass);

        if (Config.dev) {
            driver.findElement(By.xpath(LoginPage.Locators.dev_signin_btn_xpth)).click();
        } else {
            driver.findElement(By.xpath(LoginPage.Locators.live_signin_btn_xpth)).click();
        }
    }

    public static void loginToAccount(WebDriver driver, String usr) {
        try {
            Thread.sleep(1000);
            driver.findElement(By.id(LoginPage.Locators.email_id)).click();
            driver.findElement(By.id(LoginPage.Locators.email_id)).clear();
            if (usr.equals("contributor")) {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.getEmail(usr));
            } else if (usr.equals("organizer")) {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.getEmail(usr));
            } else if (usr.equals("fundraiser")) {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.getEmail(usr));
            } else {
                driver.findElement(By.id(LoginPage.Locators.email_id)).sendKeys(Credentials.getEmail(usr));
            }

            driver.findElement(By.id(LoginPage.Locators.pass_id)).click();
            driver.findElement(By.id(LoginPage.Locators.pass_id)).clear();
            if (usr.equals("contributor")) {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.getPassword(usr));
            } else if (usr.equals("organizer")) {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.getPassword(usr));
            } else if (usr.equals("fundraiser")) {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.getPassword(usr));
            } else {
                driver.findElement(By.id(LoginPage.Locators.pass_id)).sendKeys(Credentials.getPassword(usr));
            }

            System.out.println(usr + " - data fill up completed");
//            if (Config.dev) {
//                if (usr.equals("contributor") || usr.equals("organizer") || usr.equals("fundraiser")) {
//                    driver.findElement(By.xpath(LoginPage.Locators.dev_signin_btn_xpth)).click();
//                    System.out.println(usr + " - signing button clicked");
//                }
//            } else {
//                if (usr.equals("contributor") || usr.equals("organizer") || usr.equals("fundraiser")) {
//                    driver.findElement(By.xpath(LoginPage.Locators.live_signin_btn_xpth)).click();
//                    System.out.println(usr + " - signing button clicked");
//                }
//            }
            driver.findElement(By.xpath(LoginPage.Locators.signin_btn_xpth)).click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
