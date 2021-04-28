package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewCatagories;
import utils.DriverManager;
import utils.Menus;

import java.util.concurrent.TimeUnit;

public class CreateCategories {
    public static void create(WebDriver driver) {
        Menus.clickCatagories();
        driver.findElement(By.xpath(NewCatagories.Locator.add_new_xpth)).click();
        driver.findElement(By.id(NewCatagories.Locator.name_id)).click();
        driver.findElement(By.id(NewCatagories.Locator.name_id)).sendKeys(NewCatagories.Text.name_txt);

        driver.findElement(By.id(NewCatagories.Locator.icon_id)).click();
        driver.findElement(By.id(NewCatagories.Locator.icon_id)).sendKeys(NewCatagories.Text.icon_txt);

        driver.findElement(By.xpath(NewCatagories.Locator.submit_btn_xpth)).click();
    }
}
