package SinavSoruCozum.Kutuphane;

public class Book extends DbMateryal {
    private String isbn;
    private String librarycode;

    public Book(String materyalType, String materyalName, String isbn, String librarycode) {
        super(materyalType, materyalName);
        this.isbn = isbn;
        this.librarycode = librarycode;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLibrarycode() {
        return librarycode;
    }

    public void setLibrarycode(String librarycode) {
        this.librarycode = librarycode;
    }

}
