/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author Willian
 */
@WebServlet(name = "Inicar", urlPatterns = {"/iniciar"})
public class Iniciar extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String responseS="false";
        String idProducto = request.getParameter("producto");
        if(SesionProduccion.getIdProducto()==0 && idProducto!=null){
            SesionProduccion.setHora_inicio(new Date());
            SesionProduccion.setIdProducto(Integer.parseInt(idProducto));
            responseS="true";
        } else {
            responseS="false";
        }
        response.setContentType("application/json");
        try (PrintWriter out = response.getWriter()) {
            out.println(responseS);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
