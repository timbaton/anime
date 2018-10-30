package DAO.imp;


import DAO.SingletonConnection;
import DAO.UserDAO;
import enteties.User;

import java.sql.*;

public class SimpleUserDAO implements UserDAO {

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
            return new User(login, password, email, age, country);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        boolean res = false;
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user_table  (login, password, email, age, country) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getAge());
            statement.setString(5, user.getCountry());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
