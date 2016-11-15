/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.Catalogo;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Controlador extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        //Get parameters from the request.
        String nombre = request.getParameter("Nombre");
        String marca = request.getParameter("Marca");
        String status = request.getParameter("Status");
        String cantidad = request.getParameter("Cantidad");
        String id = request.getParameter("ID");
        String capacidad = request.getParameter("Capacidad");

        nombre = "Vaso Precipitado";
        marca = "Quimica";
        status = "Disponible";
        cantidad = "15";
        id = "1425";
        capacidad = "50ml";

        ArrayList lista = DBHandler.getCatalogo();
        
        //Catalogo catalogo = new Catalogo(nombre,capacidad, marca, status, cantidad, id);

        String url = "/catalogo.jsp";

        request.setAttribute("catalogo", lista);

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
