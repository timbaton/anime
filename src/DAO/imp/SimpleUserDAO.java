package DAO.imp;


import DAO.UserDAO;
import db.PseudoDataBase;
import enteties.User;

import java.util.List;

public class SimpleUserDAO implements UserDAO {
    @Override
    public User getByUsername(String username) {
        List<User> users = PseudoDataBase.getUsers();
        for (User user: users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getById(int id) {
        List<User> users = PseudoDataBase.getUsers();
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
