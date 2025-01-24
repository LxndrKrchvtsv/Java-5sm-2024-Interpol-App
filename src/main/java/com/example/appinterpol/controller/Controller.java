package com.example.appinterpol.controller;

import java.io.*;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Controller extends HttpServlet {
    private static final Logger logger = LogManager.getLogger();

    public Controller() {

    }

    public void init() {
        logger.info("Using directory: {}", System.getProperty("user.dir"));
        logger.info("Servlet initialized with message: {}", "Hello World");
        logger.info("Информация");
        logger.error("Ошибка");
        logger.debug("Отладка");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String numStr = request.getParameter("number");
        int num = Integer.parseInt(numStr);

        num *= 2;

        request.setAttribute("greeting", num);
        request.getRequestDispatcher("/jsp/main.jsp").forward(request, response);
    }

    public void destroy() {
    }
}