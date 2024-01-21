package hafta_14_VisitorObserver.Observer;

public interface ITakipci {

    public abstract void takipEt(ITakipEdilen takipEdilen);

    public abstract void bildirimAl(String bildirim);

}
