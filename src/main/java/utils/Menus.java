package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Menus {

    public static void clickDashboard() {
        String dashboard_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[1]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(dashboard_xpth)).click();
    }

    public static void clickCampaigns() {
        String campaigns_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[2]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(campaigns_xpth)).click();
    }

    public static void clickOnlineContributors() {
        String online_contributors_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[3]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(online_contributors_xpth)).click();
    }

    public static void clickOfflineContributors() {
        String offline_contributors_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[4]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(offline_contributors_xpth)).click();
    }

    public static void clickFundraiser() {
        String Fundraiser_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[5]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Fundraiser_xpth)).click();
    }

    public static void clickWalletPayouts() {
        String walletpayouts_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[6]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(walletpayouts_xpth)).click();
    }

    public static void clickRefunds() {
        String refunds_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[7]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(refunds_xpth)).click();
    }

    public static void clickTeamAccounts() {
        String team_accounts_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[8]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(team_accounts_xpth)).click();
    }

    public static void clickRoles() {
        String roles_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[9]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(roles_xpth)).click();
    }

    public static void clickCatagories() {
        String settings_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[10]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(settings_xpth)).click();
    }



    public static void clickSettings() {
        String settings_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[11]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(settings_xpth)).click();
    }

    public static void clickReports() {
        String reports_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[12]/a/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(reports_xpth)).click();
    }

    public static void clickLogouts() {
        String logouts_xpth = "//*[@id=\"dashboard\"]/div/div[5]/div/div[3]/ul/li/div/span";
        WebDriver driver = DriverManager.driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(logouts_xpth)).click();
    }

    public static class profileMenu {

        public static void clickStory() {
            String story_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[1]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(story_xpth)).click();
        }

        public static void clickSettings() {
            String settings_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[2]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(settings_xpth)).click();
        }

        public static void clickContribution() {
            String contributions_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[3]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(contributions_xpth)).click();
        }

        public static void clickRefund() {
            String refunds_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[4]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(refunds_xpth)).click();
        }

        public static void clickAllLTDLicense() {
            String ltd_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[5]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(ltd_xpth)).click();
        }

        public static void clickSubscription() {
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            String subs_xpth = "//*[@id=\"treeview5\"]/div/div[2]";
            driver.findElement(By.xpath(subs_xpth)).click();
        }

        public static void clickAllPlans() {
            String allplans_xpth = "//*[@id=\"treeview5\"]/ul/li[1]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(allplans_xpth)).click();
        }

        public static void clickPaymentHistory() {
            String paymhistory_xpth = "//*[@id=\"treeview5\"]/ul/li[2]/a/div[2]";
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath(paymhistory_xpth)).click();
        }
    }
}
