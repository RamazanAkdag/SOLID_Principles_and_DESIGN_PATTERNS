package SinavSoruCozum.Kutuphane;

public interface IDatabase {
    public void add(IDbModel dbModel);

    public void remove(IDbModel dbModel);

    public void search(String string);

}
