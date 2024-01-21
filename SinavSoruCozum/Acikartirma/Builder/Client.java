package Builder;

public class Client {
    public static void clientFunc(IPizzaBuilder builder) {
        Pizza pizza = builder.setBoyut("35cm").addMalzeme("sucuk").addMalzeme("kaşar").addMalzeme("salam")
                .addMalzeme("mozerella")
                .setSure(10).buildPizza();
        System.out.println(pizza);
    }

    public static void main(String[] args) {
        clientFunc(new CPizzaBuilder());

    }
}
