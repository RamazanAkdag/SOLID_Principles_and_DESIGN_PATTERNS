package SinavSoruCozum.Kutuphane;

public abstract class DbMateryal implements IDbModel {

    protected String materyalType;
    protected String materyalName;

    public DbMateryal(String materyalType, String materyalName) {
        this.materyalType = materyalType;
        this.materyalName = materyalName;
    }

    public String getMateryalType() {
        return materyalType;
    }

    public void setMateryalType(String materyalType) {
        this.materyalType = materyalType;
    }

    public String getMateryalName() {
        return materyalName;
    }

    public void setMateryalName(String materyalName) {
        this.materyalName = materyalName;
    }

}
