package servlets;

import enteties.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import services.UserService;
import templates.ConfigSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.HashMap;

@MultipartConfig
public class EditServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User curUser = userService.getCurrentUser(request);
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String country = request.getParameter("country");


        Part filePart = request.getPart("file");
        userService.updateUserPicture(filePart.getInputStream(), curUser);
        userService.editUser(curUser, email, age, country);

        response.sendRedirect("/profile");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("edit.ftl");

        HashMap<String, Object> root = new HashMap<>();
        User currentUser = userService.getCurrentUser(request);
        if (currentUser != null) {
            root.put("user", currentUser);
            root.put("logged", true);
            try {
                tmpl.process(root, response.getWriter());
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("/login");
        }
    }
}
