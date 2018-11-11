package servlets;

import enteties.Post;
import enteties.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import services.PostService;
import services.UserService;
import templates.ConfigSingleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class NewPostServlet extends HttpServlet {
    PostService postService = new PostService();
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User curUser = userService.getCurrentUser(request);
        String text = request.getParameter("text");
        postService.addPost(new Post(text, curUser));

        response.sendRedirect("/profile");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("newPost.ftl");

        HashMap<String, Object> root = new HashMap<>();
        User currentUser = userService.getCurrentUser(request);
        if (currentUser != null) {
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
