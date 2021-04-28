package utils;

public class Credentials {
//    public static class credentials {
//        public static final String con_email = "";
//        public static final String con_password = "";
//
//        public static final String org_email = "";
//        public static final String org_password = "";
//
//        public static final String fund_email = "";
//        public static final String fund_password = "";

        public static String getEmail(String usr){
            String org_email;
            String con_email;
            String fund_email;
            if(Config.dev){
                con_email = "forusualtest+devautocon1@gmail.com";

                org_email = "forusualtest+devautoorg1@gmail.com";

                fund_email = "forusualtest+devautofund1@gmail.com";

                if(usr.equals("contributor")){
                    return con_email;
                }else if(usr.equals("organizer")) {
                    return org_email;
                }else if (usr.equals("fundraiser")){
                    return fund_email;
                }else {
                    return "Choose correct user: contributor or organizer or fundraiser";
                }
            }
            if(Config.live){
                org_email = "forusualtest+la1@gmail.com";

                con_email = "forusualtest+la2@gmail.com";

                fund_email = "forusualtest+la3@gmail.com";

                if(usr.equals("contributor")){
                    return con_email;
                }else if(usr.equals("organizer")) {
                    return org_email;
                }else if (usr.equals("fundraiser")){
                    return fund_email;
                }else {
                    return "Choose correct user: contributor or organizer or fundraiser";
                }
            }
            return "";
        }
    public static String getPassword(String usr){
        String org_password;
        String con_password;
        String fund_password;

        if(Config.dev){
            con_password = "123456";

            org_password = "123456";

            fund_password = "123456";

            if(usr.equals("contributor")){
                return con_password;
            }else if(usr.equals("organizer")) {
                return org_password;
            }else if (usr.equals("fundraiser")){
                return fund_password;
            }else {
                return "";
            }
        }
        if(Config.live){
            org_password = "123456";

            con_password = "123456";

            fund_password = "123456";

            if(usr.equals("contributor")){
                return con_password;
            }else if(usr.equals("organizer")) {
                return org_password;
            }else if (usr.equals("fundraiser")){
                return fund_password;
            }else {
                return "";
            }
        }
        return "";
    }
}
