package proxy;

public class InternetProvider implements Internet{
    @Override
    public void connectToUrl(String url) {
        System.out.println("S-a conectat cu succes");
    }
}
