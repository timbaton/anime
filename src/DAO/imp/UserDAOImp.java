package DAO.imp;


import DAO.SingletonConnection;
import DAO.UserDAO;
import enteties.User;

import java.sql.*;

public class UserDAOImp implements UserDAO {

    private Connection connection = SingletonConnection.getConnection();

    @Override
    public User getByUsername(String name) {
        try {
            PreparedStatement st = connection.prepareStatement("select * from \"user_table\" where login=?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            rs.next();
            String password = rs.getString("password");
            String login = rs.getString("login");
            String email = rs.getString("email");
            String age = rs.getString("age");
            String country = rs.getString("country");
            int id = rs.getInt("id");
            return new User(login, password, email, age, country, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getById(int user_id) {
        try {
            PreparedStatement st = connection.prepareStatement("select * from \"user_table\" where id=?");
            st.setInt(1, user_id);
            ResultSet rs = st.executeQuery();
            rs.next();
            String password = rs.getString("password");
            String login = rs.getString("login");
            String email = rs.getString("email");
            String age = rs.getString("age");
            String country = rs.getString("country");
            int id = rs.getInt("id");
            return new User(login, password, email, age, country, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User addUser(String login, String password, String email, String age, String country) {
        boolean res = false;
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user_table  (login, password, email, age, country) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, login);
            statement.setString(2, password);
            statement.setString(3, email);
            statement.setString(4, age);
            statement.setString(5, country);
            statement.executeUpdate();
            statement.close();
            res = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getByUsername(login);
    }

    @Override
    public void editUser(User curUser, String email, String age, String country, String fileName) {
        try {
            PreparedStatement statement = connection.prepareStatement(" UPDATE user_table\n" +
                    "SET email   = ?,\n" +
                    "    age     = ?,\n" +
                    "    country = ?,\n" +
                    "    file_path = ?\n" +
                    "\n" +
                    "WHERE id = ?;\n");
            statement.setString(1, email);
            statement.setString(2, age);
            statement.setString(3, country);
            statement.setString(4, fileName);
            statement.setInt(5, curUser.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
