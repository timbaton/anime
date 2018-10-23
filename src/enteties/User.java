package enteties;

public class User {
    private String userName;
    private String password;
    private int id;


    public User(String userName, String password, int id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
