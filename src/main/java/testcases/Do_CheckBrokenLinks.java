package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import modules.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import utils.Config;
import utils.DriverManager;
import utils.Urls;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Do_CheckBrokenLinks {
    public static WebDriver driver = null;

    public static void invokeBrowser() {
        driver = DriverManager.driver;
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    private static void brokenLinks(WebDriver driver) {
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            url = link.getAttribute("href");
//            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println(url + " is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(Urls.getURLS("root"))) {
                System.out.println(url + " belongs to another domain, skipping it.");
                continue;
            }
            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Config.setEnv("dev"); //for DEV: dev & LIVE: live
        invokeBrowser();
        driver.get(Urls.getURLS("root"));
        Config.allow_cookies();
        // Login to Organization Account
        Login.headlesslogin("organizer");
        System.out.println("A. Login to organization");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        brokenLinks(driver);
    }
}
