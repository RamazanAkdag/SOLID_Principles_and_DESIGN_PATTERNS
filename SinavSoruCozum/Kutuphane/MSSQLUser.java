package SinavSoruCozum.Kutuphane;

public class MSSQLUser implements IDatabase {

    @Override
    public void add(IDbModel dbModel) {
        if (dbModel instanceof DbUser) {
            System.out.println(((DbUser) dbModel).getName() + " isimli kullanici veritabanina eklendi...");
        }
    }

    @Override
    public void remove(IDbModel dbModel) {
        if (dbModel instanceof DbUser) {
            System.out.println(((DbUser) dbModel).getUserName() + " nickli kullanici veritabanindan silindi...");
        }
    }

    @Override
    public void search(String username) {

        System.out.println(username + " isimli kullanici veritabaninda araniyor...");

    }

}
