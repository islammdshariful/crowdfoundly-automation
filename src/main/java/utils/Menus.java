package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.CampaignPage;

import java.util.concurrent.TimeUnit;

public class Menus {

    public static void clickDashboard() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement dashboard_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[1]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", dashboard_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickCampaigns() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement campaigns_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[2]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", campaigns_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnlineContributors() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement oncontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[3]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", oncontributor_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOfflineContributors() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement offcontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[4]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", offcontributor_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickFundraiser() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement fundraiser_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[5]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", fundraiser_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickWalletPayouts() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement walletpayout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[6]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", walletpayout_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickRefunds() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement refunds_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[7]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", refunds_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickTeamAccounts() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement team_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[8]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", team_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickRoles() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement roles_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[9]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", roles_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickCatagories() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement catagories_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[10]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", catagories_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickSettings() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement settings_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[11]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", settings_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickReports() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement report_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[12]/a/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", report_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickLogouts() {
        try {
            WebDriver driver = DriverManager.driver;
            Thread.sleep(1000);
            WebElement logout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[3]/ul/li/div/span"));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", logout_xpth);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class fundraiserMenu {
        public static void clickDashboard() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement walletpayout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[1]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", walletpayout_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickCampaigns() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement campaigns_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[2]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", campaigns_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickOnlineContributors() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement oncontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[3]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", oncontributor_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickOfflineContributors() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement offcontributor_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[4]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", offcontributor_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickWalletPayouts() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement walletpayout_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[5]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", walletpayout_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickRefunds() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement refunds_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[6]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", refunds_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickPayoutMethods() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement payouts_xpth = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/div[5]/div/div[2]/ul/li[8]/a/span"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", payouts_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class profileMenu {

        public static void clickStory() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement story_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[1]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", story_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickSettings() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement settings_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[2]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", settings_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickContribution() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement contributions_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[3]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", contributions_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickRefund() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement refunds_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[4]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", refunds_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickAllLTDLicense() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement ltd_xpth = driver.findElement(By.xpath("//*[@id=\"public\"]/div/div[5]/div/div[1]/div/div[2]/ul/li[5]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", ltd_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickSubscription() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,325)", "");
                WebElement subs_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/div/div[2]"));
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", subs_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickAllPlans() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement allplans_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/ul/li[1]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", allplans_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickPaymentHistory() {
            try {
                WebDriver driver = DriverManager.driver;
                Thread.sleep(1000);
                WebElement paymhistory_xpth = driver.findElement(By.xpath("//*[@id=\"treeview5\"]/ul/li[2]/a/div[2]"));
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", paymhistory_xpth);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
