package Builder;

public class CPizzaBuilder implements IPizzaBuilder {

    private Pizza pizza;

    public CPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public IPizzaBuilder setBoyut(String boyut) {
        this.pizza.setBoyut(boyut);
        return this;
    }

    @Override
    public IPizzaBuilder addMalzeme(String malzeme) {
        this.pizza.addMalzeme(malzeme);
        return this;
    }

    @Override
    public IPizzaBuilder removeMalzeme(String malzeme) {
        this.pizza.removeMalzeme(malzeme);
        return this;
    }

    @Override
    public IPizzaBuilder setSure(int sure) {
        this.pizza.setPisirmeSuresi(sure);
        return this;
    }

    @Override
    public Pizza buildPizza() {
        return this.pizza;
    }

}
