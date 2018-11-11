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
import javax.servlet.http.Part;
import java.io.*;
import java.util.HashMap;

public class EditServlet extends HttpServlet {
    private UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User curUser = userService.getCurrentUser(request);
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String country = request.getParameter("country");
        userService.editUser(curUser, email, age, country, null);
        response.sendRedirect("/profile");
//        if (curUser != null) {
//            response.sendRedirect("/profile");
//        } else {
//            final String path = "C:\\Univer\\Infa\\projectAbramskiy\\PonLine\\web\\UserPics";
//            final Part filePart = request.getPart("file");
//            String fileName;
//            if(filePart.getSize()==-1) {
//                fileName = System.currentTimeMillis()+ getFileName(filePart);
//
//                OutputStream out = null;
//                InputStream filecontent = null;
//                final PrintWriter writer = response.getWriter();
//
//                try {
//                    out = new FileOutputStream(new File(path + File.separator
//                            + fileName));
//                    filecontent = filePart.getInputStream();
//
//                    int read = 0;
//                    final byte[] bytes = new byte[512];
//
//                    while ((read = filecontent.read(bytes)) != -1) {
//                        out.write(bytes, 0, read);
//                    }
//                } catch (FileNotFoundException fne) {
//                } finally {
//                    if (out != null) {
//                        out.close();
//                    }
//                    if (filecontent != null) {
//                        filecontent.close();
//                    }
//                    if (writer != null) {
//                        writer.close();
//                    }
//                }
//                userService.editUser(curUser, email, age, country, "../UserPics/"+fileName);
//            } else{
//                userService.editUser(curUser, email, age, country, null);
//            }
//
//            if (curUser != null) {
//                userService.authorize(curUser, request);
//                response.sendRedirect("/profile");
//            } else {
//                response.sendRedirect("/registration");
//            }
//
//        }
    }

    private String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("edit.ftl");
        HashMap<String, Object> root = new HashMap<>();
        try {
            tmpl.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
