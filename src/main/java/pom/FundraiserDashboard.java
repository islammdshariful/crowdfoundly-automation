package pom;

import java.lang.invoke.StringConcatFactory;

public class FundraiserDashboard {
    public class Locator {
        // payouts method
        public static final String add_new_payouts_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[1]/button";
        public static final String slelect_mehtod_id = "payout-method";

        public static final String beneficiary_name_id = "beneficiary_name";
        public static final String account_number_id = "account_number";
        public static final String bank_name_id = "bank_name";
        public static final String branch_name_id = "branch_name";
        public static final String swift_code_id = "swift_code";
        public static final String country_xpth = "//*[@id=\"country\"]/div/div[1]/input";

        public static final String paypal_email_id = "paypal-email";

        public static final String save_btn_xpth = "//*[@id=\"addPayoutMethodModal\"]/div/div[2]/div/div/form/button/span";

        // Wallet & payout
        public static final String new_request_btn_xpth = "//*[@id=\"dashboard\"]/div/div[6]/div[2]/div/div[1]/div[2]/div[1]/button";
        public static final String amount_id = "amount";
        public static final String payment_method_id = "payment-method";
        public static final String note_id = "note";

        public static final String send_btn_xpth = "//*[@id=\"withdrawalRequestModal\"]/div/div[2]/div/div/form/button/span";
    }

    public class Text {
        public static final String Bank_txt = "BANK";
        public static final String paypal_txt = "PAYPAL";

        public static final String beneficiary_name_txt = "Md. Shariful Islam Sabbir";
        public static final String account_number_txt = "016221523811";
        public static final String bank_name_txt = "Standard Chartered Bank";
        public static final String branch_name_txt = "Mirpur";
        public static final String swift_code_txt = "SCBLBDDXXXX";
        public static final String country_name_txt = "Bangladesh";

        public static final String paypal_email_txt = "facilitator@jouleslabs.com";

        public static final String amount_txt = "20.50";
        public static final String payment_paypal_method_txt = "PAYPAL( fadcilitator@jouleslabs.com)";
        public static final String payment_bank_method_txt = "BANK( 016221523811)";
        public static final String note_txt = "Lorem Ipsum is simply a dummy text. Phasellus ac ligula velit. Maecenas fringilla at neque ut tincidunt.";
    }
}
