public class StandardUser extends User {

    public StandardUser(String _name, double _balance) {
        super(_name, _balance);

    }

    @Override
    public boolean substractCostFromBalance(double cost) {
        double costWithDiscount = cost - (cost * calculateDiscount());
        if (this.get_balance() - cost >= 0) {
            this.set_balance(this.get_balance() - cost);
            System.out.println(
                    this.get_name() + "ödeme yapti. ödenen tutar : " + cost + "yeni bakiye : " + this.get_balance());
            return true;
        }
        System.out.println("FAKİRSİN, ALMA BİŞEY");
        return false;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

}
