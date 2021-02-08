package pom;

public class NewCampaign {
    public static class Locator {
        // Fundraising type
        public static final String cmp_astnt_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[1]/div[1]/h5";
        public static final String cam_type_reward_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/div/button[1]";
        public static final String cam_type_donation_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/div/button[2]";


        // Campaign Category
        public static final String cmp_catagory_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[1]/label";
        public static final String cmp_cat_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/button[2]";


        // Campaign Title
        public static final String cam_title_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/input";
        public static final String cmp_title_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/button[2]";


        // Target Amount
        public static final String cmp_trgt_amount_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/form/div/div[1]/div[3]/div/div/input";
        public static final String cmp_trgt_amt_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/button[2]";


        // Campaign Duration
        public static final String cmp_nodeadline_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[5]/div/div[3]/div/div/div/div/div[1]/button";
        public static final String cmp_deadline_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[5]/div/div[3]/div/div/div/div/div[2]/button";
        public static final String cmp_target_date_id = "undefined-input";
        public static final String next_month_xpth = "//*[@id=\"undefined-picker-container-DatePicker\"]/div/div[1]/div[3]/button";
        public static final String date_xpth = "/html/body/div[1]/div/div/div/div[3]/div[2]/div/div[1]/div[5]/div/div[3]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/span/div/button[20]";
        public static final String cmp_dur_nxt_btn_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[5]/div/div[4]/div/div/button[2]";


        // Campaign Gallery
        public static final String cmp_upload_img_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[6]/div/div[2]/div/div/div[2]/label";
        public static final String img_crop_xpth = "//*[@id=\"galleryImageCropper\"]/div/div[2]/div/div/div[2]/div[2]/button[2]";
        public static final String cmp_gal_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/button[2]";


        // Campaign Media
        public static final String cmp_upload_vdo_id = "url";
        public static final String cmp_add_vdo_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[7]/div/div[2]/div/div/div[2]/div/form/div/div[2]/button";
        public static final String cmp_vdo_nxt_btn = "//*[@id=\"buttonArea\"]/div/button[2]";


        // Campaign Story
        public static final String stry_add_quote_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[2]/div[1]/div/button";
        public static final String stry_add_body_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[3]/div[1]/div/button";
        public static final String stry_add_img_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[4]/div[1]/div/button";
        public static final String stry_add_vdo_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[5]/div[1]/div/button";

        public static final String stry_h1_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[1]/div[2]/button[1]";
        public static final String stry_h1_field_id = "text_input_0";

        public static final String stry_quote_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[2]/div[2]/button[2]/span/i";
        public static final String stry_quote_field_id = "text_input_1";
        public static final String stry_bodytxt_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[3]/div[2]/button[3]/span";
        public static final String stry_bodytxt_field_id = "text_input_2";

        public static final String stry_img_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[4]/div[2]/button[4]/span/i";
        public static final String stry_img_field_xpth = "//*[@id=\"drop-point-3\"]";
        public static final String stry_img_crp_xpth = "//*[@id=\"editorImageCropper\"]/div/div[2]/div/div/div[2]/div[2]/button[2]";

        public static final String stry_vdo_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[8]/div/div[2]/div/div/div[5]/div[2]/button[5]/span/i";
        public static final String stry_vdo_field_id = "text_input_4";

        public static final String cmp_sty_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button";


        // Campaign Rewards
        public static final String add_new_reward_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/button";


        // Published - Draft Buttons
        public static final String draft_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[1]";
        public static final String published_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[2]";

        // Go to dashboard
        public static final String go_to_dashboard_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/a";
        public static final String edit_campaign_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/a";
        public static final String public_preview_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/a";
    }

    public static class Text {
        public static final String cmp_astnt_txt = "Campaign Assistant";
        public static final String rwd_nodate_cmp_title_txt = "Automation-Reward-NODATE";
        public static final String rwd_date_cmp_title_txt = "Automation-Reward-DATE";
        public static final String donate_nodate_cmp_title_txt = "Automation-Donation-NODATE";
        public static final String donate_date_cmp_title_txt = "Automation-Donation-DATE";
        public static final String youtube_vdo_link = "https://www.youtube.com/watch?v=Zejrw5wkzwU";
        public static final String vimeo_vdo_link = "https://www.youtube.com/watch?v=0RFumQ8Q8f8";


        public static final String header_txt = "Lorem Ipsum is simply a dummy text.";
        public static final String quote_txt = "It was popularised in the 1960s with the release of Letraset sheets.";
        public static final String body_txt = "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n" +
                "\n" +
                "Where does it come from?\n" +
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.\n" +
                "\n" +
                "Where can I get some?\n" +
                "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";

        public static final String ammout_txt = "00.45";
    }
}
