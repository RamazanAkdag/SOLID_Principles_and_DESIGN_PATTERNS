package hafta_14_VisitorObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Grup implements ITakipci {
    private List<ITakipci> grupUyeleri;

    public Grup() {
        this.grupUyeleri = new ArrayList<>();
    }

    @Override
    public void takipEt(ITakipEdilen takipEdilen) {
        takipEdilen.getTakipcis().add(this);
    }

    public List<ITakipci> getGrupUyeleri() {
        return grupUyeleri;
    }

    public void setGrupUyeleri(List<ITakipci> grupUyeleri) {
        this.grupUyeleri = grupUyeleri;
    }

    @Override
    public void bildirimAl(String bildirim) {
        for (ITakipci iTakipci : grupUyeleri) {
            iTakipci.bildirimAl(bildirim);
        }
    }

}
