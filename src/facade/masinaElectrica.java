package facade;

public class masinaElectrica implements Automobil{
    private String incarcator;

    public masinaElectrica(String incarcator) {
        this.incarcator = incarcator;
    }

    @Override
    public void getDescriere() {
        System.out.println("Masina electrica cu incarcator "+ this.incarcator);
    }
}
