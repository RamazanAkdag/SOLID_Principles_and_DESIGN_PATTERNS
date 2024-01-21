import java.util.ArrayList;

public class MSSQL {
    public ArrayList<User> users;

    public int id;

    public MSSQL() {
        this.users = new ArrayList<>();
        id = 0;
    }

    public User userById(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    public void user(User user) {
        id++;
        user.setId(id);
        this.users.add(user);
    }

}
