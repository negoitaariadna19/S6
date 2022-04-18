package proxy;

import java.util.*;

public class ProxyInternet implements Internet{
    private Internet ip=new InternetProvider();
    private  List<String> bl=new ArrayList<>();


    public ProxyInternet() {
        bl.add("facebook.com");
        bl.add("tiktok.com");
    }
    @Override
    public void connectToUrl(String url) {
if(bl.contains(url.toLowerCase(Locale.ROOT)))
{
    System.out.println("aacces interzis la " + url );
}
else {
    ip.connectToUrl(url);
}
    }

}
