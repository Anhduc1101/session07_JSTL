package com.example.calculatorapplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            double operand1 = Double.parseDouble(req.getParameter("operand1"));
            double operand2 = Double.parseDouble(req.getParameter("operand2"));
            String operator = req.getParameter("operator");

            double result = Calculator.calculate(operand1, operand2, operator);

            req.setAttribute("operand1", operand1);
            req.setAttribute("operand2", operand2);
            req.setAttribute("operator", operator);
            req.setAttribute("result", result);
            req.getRequestDispatcher("result.jsp").forward(req, resp);
        } catch (Exception e) {
            System.out.println("Mẫu số phải khác 0");
        }
    }
}