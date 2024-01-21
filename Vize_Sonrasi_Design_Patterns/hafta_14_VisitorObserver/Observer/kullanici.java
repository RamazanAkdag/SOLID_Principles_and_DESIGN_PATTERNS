package hafta_14_VisitorObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class kullanici extends ITakipEdilen implements ITakipci {
    private String name;
    String gonderiIcerik;

    private List<ITakipci> takipcis;

    public kullanici(String name) {
        this.takipcis = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void takipEt(ITakipEdilen takipEdilen) {
        takipEdilen.getTakipcis().add(this);
    }

    @Override
    public void gonderiPaylas(String gonderiIcerik) {
        System.out.println("gonderi paylasildi : " + gonderiIcerik);
        this.gonderiIcerik = gonderiIcerik;
        takipcilereBildir();
    }

    @Override
    public void takipcilereBildir() {
        for (ITakipci iTakipci : takipcis) {
            bildir(iTakipci);
        }
    }

    @Override
    public void bildir(ITakipci takipci) {
        takipci.bildirimAl(this.name + "in paylastigi " + gonderiIcerik
                + " gonderisinin bildirimini aldim");
    }

    @Override
    public void bildirimAl(String bildirim) {
        System.out.println(bildirim);
    }

}
