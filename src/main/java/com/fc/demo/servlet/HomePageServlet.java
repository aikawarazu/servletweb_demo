package com.fc.demo.servlet;

import java.io.IOException;

public class HomePageServlet extends javax.servlet.http.HttpServlet {

  protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

  }

  protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {
    response.getOutputStream().print("i am home aaa");
  }
}
