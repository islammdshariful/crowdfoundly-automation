package pom;

public class CampaignPage {
    public class Locators{
        public static final String header_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[1]/h4";

        public static final String add_new_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[1]/div/button";

        public static final String action_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div[1]/button/div/img";
        public static final String action_manage_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div[1]/ul/li[1]/button";
        public static final String action_set_rised_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div[1]/ul/li[2]/button";
        public static final String action_draft_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div[1]/ul/li[3]/button";
        public static final String action_dlt_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[7]/div/div[1]/ul/li[4]/button";

        public static final String confirm_dlt_btn_xpth = "/html/body/div[3]/div/div[3]/button[1]";
    }

    public class Text{
        public static final String title = "Dashboard";
        public static final String header_txt = "CAMPAIGNS";
    }
}
