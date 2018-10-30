package enteties;

public class User {
    private String login;
    private String surname;
    private String password;
    private String email;
    private String country;
    private int age;
    private int id;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
