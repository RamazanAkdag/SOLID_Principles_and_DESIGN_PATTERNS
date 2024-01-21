
public abstract class User implements IPayable {

    protected String _name;
    protected Cart _cart;
    protected double _balance;

    public User(String _name, double _balance) {
        this._name = _name;
        this._cart = new Cart();
        this._balance = _balance;
    }

    public boolean addProductToCart(Product product) {
        return this.get_cart().getProducts().add(product);
    }

    public boolean removeProductFromCart(Product product) {
        return this.get_cart().getProducts().remove(product);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Cart get_cart() {
        return _cart;
    }

    public void set_cart(Cart _cart) {
        this._cart = _cart;
    }

    public double get_balance() {
        return _balance;
    }

    public void set_balance(double _balance) {
        this._balance = _balance;
    }

}
