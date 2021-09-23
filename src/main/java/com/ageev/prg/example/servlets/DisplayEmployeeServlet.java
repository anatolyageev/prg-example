package com.ageev.prg.example.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayEmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DisplayEmployeeServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        int success = Integer.parseInt(request.getParameter("s"));
        if (success == 1)
            request.setAttribute("result", "Employee Successfully Inserted");
        else
            request.setAttribute("result",
                    "Employee Not Inserted: " + request.getAttribute("error"));
        RequestDispatcher view = request
                .getRequestDispatcher("displayEmployee.jsp");
        view.forward(request, response);
    }
}
