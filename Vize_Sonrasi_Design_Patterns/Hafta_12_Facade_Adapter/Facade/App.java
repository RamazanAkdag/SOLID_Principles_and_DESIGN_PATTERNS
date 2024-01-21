import Facade.AkilliEvFacade;
import Facade.AkilliEvSistemiFacade;

public class App {

    public static void main(String[] args) {
        AkilliEvSistemiFacade facade = new AkilliEvSistemiFacade();

        facade.televizyonSinemaModu();
        facade.televizyonUykuModu();

    }
}