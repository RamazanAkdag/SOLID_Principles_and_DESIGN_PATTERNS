public class PremiumUser extends User {

    public PremiumUser(String _name, double _balance) {
        super(_name, _balance);

    }

    @Override
    public boolean substractCostFromBalance(double cost) {
        double costWithDiscount = cost - cost * calculateDiscount();
        if (this.get_balance() - cost >= 0) {
            this.set_balance(this.get_balance() - costWithDiscount);
            System.out.println(
                    this.get_name() + "ödeme yapti. ödenen tutar : " + costWithDiscount + "yeni bakiye : "
                            + this.get_balance());
            return true;
        }
        System.out.println("FAKİRSİN, ALMA BİŞEY");
        return false;
    }

    @Override
    public double calculateDiscount() {
        double discount = 10 / 100;
        return discount;
    }

}
