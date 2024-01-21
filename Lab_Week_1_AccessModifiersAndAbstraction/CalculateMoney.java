package Lab_Week_1_AccessModifiersAndAbstraction;

public class CalculateMoney {

    public int calculate(Employee calisan) {
        return calisan.getHour() * calisan.getMoneyPerHour();
    }

}
