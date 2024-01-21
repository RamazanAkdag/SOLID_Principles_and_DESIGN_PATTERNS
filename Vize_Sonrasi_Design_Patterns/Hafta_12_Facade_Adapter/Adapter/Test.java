public class Test {
    public static void main(String[] args) {
        Service oracleService = new Service(new Oracle());
        Service mssSqlService = new Service(new MSSQLDBAdapter());

        oracleService.addUser(new User("Ramazan", "Akdağ"));
        mssSqlService.addUser(new User("Rozerin", "Akdağ"));

        System.out.println(oracleService.getUser(1));
        System.out.println(mssSqlService.getUser(1));
    }
}
