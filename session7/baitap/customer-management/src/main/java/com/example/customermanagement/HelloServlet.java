package com.example.customermanagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "customer-list", value = "/customerList")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("duc","15/2/2003","Ha Noi","https://musicart.xboxlive.com/7/4d4d6500-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"));
        customerList.add(new Customer("tu","15/2/2003","Ha Noi","https://musicart.xboxlive.com/7/4d4d6500-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"));
        customerList.add(new Customer("son","15/2/2003","Ha Noi","https://musicart.xboxlive.com/7/4d4d6500-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"));
        customerList.add(new Customer("lam","15/2/2003","Ha Noi","https://musicart.xboxlive.com/7/4d4d6500-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"));
        customerList.add(new Customer("diep","15/2/2003","Ha Noi","https://musicart.xboxlive.com/7/4d4d6500-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"));

        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }

    public void destroy() {
    }
}