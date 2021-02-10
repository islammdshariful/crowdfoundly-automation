package pom;

public class NewOrganization {
    public static class Locator {
        public static final String action_btn_xpth = "/html/body/div/div/div/div/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr/td[6]/div/button/div/img";
        public static final String add_org_btn_xpth = "/html/body/div[1]/div/div/div/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/table/tbody/tr/td[6]/div/ul/li/a";

        public static final String org_name_id = "name";
        public static final String org_username_id = "user-name";
        public static final String org_address_id = "address";
        public static final String org_des_id = "description";
        public static final String org_des_xpth = "//*[@id=\"description\"]/div[1]/p";
        public static final String org_number_id = "contact-number";
        public static final String org_agree_term_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/form/div/div[9]/div/label";
        public static final String org_save_btn_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/form/div/button/span";


    }

    public static class Text {
        public static final String org_name_txt = "Organization By Automation Script";
        public static final String org_username_txt = "orgbyautomation";
        public static final String org_address_txt = "House: 345/B, Road: 45/C" +
                "Sector: 45, Land of people, Earth, universe.";
        public static final String org_des_txt = "Lorem Ipsum is simply a dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply a dummy text of the printing and typesetting industry.\n" +
                "\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
        public static final String org_number_txt = "01622152381";
    }
}
