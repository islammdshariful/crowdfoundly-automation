package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.NewRole;
import utils.Menus;

public class CreateRole {
    public static void role(WebDriver driver) {
        Menus.clickRoles();
        driver.findElement(By.xpath(NewRole.Locator.add_new_btn_xpth)).click();

        driver.findElement(By.id(NewRole.Locator.name_id)).click();
        driver.findElement(By.id(NewRole.Locator.name_id)).sendKeys(NewRole.Text.name_txt);

        driver.findElement(By.xpath(NewRole.Locator.check_all_xpth)).click();

        driver.findElement(By.xpath(NewRole.Locator.submit_btn_xpth)).click();
    }
}
