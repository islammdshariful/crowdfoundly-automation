package pom;

import java.net.PortUnreachableException;

public class OrganizationSettingsPage {
    public static class TabsLocator {
        public static final String basic_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[1]/a";
        public static final String media_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[2]/a";
        public static final String payment_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[3]/a";
        public static final String customdomain_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[4]/a";
        public static final String appkey_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[5]/a";
        public static final String policies_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[6]/a";
        public static final String theme_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[7]/a";
        public static final String social_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[8]/a";
        public static final String crowdfundly_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[9]/a";
        public static final String plan_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[10]/a";
        public static final String paymenthistory_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[1]/ul/li[11]/a";
    }

    public static class MediaLocator {
        public static final String logo_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div/div[1]/div/div/div[1]/div/label";
        public static final String favicon_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div/div[2]/div/div/div[1]/div/label";
        public static final String cover_img_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div/div[3]/div/div/div[1]/div/label";
        public static final String slider_img_xpth = "//*[@id=\"gallery\"]/label/div/div[2]/h5";
        public static final String slider_more_xpth = "//*[@id=\"gallery\"]/label/div/div[2]/div/div/i";

        public static final String fav_crop_xpth = "//*[@id=\"favicon\"]/div/div[2]/div/div/div[2]/div[2]/button[2]/i";
        public static final String logo_crop_xpth = "//*[@id=\"logo\"]/div/div[2]/div/div/div[2]/div[2]/button[2]/i";
        public static final String cover_img_crop_xpth = "//*[@id=\"cover-photo\"]/div/div[2]/div/div/div[2]/div[2]/button[2]/i";
        public static final String  slider_img_crop_xpth = "//*[@id=\"galleryImgCropper\"]/div/div[2]/div/div/div[2]/div[2]/button[2]/i";
    }

    public static class BasicLocator {
        public static final String delete_org_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[2]/button[2]/span";
        public static final String confirm_delete_btn_xpth = "//*[@id=\"deleteOrganizationModal\"]/div/div[2]/div/div[2]/button[2]/span";
        public static final String Save_basic_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[2]/button[1]/span";
    }

    public static class PaymentLocator {
        // Strip
        public static final String strip_acc_drpdwn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/button";
        public static final String strip_individual_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/button";

        public static final String strip_key_id = "stripe_key";
        public static final String stripe_secret_id = "stripe_secret";
        public static final String strip_save_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/form/button/span";

        public static final String active_strip_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/div/button[2]/span";

        // PayPal
        public static final String paypal_client_id = "client_id";
        public static final String paypal_client_secret_id = "client_secret";
        public static final String paypal_save_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div[2]/div[2]/form/button/span";
    }

    public static class PaymentText {
        public static final String strip_key_txt = "pk_test_eVPFdytafjZjNtV5RZHdoNMI00gH4Lvw9v";
        public static final String stripe_secret_txt = "sk_test_KVX4GzZtGyH7RE7Ji7E8cq7i";

        public static final String paypal_client_id_txt = "AYxB_zwl_3sG0oB0cYeYIO0O5B6H7IshyrQ670BqgBD5tZOCDYPDOck_q9ty7URJac14oMg_xwQwxdTG";
        public static final String paypal_client_secret_txt = "EAAkuLQyPmrhYCVnu5X2r9TmHrARTcNMqHfmUgej5HK8XJif7Zn0KM990lTljboYgVwYqqGOIWpv-GEl";
    }

    public static class PoliciesLocator {
        public static final String privacyPolicy_xpth = "//*[@id=\"other-info\"]/div[1]/div/label";
        public static final String termsConditions_xpth = "//*[@id=\"other-info\"]/div[2]/div/label";
        public static final String refundPolicy_xpth = "//*[@id=\"other-info\"]/div[3]/div/label";

        public static final String privacyPolicy_des_xpth = "//*[@id=\"privacyPolicyData\"]/div[1]/p";
        public static final String termsConditions_des_xpth = "//*[@id=\"termsAndConditionsData\"]/div[1]/p";
        public static final String refundPolicy_des_xpth = "//*[@id=\"refundPolicyData\"]/div[1]/p";

        public static final String save_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/button/span";
    }

    public static class PoliciesText {
        public static final String privacyPolicy_txt = "Lorem Ipsum is simply a dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the " +
                "1500s when an unknown printer took a galley of type and scrambled it to make a type specimen " +
                "book. It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like " +
                "Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply a dummy text of the " +
                "printing and typesetting industry.";
        public static final String termsConditions_txt = "It is a long established fact that a reader will be distracted by the readable content " +
                "of a page when looking at its layout. The point of using Lorem Ipsum is that it has a " +
                "more-or-less normal distribution of letters, as opposed to using 'Content here, " +
                "content here', making it look like readable English. Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text, " +
                "and a search for 'lorem ipsum' will uncover many web sites still in their infancy. " +
                "Various versions have evolved over the years, sometimes by accident, sometimes on " +
                "purpose (injected humour and the like).";
        public static final String refundPolicy_txt = "Lorem Ipsum is simply a dummy text of the " +
                "printing and typesetting industry. Lorem Ipsum has been the industry's standard " +
                "dummy text ever since the 1500s when an unknown printer took a galley of type and " +
                "scrambled it to make a type specimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining essentially unchanged.";
    }

    public static class SocilaLocator {
        public static final String facebook_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[1]/div/input";
        public static final String twitter_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[2]/div/input";
        public static final String linkedin_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[3]/div/input";
        public static final String instagram_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[4]/div/input";
        public static final String youtube_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/div/div[5]/div/input";

        public static final String save_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/div/form/button/span";
    }

    public static class SocilaText {
        public static final String facebook = "https://www.facebook.com/crowdfundly.io";
        public static final String twitter = "https://twitter.com/crowdfundly_io";
        public static final String linkedin = "https://www.linkedin.com/company/crowdfundly/";
        public static final String instagram = "https://www.instagram.com/forusualtest/";
        public static final String youtube = "https://www.youtube.com/channel/UCbFDVtJ5ANIXBZ1mPZTWmug";
    }

    public static class CrowdfundlyLocator {
        public static final String commision_id = "commission_percentage";
        public static final String auto_approv_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[1]/div/div/label";
        public static final String auto_public_fundriser_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[2]/div/div/label";
        public static final String update_auto_approv_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[3]/div/div/label";
        public static final String allow_tip_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[4]/div/div/label";
        public static final String show_similar_cmp_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[5]/div/div/label";
        public static final String allow_login_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[6]/div/div/label";
        public static final String escrow_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[7]/div/div/label";
        public static final String escrow_duration_id = "escrow_duration";
        public static final String allow_refund_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[2]/div/div/div[9]/div/div/label";

        public static final String save_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[2]/div[2]/form/div[3]/div/button/span";
    }

    public static class CrowdfundlyText {
        public static final String commision_txt = "5";
        public static final String escrow_duration_txt = "1";
    }
}
