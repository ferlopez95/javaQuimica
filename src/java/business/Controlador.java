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
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.*;

/**
 *
 * @author Fernando
 */
public class Controlador extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        //Get parameters from the request.
        String op = request.getParameter("operacion");
        //String datos = request.getParameter("datos").toString();
        String url = "";
        System.out.println(op);

        if (op.equals("catalogoM")) {
            String categoria = "materiales";

            ArrayList lista = DBHandler.getCatalogo(categoria);

            url = "/catalogo.jsp";

            request.setAttribute("catalogo", lista);

        } else if (op.equals("catalogoE")) {
            String categoria = "elementos";

            ArrayList lista = DBHandler.getCatalogo(categoria);

            url = "/catalogo.jsp";
            request.setAttribute("catalogo", lista);

        } else if (op.equals("separar")) {
            String selectStr = request.getParameter("datos");
            String[] arrayStrs = request.getParameterValues("datos[]");
            String[] myJsonData = request.getParameterValues("json[]");
            System.out.println("Entro1");
            System.out.println(myJsonData);
            /* System.out.println(arrayStrs);

            if (arrayStrs != null) {
                for (int i = 0; i < arrayStrs.length; i++) {
                    System.out.println(arrayStrs[i] + "<br>");
                }
            }
             */

            url = "/index.html";
        } else {
            System.out.println("Error en la pagina");

        }

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String keyPedido = "";
        System.out.println("Entro PSOT");

        JSONObject obj;

        //Obtener valores del usuario del Json que se llega    
        String myJsonData = request.getParameter("json");
        obj = new JSONObject(myJsonData);
        String email = obj.getString("email");
        String matricula = obj.getString("matricula");
        String nombre = obj.getString("nombre");

        //Obtener el Json de productos seleccionados
        JSONObject pedidos = obj.getJSONObject("pedido");

        //Obtener cada uno de los elemenos del arreglo de pedidos
        for (Iterator iterator = pedidos.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            String pe =  pedidos.get(key).toString();
            //System.out.println("key: " + key);
            //System.out.println("cant: " + pe);
            DBHandler.setPedido(nombre, matricula, pe, key);

            //System.out.println(pe);
        }
        System.out.println("Fin de post");

    }

}
