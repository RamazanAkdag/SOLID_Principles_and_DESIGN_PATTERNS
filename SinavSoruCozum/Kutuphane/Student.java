package SinavSoruCozum.Kutuphane;

public class Student extends DbUser {
    private String ogrno;

    public Student(String userType, String name, String userName, String ogrno) {
        super(userType, name, userName);
        this.ogrno = ogrno;
    }

    public String getOgrno() {
        return ogrno;
    }

    public void setOgrno(String ogrno) {
        this.ogrno = ogrno;
    }

}
