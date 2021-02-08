package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Config {
    //Allow cookies button
    public static final String allow_cookies_btn_xpth = "//*[@id=\"public\"]/div[2]/div/button";

    public static void allow_cookies(){
        WebDriver driver = DriverManager.driver;
        driver.findElement(By.xpath(allow_cookies_btn_xpth)).click();
    }
}
