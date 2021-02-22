package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.CampaignPage;

import java.util.concurrent.TimeUnit;

public class Menus {

    public static void clickDashboard() {
        WebDriver driver = DriverManager.driver;
        WebElement dashboard_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[1]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dashboard_xpth);
    }

    public static void clickCampaigns() {
        WebDriver driver = DriverManager.driver;
        WebElement campaigns_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[2]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", campaigns_xpth);
    }

    public static void clickOnlineContributors() {
        WebDriver driver = DriverManager.driver;
        WebElement oncontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[3]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", oncontributor_xpth);
    }

    public static void clickOfflineContributors() {
        WebDriver driver = DriverManager.driver;
        WebElement offcontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[4]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", offcontributor_xpth);
    }

    public static void clickFundraiser() {
        WebDriver driver = DriverManager.driver;
        WebElement fundraiser_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[5]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", fundraiser_xpth);
    }

    public static void clickWalletPayouts() {
        WebDriver driver = DriverManager.driver;
        WebElement walletpayout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[6]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", walletpayout_xpth);
    }

    public static void clickRefunds() {
        WebDriver driver = DriverManager.driver;
        WebElement refunds_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[7]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", refunds_xpth);
    }

    public static void clickTeamAccounts() {
        WebDriver driver = DriverManager.driver;
        WebElement team_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[8]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", team_xpth);
    }

    public static void clickRoles() {
        WebDriver driver = DriverManager.driver;
        WebElement roles_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[9]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", roles_xpth);
    }

    public static void clickCatagories() {
        WebDriver driver = DriverManager.driver;
        WebElement catagories_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[10]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", catagories_xpth);
    }



    public static void clickSettings() {
        WebDriver driver = DriverManager.driver;
        WebElement settings_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[11]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", settings_xpth);
    }

    public static void clickReports() {
        WebDriver driver = DriverManager.driver;
        WebElement report_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[12]/a/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", report_xpth);
    }

    public static void clickLogouts() {
        WebDriver driver = DriverManager.driver;
        WebElement logout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[3]/ul/li/div/span"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", logout_xpth);
    }

    public static class profileMenu {

        public static void clickStory() {
            WebDriver driver = DriverManager.driver;
            WebElement story_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[1]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", story_xpth);
        }

        public static void clickSettings() {
            WebDriver driver = DriverManager.driver;
            WebElement settings_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[2]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", settings_xpth);
        }

        public static void clickContribution() {
            WebDriver driver = DriverManager.driver;
            WebElement contributions_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[3]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", contributions_xpth);
        }

        public static void clickRefund() {
            WebDriver driver = DriverManager.driver;
            WebElement refunds_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[4]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", refunds_xpth);
        }

        public static void clickAllLTDLicense() {
            WebDriver driver = DriverManager.driver;
            WebElement ltd_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[5]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ltd_xpth);
        }

        public static void clickSubscription() {
            WebDriver driver = DriverManager.driver;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,325)", "");
            WebElement subs_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/div/div[2]"));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", subs_xpth);
        }

        public static void clickAllPlans() {
            WebDriver driver = DriverManager.driver;
            WebElement allplans_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/ul/li[1]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", allplans_xpth);
        }

        public static void clickPaymentHistory() {
            WebDriver driver = DriverManager.driver;
            WebElement paymhistory_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/ul/li[2]/a/div[2]"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", paymhistory_xpth);
        }
    }
}
