package enteties;

import services.UserService;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.TimeZone;

public class Post {
    static UserService userService = new UserService();
    int id;
    String text;
    User user;
    Timestamp date_create;

    public Post(String text, User user) {
        this.text = text;
        this.user = user;
    }

    public Post(String text, int user_id, Timestamp date_create) {
        this(text, userService.getUserById(user_id), date_create);
    }

    public Post(String text, User user, Timestamp date_create) {
        this.text = text;
        this.user = user;
        this.date_create = date_create;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser_id(User user) {
        this.user = user;
    }

    public String getDate_create() {
        return new SimpleDateFormat("yyyy.MM.dd - HH:mm").format(date_create);
    }

    public void setDate_create(Timestamp date_create) {
        this.date_create = date_create;
    }

    public String getAuthor() {
        return user.getLogin();
    }

    public int getUserId() {
        return user.getId();
    }

    public String getAuthorAvatar() {
        return user.getAvatar();
    }
}
