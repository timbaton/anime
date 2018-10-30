package db;


import enteties.User;

import java.util.ArrayList;
import java.util.List;

public class PseudoDataBase {
    private static List<User> users;
    private static int id = 0;

    public static List<User> getUsers() {
        if (users == null) {
            users = new ArrayList<>();
            users.add(new User("andrey2000", "edward", 0));
            users.add(new User("andrey99", "nail", 1));
            users.add(new User("lesya", "1234", 2));
            id = 2;
        }
        return users;
    }

    public static User addUser(String userName, String password) {
        id++;
        User newUser = new User(userName, password, id);
        users.add(newUser);
        return newUser;
    }
}
