import java.util.ArrayList;

public class Oracle implements DB {
    public ArrayList<User> users;

    public int id;

    public Oracle() {
        this.users = new ArrayList<>();
        id = 0;
    }

    @Override
    public User selectUserById(int id) {
        for (User user : users) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void insertUser(User user) {
        count();
        user.setId(id);
        this.users.add(user);
    }

    public void count() {
        id++;
    }

}