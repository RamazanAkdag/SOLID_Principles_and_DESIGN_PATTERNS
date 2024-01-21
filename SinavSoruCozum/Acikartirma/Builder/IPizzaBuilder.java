package Builder;

public interface IPizzaBuilder {

    public IPizzaBuilder setBoyut(String boyut);

    public IPizzaBuilder addMalzeme(String malzeme);

    public IPizzaBuilder removeMalzeme(String malzeme);

    public IPizzaBuilder setSure(int sure);

    public Pizza buildPizza();
}
