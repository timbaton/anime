package DAO;


import enteties.User;

public interface UserDAO {
    User getByUsername(String username);

    boolean addUser(User user);
}
