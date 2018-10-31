package servlets;

import enteties.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import services.UserService;
import templates.ConfigSingleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User curUser = userService.getCurrentUser(request);
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String country = request.getParameter("country");

        if (curUser != null) {
            response.sendRedirect("/profile"); //как он вообще сюда попал
        } else {
            Pattern pattern = Pattern.compile("^(?=.*[A-Za-z0-9]$)[A-Za-z][A-Za-z\\d.-]{0,19}$");
            Matcher matcher = pattern.matcher(login);
            if (matcher.matches()) {
                userService.registerUser(login, password, email, age, country);
                userService.authorize(new User(login, password, email, age, country), request);
                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/registration");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("registration.ftl");
        HashMap<String, Object> root = new HashMap<>();
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
