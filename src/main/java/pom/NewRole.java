package pom;

public class NewRole {
    public static class Locator {
        public static final String add_new_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div/div[1]/div/button/span";
        public static final String name_id = "name";

        public static final String check_all_xpth = "//*[@id=\"roleAddModal\"]/div/div[2]/div/form/div[2]/div[1]/div/label";
        public static final String create_role_xpth = "//*[@id=\"permissions\"]/div/div[1]/div/label";
        public static final String update_role_xpth = "//*[@id=\"permissions\"]/div/div[2]/div/label";
        public static final String assign_user_to_team_xpth = "//*[@id=\"permissions\"]/div/div[3]/div/label";
        public static final String update_team_member_permission_xpth = "//*[@id=\"permissions\"]/div/div[4]/div/label";
        public static final String delete_member_xpth = "//*[@id=\"permissions\"]/div/div[5]/div/label";
        public static final String create_campaign_xpth = "//*[@id=\"permissions\"]/div/div[6]/div/label";
        public static final String update_campaign_xpth = "//*[@id=\"permissions\"]/div/div[7]/div/label";
        public static final String delete_campaign_xpth = "//*[@id=\"permissions\"]/div/div[8]/div/label";
        public static final String update_organization_info_xpth = "//*[@id=\"permissions\"]/div/div[9]/div/label";
        public static final String view_contributions_xpth = "//*[@id=\"permissions\"]/div/div[10]/div/label";
        public static final String view_refund_xpth = "//*[@id=\"permissions\"]/div/div[11]/div/label";
        public static final String create_category_xpth = "//*[@id=\"permissions\"]/div/div[12]/div/label";

        public static final String submit_btn_xpth = "//*[@id=\"roleAddModal\"]/div/div[2]/div/form/div[3]/button/span";
    }

    public static class Text {
        public static final String name_txt = "Volunteer";
    }
}
