package hafta_14_VisitorObserver.Observer;

public interface Paylasabilen {
    public void gonderiPaylas(String gonderiIcerik);

    public void takipcilereBildir();

    public void bildir(ITakipci takipci);
}
