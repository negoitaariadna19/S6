package facade;

public class masinaFamilie implements Automobil{

    private boolean scaunCopil;

    public masinaFamilie(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    @Override
    public void getDescriere() {
        if(scaunCopil)
        {
            System.out.println("Mas de fam are scaun de copil)");
        }
        else
        {
            System.out.println("Masina de familie nu are scaun de copil");
        }
    }
}
