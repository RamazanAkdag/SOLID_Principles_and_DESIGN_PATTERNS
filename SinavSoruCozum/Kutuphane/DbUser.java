package SinavSoruCozum.Kutuphane;

public abstract class DbUser implements IDbModel {
    protected String userType;
    protected String name;
    protected String userName;

    public DbUser(String userType, String name, String userName) {
        this.userType = userType;
        this.name = name;
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
