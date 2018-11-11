package enteties;

public class User {
    private String login;
    private String password;
    private String email;
    private String age;
    private String country;
    private int id;

    public User(String login, String password, String email, String age, String country, int id) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
        this.country = country;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }
}
