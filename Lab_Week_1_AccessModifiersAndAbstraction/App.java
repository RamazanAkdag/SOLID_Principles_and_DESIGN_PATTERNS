package Lab_Week_1_AccessModifiersAndAbstraction;

public class App {
    public static void main(String[] args) {
        Employee isci = new Worker();
        isci.setName("selami");
        Employee muhendis = new Engineer();
        muhendis.setName("Ahmet");

        CalculateMoney maasHesapla = new CalculateMoney();

        System.out.println(muhendis.getName() + " Muhendisin maasi : " + maasHesapla.calculate(muhendis));
        System.out.println(isci.getName() + " Iscinin maasi : " + maasHesapla.calculate(isci));
    }
}
