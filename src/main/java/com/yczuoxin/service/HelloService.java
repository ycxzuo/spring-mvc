package com.yczuoxin.service;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/hello")
public class HelloService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = req.getServletContext();
        Enumeration<String> names = servletContext.getAttributeNames();
        while (names.hasMoreElements()) {
            String s = names.nextElement();
            System.out.println(s);
        }
        resp.getWriter().write("hello servlet");
    }
}
