import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        // StandardUser oyku = new StandardUser("Öykü Atak", 1000);

        PremiumUser oyku = new PremiumUser("Öykü Atak", 1000);

        Product dido = new Product("dido", 10);
        Product bot = new Product("bot", 100);
        Product dimes = new Product("dimes", 150);
        Product gözlük = new Product("Gözlük", 300);

        oyku.addProductToCart(dido);
        oyku.addProductToCart(bot);
        oyku.addProductToCart(dimes);
        oyku.addProductToCart(gözlük);

        Payment.payUserCart(oyku);

    }
}
