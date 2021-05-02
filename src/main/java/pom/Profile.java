package pom;

public class Profile {
    public class Locator {
        public static final String menu_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[1]/div/div[2]/div[3]";
        public static final String my_prfile_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[1]/div/div[2]/div[3]/div/ul/li[2]";

        public static final String story_xpth = "//*[@id=\"public\"]/div/div[4]/div/div[1]/div/div[2]/ul/li[1]/a/div[2]";
        //Settings
        public static final String name_id = "name";
        public static final String bio_id = "bio";

        public static final String choose_img_id = "profile-picture";
        public static final String crop_img_xpth = "//*[@id=\"avatar\"]/div/div[2]/div/div/div[2]/div[2]/button[2]";

        public static final String save_btn_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[2]/div/div/form/div[4]/div/button[1]/span";
        public static final String delete_account_xpth = "//*[@id=\"public\"]/div/div[5]/div/div[2]/div/div/form/div[4]/div/button[2]";
    }

    public class Text {
        public static final String org_owner_name_txt = "Md. Shariful Islam Sabbir";
        public static final String contributor_name_txt = "Mr. Shariful";
        public static final String fundraiser_name_txt = "Mr. Sabbir";

        public static final String bio_txt = "Lorem Ipsum is simply a dummy text. Contrary to popular belief, Lorem Ipsum is not simply random text.";
    }
}
