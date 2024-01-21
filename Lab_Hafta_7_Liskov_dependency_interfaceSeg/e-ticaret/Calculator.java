import java.util.ArrayList;

public class Calculator {
    public static double calculateCartCosts(ArrayList<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getCost();
        }
        System.out.println("ücret hesaplandı : " + total);
        return total;
    }
}
