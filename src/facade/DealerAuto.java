package facade;

public class DealerAuto {
    masinaElectrica me=null;
    masinaFamilie mf=null;
    masinaSport ms=null;

    public DealerAuto() {
    }

    public void getDescriereMF()
    {
        if(mf==null)
        {
            mf=new masinaFamilie(true);
        }
        mf.getDescriere();
    }
    public void getDescriereMS()
    {
        if(ms==null)
        {
            ms=new masinaSport("TS1234");
        }
        ms.getDescriere();
    }
    public void getDescriereME()
    {
        if(me==null)
        {
            me=new masinaElectrica("5000");
        }
        me.getDescriere();
    }
}
