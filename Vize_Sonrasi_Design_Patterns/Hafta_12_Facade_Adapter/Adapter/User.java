public class User {

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

    public int id;
    public String name;
    public String surname;

    public User(String name, String surname) {

        setName(name);
        setSurname(surname);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
