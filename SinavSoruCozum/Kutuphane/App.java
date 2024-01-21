package SinavSoruCozum.Kutuphane;

public class App {
    public static void main(String[] args) {
        Book book = new Book("book", "Şeker Portakalı", "1221245", "TA-24");

        IDatabase dbm = new MSSQLMateryal();
        dbm.add(book);
        dbm.remove(book);
        dbm.search("Güliver in gezileri");

        System.out.println("----------------------------");

        E_Book ebook = new E_Book("ebook", "Suc ve Ceza", "https://sucveceza.com");

        dbm = new MSSQLMateryal();
        dbm.add(ebook);
        dbm.remove(ebook);
        dbm.search("Donusum");

        System.out.println("-------------------------------");

        DbUser user = new Student("student", "Mehmet Turgut", "OgrenciMehmet", "1923");
        IDatabase dbu = new MSSQLUser();
        dbu.add(user);
        dbu.remove(user);
        dbu.search("Ali veli");

        System.out.println("-------------------------------");

        user = new Manager("manager", "Ahmet", "YoneticiAhmet", "55532");
        dbu.add(user);
        dbu.remove(user);
        dbu.search("Zeynep deneme");

    }
}
