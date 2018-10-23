package servlets;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import templates.ConfigSingleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class ProfileServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("profile.ftl");
        HashMap<String, Object> root = new HashMap<>();
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
