package proxy;

public class Main {
    public static void main(String[] args) {
        Internet ip= new InternetProvider();
        Internet proxyInt=new ProxyInternet();

        ip.connectToUrl("google.com");
        proxyInt.connectToUrl("google.com");
        System.out.println("--------------");
        ip.connectToUrl("facebook.com");
        proxyInt.connectToUrl("facebook.com");
    }
}
