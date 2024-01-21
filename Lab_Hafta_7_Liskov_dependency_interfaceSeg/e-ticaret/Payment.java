public class Payment {
    public static boolean payUserCart(User user) {
        System.out.println("Payment Calisti...");
        double totalCost = Calculator.calculateCartCosts(user.get_cart().getProducts());
        return user.substractCostFromBalance(totalCost);

    }
}
