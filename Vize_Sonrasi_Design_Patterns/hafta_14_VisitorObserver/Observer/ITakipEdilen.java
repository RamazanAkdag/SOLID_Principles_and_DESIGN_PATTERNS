package hafta_14_VisitorObserver.Observer;

import java.util.List;

public abstract class ITakipEdilen implements Paylasabilen {
    private List<ITakipci> takipcis;

    public List<ITakipci> getTakipcis() {
        return takipcis;
    }

    public void setTakipcis(List<ITakipci> takipcis) {
        this.takipcis = takipcis;
    }

}