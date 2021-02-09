package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pom.NewOrganization;

public class CreateOrganization {
    public static void create(WebDriver driver) {

        try {
//            driver.findElement(By.id(NewOrganization.Locator.action_btn_id)).click();
            driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr/td[6]/div/button/div/img")).click();
            Thread.sleep(1000);
//            driver.findElement(By.xpath(NewOrganization.Locator.add_org_btn_xpth)).click();
            driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr/td[6]/div/ul/li/button")).click();

            driver.findElement(By.id(NewOrganization.Locator.org_name_id)).click();
            driver.findElement(By.id(NewOrganization.Locator.org_name_id)).sendKeys(NewOrganization.Text.org_name_txt);

            driver.findElement(By.id(NewOrganization.Locator.org_username_id)).click();
            driver.findElement(By.id(NewOrganization.Locator.org_username_id)).sendKeys(NewOrganization.Text.org_username_txt);

            driver.findElement(By.id(NewOrganization.Locator.org_address_id)).click();
            driver.findElement(By.id(NewOrganization.Locator.org_address_id)).sendKeys(NewOrganization.Text.org_address_txt);

            driver.findElement(By.id(NewOrganization.Locator.org_des_id)).click();
            driver.findElement(By.xpath(NewOrganization.Locator.org_des_xpth)).sendKeys(NewOrganization.Text.org_des_txt);

            driver.findElement(By.id(NewOrganization.Locator.org_number_id)).click();
            driver.findElement(By.id(NewOrganization.Locator.org_number_id)).sendKeys(NewOrganization.Text.org_number_txt);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,894)", "");
            Thread.sleep(1000);

            driver.findElement(By.xpath(NewOrganization.Locator.org_agree_term_xpth)).click();
            driver.findElement(By.xpath(NewOrganization.Locator.org_save_btn_xpth)).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
