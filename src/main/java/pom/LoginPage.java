package pom;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class LoginPage {

    public class Locators {
        WebDriver driver = DriverManager.driver;
        public static final String header_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[1]/h2";
        public static final String des_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[1]/p";

        public static final String signup_txt_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[2]/form/div/div[1]/p";
        public static final String signup_link_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[2]/form/div/div[1]/a";

        public static final String email_id = "email";
        public static final String pass_id = "password";

        public static final String signin_btn_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[2]/form/div/div[3]/button";

        public static final String forgot_pass_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div[2]/div/div[2]/form/div/div[3]/div/a";

//        public void getHeader(){
//            driver.findElement(By.xpath(header_xpth));
//        }
//
//        public void getDes(){
//            driver.findElement(By.xpath(des_xpth));
//        }
//
//        public void getSignupTxt(){
//            driver.findElement(By.xpath(signup_txt_xpth));
//        }
//
//        public void getSignupLink(){
//            driver.findElement(By.xpath(signup_link_xpth));
//        }
    }

    public class Texts {
        public static final String header_txt = "Start crowdfunding with greatly optimized fundraising process";
        public static final String des_xpth = "Build a platform that you can be proud of";

        public static final String signup_txt = "Don’t have an account?";
    }
}
