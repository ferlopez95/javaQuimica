<%-- 
    Document   : login
    Created on : Nov 19, 2016, 2:34:30 PM
    Author     : Estefi
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="business.DBHandler"%>
<%@ page import="business.User" %>
<jsp:useBean id="x" class="business.DBHandler" scope="session"/>
<%
String login = request.getParameter("user");
String password = request.getParameter("password");

User user = new User(login,password);

if ( DBHandler.getUser(user)) {
        // datos correctos
        session.setAttribute("autorizado", "si");
} else {
        // datos incorrectos
        session.setAttribute("autorizado", "no");
}
%>

<%
String autorizado = (String)session.getAttribute("autorizado");
String mensaje = (String) request.getAttribute("mensaje");
if ( autorizado.equals("si") ) {
    mensaje = "";
%>
<jsp:forward page="index.html"/>
<%
}
else {
%>
<jsp:forward page="ingresarAdministrador.jsp"/>    
<%
}
%>