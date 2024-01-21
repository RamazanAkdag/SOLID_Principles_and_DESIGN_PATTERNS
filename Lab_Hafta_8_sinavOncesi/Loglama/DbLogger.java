package Lab_Hafta_8_sinavOncesi.Loglama;

public class DbLogger implements Logger, DbConnect {

    @Override
    public void connect() {
        System.out.println("Connected to db.");
    }

    @Override
    public void close() {
        System.out.println("connection closed.");
    }

    @Override
    public void log(String message) {
        connect();
        System.out.println("logged to db : " + message);
        close();
    }

}
