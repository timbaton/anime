package DAO.imp;


import DAO.PostDAO;
import DAO.SingletonConnection;
import DAO.UserDAO;
import enteties.Post;
import enteties.User;

import java.sql.*;

public class PostDAOImp implements PostDAO {

    private Connection connection = SingletonConnection.getConnection();


    @Override
    public User getAllUsersPost(String username) {
        return null;
    }

    @Override
    public boolean addPost(User user, Post post) {
        boolean res = false;
        Timestamp date = new Timestamp(System.currentTimeMillis());
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO post  (text, user_id, date_create) VALUES (?, ?, ?)");
            statement.setString(1, post.getText());
            statement.setInt(2, user.getId());
            statement.setTimestamp(3, date);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
