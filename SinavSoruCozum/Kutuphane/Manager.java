package SinavSoruCozum.Kutuphane;

public class Manager extends DbUser {
    private String sicilno;

    public Manager(String userType, String name, String userName, String sicilno) {
        super(userType, name, userName);
        this.sicilno = sicilno;

    }

    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        this.sicilno = sicilno;
    }

}
