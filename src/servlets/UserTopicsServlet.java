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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserTopicsServlet extends HttpServlet {
    PostService postService = new PostService();
    UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("topics.ftl");
        HashMap<String, Object> root = new HashMap<>();
        User currentUser = userService.getCurrentUser(request);
        ArrayList<Post> posts = postService.getUserPost(currentUser);

        root.put("form_url", request.getRequestURI());
        root.put("logged", currentUser != null);
        root.put("user", currentUser);
        root.put("posts", posts);
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
