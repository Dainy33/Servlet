package servletPractice.Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置响应内容类型
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        String html = "<h1>" + "Hello Servlet!" + "</h1>" +
                "<p>" + "My First ServletDemo" + "</p>";
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

}
/**
 * @program: servletPractice
 * @description:
 * @author: Dainy33
 * @create: 2018-11-26 11:09
 **/
