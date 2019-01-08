package com.mainserver.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.MessageFormat;

public class Servlet1 extends HttpServlet {

    //http://localhost:8080/s1?a=10&b=21
    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        String response = MessageFormat.format(
                "<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "<h1>{0} + {1} = {2}</h1>" +
                        "</body>" +
                        "</html>",
                a,
                b,
                a + b
        );
        resp.addHeader("Content-Type", "text/html");
        resp.getWriter().println(response);
    }

}