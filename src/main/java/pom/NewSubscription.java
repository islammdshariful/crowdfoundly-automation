package pom;

public class NewSubscription {
    public static class Subscription {
        public static final String free_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div[1]/div/div[3]/div/button";
        public static final String lite_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div[2]/div/div[3]/div/button";
        public static final String plus_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div[3]/div/div[3]/div/button";
        public static final String professional_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div[4]/div/div[3]/div/button";

        public static final String debit_crd_iframe_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[4]/div[2]/div[3]/div/iframe";
        public static final String debit_crd_num_name = "cardnumber";
        public static final String debit_crd_cvc_name = "cvc";

        public static final String paynow_btn_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[4]/div[2]/div[5]/button/span";
        public static final String subs_btn_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div[4]/div/div/button/span";
    }

    public static class Text {
        public static final String debit_crd_num_txt = "42424242424242420242123";
        public static final String debit_crd_cvc_txt = "54321";
    }

    public static class LTD {
        public static final String lite_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/div[3]/div/div/div[1]/div/div[3]/div/button";
        public static final String plus_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/div[3]/div/div/div[2]/div/div[3]/div/button";
        public static final String professional_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/div[3]/div/div/div[3]/div/div[3]/div/button";
        public static final String enterprise_xpth = "//*[@id=\"public\"]/div/div[4]/div/div/div/div/div[3]/div/div/div[4]/div/div[3]/div/button";


        public static final String debit_crd_iframe_xpth = "//*[@id=\"card-form\"]/div[2]/div[2]/div/div[1]/div/iframe";
        public static final String debit_crd_num_name = "cardnumber";
        public static final String debit_crd_cvc_name = "cvc";

        public static final String paynow_btn_xpth = "//*[@id=\"card-form\"]/div[2]/div[2]/div/div[3]/button/span";

    }
}
