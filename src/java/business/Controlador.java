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

        } else if (op.equals("catalogoEAdmin")) {
            String categoria = "elementos";

            ArrayList lista = DBHandler.getCatalogo(categoria);

            url = "/catalogoAdmin.jsp";
            request.setAttribute("catalogo", lista);
        } else if (op.equals("catalogoMAdmin")) {
            String categoria = "materiales";

            ArrayList lista = DBHandler.getCatalogo(categoria);

            url = "/catalogoAdmin.jsp";

            request.setAttribute("catalogo", lista);
        } else if (op.equals("vermas")) {
            String orden = request.getParameter("oden");

            ArrayList lista = DBHandler.getPedidos(orden);

            request.setAttribute("pedidos", lista);
            url = "/infoPedido.jsp";

        }
        else if (op.equals("vermas2")) {
            String orden = request.getParameter("oden");

            ArrayList lista = DBHandler.getPedidos(orden);

            request.setAttribute("pedidos", lista);
            url = "/infoPedido2.jsp";

        }
        else if (op.equals("aceptar")) {
            String orden = request.getParameter("oden");
            DBHandler.updateStatusPedido(orden, "Aceptado");
            url = "/Controlador?operacion=allPedidos";
        } else if (op.equals("rechazar")) {

            String orden = request.getParameter("oden");
            DBHandler.updateStatusPedido(orden, "Rechazado");
            DBHandler.retornarPedido(orden);
            url = "/Controlador?operacion=allPedidos";
        } else if (op.equals("allPedidos")) {
            ArrayList lista = DBHandler.getAllPedidos();

            request.setAttribute("pedidos", lista);
            url = "/prestamos.jsp";

        } else if (op.equals("retornar")) {
            String orden = request.getParameter("oden");
            DBHandler.retornarPedido(orden);
            DBHandler.entregarPedido(orden);

            url = "/Controlador?operacion=allPedidos";
        } else if (op.equals("misPedidos")) {
            String matricula = request.getParameter("matricula");

            ArrayList lista = DBHandler.misPedidos(matricula);

            request.setAttribute("pedidos", lista);
            url = "/vermisPedidos.jsp";

        } 
        else 
        {
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
        String numOrden = DBHandler.getNumOrden();

        //Obtener cada uno de los elemenos del arreglo de pedidos
        for (Iterator iterator = pedidos.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            String pe = pedidos.get(key).toString();
            //System.out.println("key: " + key);
            //System.out.println("cant: " + pe);
            DBHandler.setPedido(nombre, matricula, pe, key, numOrden);

        }
        System.out.println("Fin de post");

    }

}
