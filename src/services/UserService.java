package services;


import DAO.UserDAO;
import DAO.imp.UserDAOImp;
import enteties.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {

    private UserDAO userDAO = new UserDAOImp();

    public User getCurrentUser(HttpServletRequest request) {
        checkLoggedCookie(request);

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("current_user");
        return user;
    }

    private void checkLoggedCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String userName = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    userName = cookie.getValue();
                    User user = userDAO.getByUsername(userName);
                    authorize(user, request);
                }
            }
        }
    }

    public User authenticate(HttpServletRequest request, HttpServletResponse response) {
        Pattern loginPattern = Pattern.compile("^(?=.*[A-Za-z0-9]$)[A-Za-z][A-Za-z\\d.-]{0,19}$");
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])[0-9a-zA-Z]{4,}$");

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        Matcher loginMatcher = loginPattern.matcher(username);

        if (loginMatcher.matches()) {
            User user = userDAO.getByUsername(username);
            if (user == null) {
                return null;
            }

            if (password.equals(user.getPassword()) && passwordMatcher.matches()) {
                if(remember!=null) {
                    saveUserCookie(response, username);
                }
                return user;
            } else {
                return null;
            }
        }
        return null;
    }

    private void saveUserCookie(HttpServletResponse response, String username) {
        Cookie cookie = new Cookie("user", username);
        cookie.setMaxAge(60);
        response.addCookie(cookie);
    }

    public void authorize(User current_user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("current_user", current_user);
    }

    public User registerUser(String login, String password, String email, String age, String country) {
        Pattern loginPattern = Pattern.compile("^(?=.*[A-Za-z0-9]$)[A-Za-z][A-Za-z\\d.-]{0,19}$");
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])[0-9a-zA-Z]{4,}$");
        Pattern mailPattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Pattern agePattern = Pattern.compile("^[1-9]{1,4}$");
        Pattern countryPattern = Pattern.compile("[A-Za-z]+");

        Matcher loginMatcher = loginPattern.matcher(login);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        Matcher mailMatcher = mailPattern.matcher(email);
        Matcher ageMatcher = agePattern.matcher(age);
        Matcher countryMatcher = countryPattern.matcher(country);

        if (loginMatcher.matches() && passwordMatcher.matches() && mailMatcher.matches()
                && ageMatcher.matches() && countryMatcher.matches()) {
            return userDAO.addUser(login, password, email, age, country);
        } else return null;
    }

    public User getUserById(int user_id) {
        return userDAO.getById(user_id);
    }

    public void logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.setAttribute("current_user", null);

        //delete cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null)
            for (Cookie cookie : cookies) {
                cookie.setValue("");
                cookie.setPath("/");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
    }
}
