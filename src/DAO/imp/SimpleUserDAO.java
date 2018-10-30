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
            return new User(login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        boolean res = false;
        try {
            Statement statement = connection.createStatement();
            res = statement.execute("insert into \"user_table\"(name, password) values("+user.getLogin()
                    +"','"+user.getPassword()+")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
