package services;


import DAO.UserDAO;
import DAO.imp.UserDAOImp;
import enteties.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserService {

    private UserDAO userDAO = new UserDAOImp();

    public User getCurrentUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("current_user");
        return user;
    }

    public User authenticate(HttpServletRequest request) {
        String username = request.getParameter("login");
        if (username != null) {
            User user = userDAO.getByUsername(username);
            if (user == null) {
                return null;
            }
            String password = request.getParameter("password");
            if (password.equals(user.getPassword())) {
                return user;
            } else {
                return null;
            }
        }
        return null;
    }

    public void authorize(User current_user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("current_user", current_user);
    }

    public User registerUser(String login, String password, String email, String age, String country) {
        return userDAO.addUser(login, password, email, age, country);
    }
}
