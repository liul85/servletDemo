/**
 * Created by liangliu on 7/9/15.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Default extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String errMsg = "Not supported method.";
        String method = req.getMethod();
        if ("GET" != method) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, method);
        }
    }
}
