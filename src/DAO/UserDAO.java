package DAO;


import enteties.User;

public interface UserDAO {
    User getByUsername(String username);
    User getById(int user_id);

    User addUser(String login, String password, String email, String age, String country);

    void editUser(User curUser, String email, String age, String country);

    boolean updateUserPicture(String pathname, User user);
}
