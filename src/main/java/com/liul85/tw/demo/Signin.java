package com.liul85.tw.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liangliu on 7/9/15.
 */
public class Signin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String pwd = req.getParameter("userPwd");

        PrintWriter response = resp.getWriter();
        response.println("<!DOCTYPE HTML>");
        response.println("<html>");
        response.println("<body>");
        response.println("<li>");
        response.println(String.format("Name: %s", name));
        response.println("</li>");
        response.println("<br />");
        response.println("<li>");
        response.println(String.format("Password: %s", pwd));
        response.println("</li>");
        response.println("</body>");
        response.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
