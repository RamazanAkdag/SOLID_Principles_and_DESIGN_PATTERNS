package Lab_Hafta_8_sinavOncesi.Loglama;

public class App {
    public static void main(String[] args) {

        ConsoleLogger consoleLogger = new ConsoleLogger();
        DbLogger dbLogger = new DbLogger();

        consoleLogger.log("konsola yaz bakalım");

        dbLogger.log("Veritabanına yaz bakalım");

    }
}
