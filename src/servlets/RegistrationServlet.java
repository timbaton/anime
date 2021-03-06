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
import java.io.IOException;
import java.util.HashMap;

public class RegistrationServlet extends HttpServlet {

    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User curUser = userService.getCurrentUser(request);
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String country = request.getParameter("country");

        if (curUser != null) {
            response.sendRedirect("/profile");
        } else {
            curUser = userService.registerUser(login, password, email, age, country);
            if (curUser != null) {
                userService.authorize(curUser, request);
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
        root.put("logged", userService.getCurrentUser(request)!=null);
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
