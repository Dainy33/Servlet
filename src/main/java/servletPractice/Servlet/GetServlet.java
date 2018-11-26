package servletPractice.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String docType = "<!DOCTYPE html>";
        String title = "GetServlet";
        PrintWriter out = response.getWriter();
        String html = docType + "\n" +
                "<html>" + "\n" +
                "<head>" + "\n" +
                "<title>" + title + "</title>" + "\n" +
                "</head>" + "\n" +
                "<body>" + "\n" +
                "<h1>" + "GetServlet" + "</h1>" + "\n" +
                "<p>" + "name:" + request.getParameter("name") + "</p>" + "\n" +
                "<p>" + "value:" + request.getParameter("value") + "</p>" + "\n" +
                "</body>" + "\n" +
                "</html>";
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
/**
 * @program: servletPractice
 * @description:
 * @author: Dainy33
 * @create: 2018-11-26 14:15
 **/
