package com.liul85.tw; /**
 * Created by liangliu on 7/9/15.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Default extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head><title>com.liul85.tw.Default Request Page</title></head>");
        out.println("<body>");
        out.println("<h1>This is a default request page.</h1>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
