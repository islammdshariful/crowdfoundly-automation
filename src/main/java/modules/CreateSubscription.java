package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.NewSubscription;
import utils.DriverManager;
import utils.Urls;

import java.util.concurrent.TimeUnit;

public class CreateSubscription {
    public static void createSubs(WebDriver driver, String pkg) {
        driver.get(Urls.dev_subs);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebDriver driver1 = DriverManager.driver;
        driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        if(driver1.findElements(By.xpath("//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div/div/a")).size() != 0){
            driver1.findElement(By.xpath("//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div/div/a")).click();
        }else {
            try {
                if (pkg.equals("free")) {
                    System.out.println("B - a: Subscription: free");
                    driver.findElement(By.xpath(NewSubscription.Subscription.free_xpth)).click();

                    js.executeScript("window.scrollBy(0,1511)", "");
                    Thread.sleep(1000);

                    driver.findElement(By.xpath(NewSubscription.Subscription.subs_btn_xpth)).click();
                } else if (pkg.equals("lite")) {
                    System.out.println("B - a: Subscription: lite");
                    driver.findElement(By.xpath(NewSubscription.Subscription.lite_xpth)).click();

                    js.executeScript("window.scrollBy(0,1511)", "");
                    Thread.sleep(1000);

                    driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.Subscription.debit_crd_iframe_xpth)));
                    WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.Subscription.debit_crd_num_name));
                    creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).click();
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.xpath(NewSubscription.Subscription.paynow_btn_xpth)).click();
                } else if (pkg.equals("plus")) {
                    System.out.println("B - a: Subscription: plus");
                    driver.findElement(By.xpath(NewSubscription.Subscription.plus_xpth)).click();

                    js.executeScript("window.scrollBy(0,1511)", "");
                    Thread.sleep(1000);

                    driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.Subscription.debit_crd_iframe_xpth)));
                    WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.Subscription.debit_crd_num_name));
                    creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).click();
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.xpath(NewSubscription.Subscription.paynow_btn_xpth)).click();
                } else {
                    System.out.println("B - a: Subscription: professional");
                    js.executeScript("window.scrollBy(0,667)", "");

                    driver.findElement(By.xpath(NewSubscription.Subscription.professional_xpth)).click();

                    js.executeScript("window.scrollBy(0,1526)", "");

                    driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.Subscription.debit_crd_iframe_xpth)));
                    WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.Subscription.debit_crd_num_name));
                    creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).click();
                    driver.findElement(By.name(NewSubscription.Subscription.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.xpath(NewSubscription.Subscription.paynow_btn_xpth)).click();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createLTD(WebDriver driver, String pkg) {
        driver.get(Urls.dev_subs);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            if (pkg.equals("lite")) {
                System.out.println("B - a: Subscription LTD: lite");
                js.executeScript("window.scrollBy(0,256)", "");
                Thread.sleep(1000);

                driver.findElement(By.xpath(NewSubscription.LTD.lite_xpth)).click();

                js.executeScript("window.scrollBy(0,2029)", "");
                Thread.sleep(1000);

                driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.LTD.debit_crd_iframe_xpth)));
                WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.LTD.debit_crd_num_name));
                creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).click();
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);

                driver.findElement(By.xpath(NewSubscription.LTD.paynow_btn_xpth)).click();
            } else if (pkg.equals("plus")) {
                System.out.println("B - a: Subscription LTD: plus");
                js.executeScript("window.scrollBy(0,256)", "");
                Thread.sleep(1000);

                driver.findElement(By.xpath(NewSubscription.LTD.plus_xpth)).click();

                js.executeScript("window.scrollBy(0,2029)", "");
                Thread.sleep(1000);

                driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.LTD.debit_crd_iframe_xpth)));
                WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.LTD.debit_crd_num_name));
                creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).click();
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);

                driver.findElement(By.xpath(NewSubscription.LTD.paynow_btn_xpth)).click();
            } else if (pkg.equals("professional")) {
                System.out.println("B - a: Subscription LTD: professional");
                js.executeScript("window.scrollBy(0,256)", "");
                Thread.sleep(1000);

                driver.findElement(By.xpath(NewSubscription.LTD.professional_xpth)).click();

                js.executeScript("window.scrollBy(0,2029)", "");
                Thread.sleep(1000);

                driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.LTD.debit_crd_iframe_xpth)));
                WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.LTD.debit_crd_num_name));
                creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).click();
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);

                driver.findElement(By.xpath(NewSubscription.LTD.paynow_btn_xpth)).click();
            } else {
                System.out.println("B - a: Subscription LTD: enterprise");
                js.executeScript("window.scrollBy(0,759)", "");
                Thread.sleep(1000);

                driver.findElement(By.xpath(NewSubscription.LTD.enterprise_xpth)).click();

                js.executeScript("window.scrollBy(0,2029)", "");
                Thread.sleep(1000);

                driver.switchTo().frame(driver.findElement(By.xpath(NewSubscription.LTD.debit_crd_iframe_xpth)));
                WebElement creditcardNumber = driver.findElement(By.name(NewSubscription.LTD.debit_crd_num_name));
                creditcardNumber.sendKeys(NewSubscription.Text.debit_crd_num_txt);
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).click();
                driver.findElement(By.name(NewSubscription.LTD.debit_crd_cvc_name)).sendKeys(NewSubscription.Text.debit_crd_cvc_txt);

                driver.findElement(By.xpath(NewSubscription.LTD.paynow_btn_xpth)).click();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
