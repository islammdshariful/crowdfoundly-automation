package modules;

import org.openqa.selenium.*;
import pom.CampaignPage;
import pom.NewRole;
import pom.NewTeamMembers;
import utils.Menus;

public class ManageTeamMember {
    public static void addMember(WebDriver driver) {
        Menus.clickTeamAccounts();

        WebElement add_new = driver.findElement(By.xpath(NewTeamMembers.Locator.add_new_btn_xpth));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", add_new);

        driver.findElement(By.id(NewTeamMembers.Locator.email_id)).click();
        driver.findElement(By.id(NewTeamMembers.Locator.email_id)).sendKeys(NewTeamMembers.Text.email);

        driver.findElement(By.id(NewTeamMembers.Locator.name_id)).click();
        driver.findElement(By.id(NewTeamMembers.Locator.name_id)).sendKeys(NewTeamMembers.Text.name);

        driver.findElement(By.xpath(NewTeamMembers.Locator.role_xpth)).click();
        driver.findElement(By.xpath(NewTeamMembers.Locator.role_xpth)).sendKeys(NewRole.Text.name_txt);
        driver.findElement(By.xpath(NewTeamMembers.Locator.role_xpth)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(NewTeamMembers.Locator.submit_btn_xpth)).click();
    }

    public static void deleteMember(WebDriver driver) {
        Menus.clickTeamAccounts();
        try {
            driver.findElement(By.xpath(NewTeamMembers.Locator.action_btn_xpth)).click();
            driver.findElement(By.xpath(NewTeamMembers.Locator.delete_xpth)).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(NewTeamMembers.Locator.con_yes_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
