package hafta_14_VisitorObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sayfa extends ITakipEdilen {
    String sayfaIsim;
    String gonderiIcerik;

    private List<ITakipci> takipcis;

    public Sayfa(String isim) {
        this.takipcis = new ArrayList<>();
        this.sayfaIsim = isim;
    }

    @Override
    public void gonderiPaylas(String gonderiIcerik) {
        System.out.println("gonderi paylasildi : " + gonderiIcerik);
        this.gonderiIcerik = gonderiIcerik;
        takipcilereBildir();
    }

    @Override
    public void bildir(ITakipci takipci) {
        takipci.bildirimAl(this.sayfaIsim + "in paylastigi " + gonderiIcerik
                + " gonderisinin bildirimini aldim");
    }

    @Override
    public void takipcilereBildir() {
        for (ITakipci iTakipci : takipcis) {
            bildir(iTakipci);
        }
    }

    public String getSayfaIsim() {
        return sayfaIsim;
    }

    public void setSayfaIsim(String sayfaIsim) {
        this.sayfaIsim = sayfaIsim;
    }

    public String getGonderiIcerik() {
        return gonderiIcerik;
    }

    public void setGonderiIcerik(String gonderiIcerik) {
        this.gonderiIcerik = gonderiIcerik;
    }

    public List<ITakipci> getTakipcis() {
        return takipcis;
    }

    public void setTakipcis(List<ITakipci> takipcis) {
        this.takipcis = takipcis;
    }

}
