package facade;

public class masinaSport implements  Automobil{
    private String eleron;

    public masinaSport(String eleron) {
        this.eleron = eleron;
    }

    @Override
    public void getDescriere() {
        System.out.println("Masina electrica cu eleron" + eleron);
    }
}
