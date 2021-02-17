package pom;

public class NewRefundRequest {
    public static class ConLocator{
        public static final String action_btn_xpth = "/html/body/div[1]/div/div/div/div[5]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td[8]/div/button/div/img";
        public static final String refund_req_xpth = "/html/body/div[1]/div/div/div/div[5]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr/td[8]/div/ul/li/button";
        public static final String refund_note_id = "refund_note";
        public static final String submit_btn_xpth = "//*[@id=\"requestRefundModal\"]/div/div[2]/div/form/div[2]/button/span";
    }

    public static class ConText{
        public static final String refund_note_txt = "Lorem Ipsum is simply a dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply a dummy text of the printing and typesetting industry.\n";
    }

    public static class OrgLocator{
        public static final String action_btn_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[10]/div/button/div/img";
        public static final String approve_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[10]/div/ul/li[1]/button";
        public static final String decline_xpth = "/html/body/div[1]/div/div/div/div[6]/div[2]/div/div[2]/div[2]/div/table/tbody/tr/td[10]/div/ul/li[2]/button";

        public static final String refund_note_id = "refund_note";
        public static final String accept_btn_xpth = "//*[@id=\"refundModal\"]/div/div[2]/div/form/div[2]/button";
        public static final String cancle_note_id = "cancel_note";
        public static final String cancel_submit_xpth = "//*[@id=\"cancelModal\"]/div/div[2]/div/form/div[2]/button";

        public static final String yes_confrim_btn_xpth = "/html/body/div[3]/div/div[3]/button[1]";
        public static final String no_cancel_btn_xpth = "/html/body/div[3]/div/div[3]/button[2]";
    }

    public static class OrgText {
        public static final String approve_refun_txt = "Phasellus ac ligula velit. Maecenas fringilla at neque ut tincidunt.";
        public static final String decline_refun_txt = "Contrary to popular belief, Lorem Ipsum is not simply random text.";
    }
}
