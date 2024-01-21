package Lab_Hafta_8_sinavOncesi.Loglama;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Logged to console : " + message);
    }

}
