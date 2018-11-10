package enteties;

import java.sql.Timestamp;

public class Post {
    int id;
    String text;
    int user_id;
    Timestamp date_create;

    public Post(String text, int user_id) {
        this.text = text;
        this.user_id = user_id;
    }

    public Post(String text, int user_id, Timestamp date_create) {
        this.text = text;
        this.user_id = user_id;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Timestamp getDate_create() {
        return date_create;
    }

    public void setDate_create(Timestamp date_create) {
        this.date_create = date_create;
    }
}
