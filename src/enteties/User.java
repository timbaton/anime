package enteties;

public class User {


    private String userName;
    private String password;
    private String email;
    private int age;
    private String country;
    private int id;


    public User(String userName, String password, int id) {
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public User(String userName, String password, String email, int age, String country, int id) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
        this.country = country;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
