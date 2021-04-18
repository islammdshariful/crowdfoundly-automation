package utils;

import static utils.Config.*;

public class Urls {

    public static String getURLS(String url) {
        if (Config.dev) {
            String root = "https://app.crowdfundly.dev/";
            String subs = "https://app.crowdfundly.dev/subscribe";
            String ltd = "https://app.crowdfundly.dev/lifetime-deal";

            if(url.equals("root")){
                return root;
            }else if(url.equals("subs")){
                return subs;
            } else if(url.equals("ltd")){
                return ltd;
            }
            else {
                System.out.println("PLEASE CHOOSE A CORRECT URL. EX: root, subs, or ltd");
                System.exit(0);
            }
        }
        if(Config.live){
            String root = "https://app.crowdfundly.io/";
            String subs = "https://app.crowdfundly.io/subscribe";
            String ltd = "https://app.crowdfundly.io/lifetime-deal";

            if(url.equals("root")){
                return root;
            }else if(url.equals("subs")){
                return subs;
            }else if(url.equals("ltd")){
                return ltd;
            }
            else {
                System.out.println("PLEASE CHOOSE A CORRECT URL. EX: root, subs, or ltd");
                System.exit(0);
            }
        }

        return "";
    }
}
