public class MSSQLDBAdapter implements DB {
    MSSQL mssql;

    public MSSQLDBAdapter() {
        mssql = new MSSQL();
    }

    @Override
    public User selectUserById(int id) {
        return mssql.userById(id);
    }

    @Override
    public void insertUser(User user) {
        mssql.user(user);
    }

}
