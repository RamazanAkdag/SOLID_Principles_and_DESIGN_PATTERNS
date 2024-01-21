package SinavSoruCozum.Kutuphane;

public class E_Book extends DbMateryal {
    private String webaddress;

    public E_Book(String materyalType, String materyalName, String webaddress) {
        super(materyalType, materyalName);
        this.webaddress = webaddress;

    }

    public String getWebaddress() {
        return webaddress;
    }

    public void setWebaddress(String webaddress) {
        this.webaddress = webaddress;
    }

}
