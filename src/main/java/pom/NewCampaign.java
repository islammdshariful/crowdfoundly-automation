package pom;

import org.openqa.selenium.firefox.ProfilesIni;

public class NewCampaign {
    public static class Locator {
        // Fundraising type
        public static final String cmp_astnt_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[1]/div[1]/h5";
        public static final String cam_type_reward_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/div/button[1]";
        public static final String cam_type_donation_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/div/button[2]";


        // Campaign Category
        public static final String cmp_catagory_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/div[8]/label";
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

        public static final String cmp_sty_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/button[2]";

        // Other information
        public static final String oi_add_new_field_xpth = "//*[@id=\"otherInfoForm\"]/div/div[2]/div/div/div/button";
        public static final String oi_section_title_id = "title_createcampaignCreate";
        public static final String oi_consent_disable_enable_toggle_xpth = "//*[@id=\"consentcampaignCreate\"]/div/div[1]/div/div/label";
        public static final String oi_consent_text_id = "consent_textcampaignCreate";
        public static final String oi_type_id = "campaignCreatetype0";
        public static final String oi_label_id = "campaignCreatelabel0";
        public static final String oi_placeholder_id = "campaignCreateplaceholder0";
        public static final String oi_required_yes_xpth = "//*[@id=\"campaignCreateis_required_label0\"]/div[1]/label";
        public static final String oi_required_no_xpth = "//*[@id=\"campaignCreateis_required_label0\"]/div[2]/label";
        public static final String other_info_nxt_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[2]";

        // Campaign Rewards
        public static final String add_new_reward_xpth = "//*[@id=\"public\"]/div/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/button";



        // Published - Draft Buttons
        public static final String back_btn_xpth = "//*[@id=\"buttonArea\"]/div/button";
        public static final String draft_don_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[2]";
        public static final String draft_rwrd_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[1]";
        public static final String published_don_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[3]/span";
        public static final String published_rwrd_btn_xpth = "//*[@id=\"buttonArea\"]/div/div/button[2]/span";

        // Go to Dashboard
        public static final String go_to_dashboard_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/a";
        // Go to Edit
        public static final String edit_campaign_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/a";
        // Go to Preview
        public static final String public_preview_xpth = "//*[@id=\"finishingModal\"]/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/a";

        // Edit mode

        // THANK YOU message
        public static final String thankyou_message_xpth = "//*[@id=\"public\"]/div/div[5]/div[1]/div/div[2]/ul[2]/li[8]";
        public static final String ty_msg_input_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[2]/form/div[1]/textarea";
        public static final String ty_save_msg_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[2]/form/button/span";

        // BROCHURE message
        public static final String brochure_xpth = "//*[@id=\"public\"]/div/div[5]/div[1]/div/div[2]/ul[2]/li[7]/a";
        public static final String flyder_txt_id = "summary";
        public static final String update_summary_btn_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/div/button/span";
        public static final String dwnld_pdf_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[2]/div/div/div[1]/div/a";

        // Post update
        public static final String post_update_xpth = "//*[@id=\"public\"]/div/div[5]/div[1]/div/div[2]/ul[2]/li[3]/a";
        public static final String post_update_btn_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[2]/div/div[1]/button";
        public static final String message_xpth = "//*[@id=\"message\"]/div[1]/p";
        public static final String image_xpth = "//*[@id=\"images\"]/div/div";
        public static final String post_img_crop_xpth = "//*[@id=\"updateImageCropper\"]/div/div[2]/div/div/div[2]/div[2]/button[2]";
        public static final String add_video_xpth = "//*[@id=\"createUpdateModal\"]/div/div[2]/div/form/div/div[3]/button";
        public static final String vdo_url_xpth = "//*[@id=\"createUpdateModal\"]/div/div[2]/div/form/div/div[3]/input";
        public static final String post_an_update_btn_xpth = "//*[@id=\"createUpdateModal\"]/div/div[2]/div/form/div/button/span";
        public static final String cross_modal_xpth = "//*[@id=\"createUpdateModal\"]/div/div[2]/button/img";

        // View campaign
        public static final String view_campaign_xpth = "//*[@id=\"public\"]/div/div[5]/div[2]/div/div/div[1]/a";

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
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and " +
                "scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap " +
                "into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the " +
                "release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum";


        public static final String ammout_txt = "00.45";

        // Other Information
        public static final String oi_section_title_text = "Please input valid information here";
        public static final String oi_consent_text = "I'm agreeing that this is valid information.";
        public static final String oi_label_n_placeholder_text = "Mobile Number";

        // Edit mode
        public static final String ty_msg_text = "Thank you for your generous gift. We are thrilled to have your support. Through your donation, we have been able to accomplish our goal and continue working towards our purpose of the organization. You truly make a difference for us.";
        public static final String brochure_msg_text = "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.";

        public static final String post_update_mesg_txt = "Lorem Ipsum is simply a dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "industry's standard dummy text ever since the 1500s when an unknown printer " +
                "took a galley of type and scrambled it to make a type specimen book. It has " +
                "survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release " +
                "of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop" +
                " publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem " +
                "Ipsum is simply a dummy text of the printing and typesetting industry.\n";
        public static final String vdo_url = "https://www.youtube.com/watch?v=xbqA6o8_WC0";
    }


}
