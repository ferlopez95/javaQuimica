<%-- 
    Document   : catalogo
    Created on : 14-Nov-2016, 12:00:30
    Author     : Fernando
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="business.DBHandler"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css"/>
        <title>Cat&aacute;logo Qu&iacute;mica</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
    </head>
    <body>
        <%@page import="business.Catalogo" %>
        <% ArrayList catalogo = (ArrayList) request.getAttribute("catalogo");%>

        <!-- Navbar -->
        <div class="w3-top">
            <ul class="w3-navbar w3-blue-grey w3-card-2 w3-left-align w3-large">
                <li class="w3-hide-medium w3-hide-large w3-opennav w3-right">
                    <a class="w3-padding-large w3-hover-white w3-large w3-blue-grey" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                </li>
                <li><a href="index.html" class="w3-padding-large w3-white">Home</a></li>
                <li class="w3-hide-small"><a href="prestamo.html" class="w3-padding-large w3-hover-white">Pr&eacute;stamo</a></li>
                <li class="w3-hide-small"><a href="devolucion.html" class="w3-padding-large w3-hover-white">Devoluci&oacute;n</a></li>
                <li class="w3-hide-small"><a href="ingresar.html" class="w3-padding-large w3-hover-white">Ingresar como administrador</a></li>
                <li class="w3-hide-small"><a href="Controlador" class="w3-padding-large w3-hover-white">Cat&aacute;logo de productos</a></li>

            </ul>

        </div>

        <!-- Second Grid -->
        <div class="w3-row-padding w3-padding-64 w3-container">
            <div class="w3-content">
                <div class="w3-twothird">
                    <table cellspacing="5" cellpadding="5" border="1">
                        <tr>
                            <td>ID:</td>
                            <td>Descripci&oacute;n:</td>
                            <td>Capacidad:</td>
                            <td>Marca:</td>
                            <td>Cantidad:</td>
                        </tr>
                        <% for(int i=0; i<catalogo.size(); i++) { 
                            Catalogo c = (Catalogo) catalogo.get(i);
                        %>
                        <tr>
                            <td><%= c.getID() %></td>
                            <td><%= c.getNombre() %></td>
                            <td><%= c.getCantidad() %></td>
                            <td><%= c.getStatus() %></td>
                            <td><%= c.getMarca() %></td>
                        </tr>
                        <% } %>
                    </table>
                </div>
            </div>
        </div>

        <script>
            // Used to toggle the menu on small screens when clicking on the menu button
            function myFunction() {
                var x = document.getElementById("navDemo");
                if (x.className.indexOf("w3-show") == -1) {
                    x.className += " w3-show";
                } else {
                    x.className = x.className.replace(" w3-show", "");
                }
            }
        </script>
    </body>
</html>
