package enteties;

public class User {
    private String login;
    private String password;
    private String email;
    private String age;
    private String country;
    private int id;


    private String avatar;

    public User(String login, String password, String email, String age, String country, int id, String avatar) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
        this.country = country;
        this.id = id;
        this.avatar = avatar;
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

    public String getAvatar() {
        if (avatar != null) {
            return avatar;
        } else return "default";
    }

}
