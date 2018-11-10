package DAO;


import enteties.User;

public interface UserDAO {
    User getByUsername(String username);

    User addUser(String login, String password, String email, String age, String country);
}
