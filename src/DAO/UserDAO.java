package DAO;


import enteties.User;

public interface UserDAO {
    User getByUsername(String username);
    User getById(int id);
}
