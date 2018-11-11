package DAO.imp;


import DAO.PostDAO;
import DAO.SingletonConnection;
import enteties.Post;

import java.sql.*;
import java.util.ArrayList;

public class PostDAOImp implements PostDAO {

    private Connection connection = SingletonConnection.getConnection();


    @Override
    public ArrayList<Post> getAllUsersPost(int user_id) {
        ArrayList<Post> newsList = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement("select * from user_table as ut inner join post as po ON po.user_id = ut.id where ut.id = ?");
            st.setInt(1, user_id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                newsList.add(new Post(rs.getString("text"), rs.getInt("user_id"), rs.getTimestamp("date_create")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return newsList;
    }

    @Override
    public boolean addPost(Post post) {
        boolean res = false;
        Timestamp date = new Timestamp(System.currentTimeMillis());
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO post  (text, user_id, date_create) VALUES (?, ?, ?)");
            statement.setString(1, post.getText());
            statement.setInt(2, post.getUserId());
            statement.setTimestamp(3, date);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> newsList = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement("select * from post");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                newsList.add(new Post(rs.getString("text"), rs.getInt("user_id"), rs.getTimestamp("date_create")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
