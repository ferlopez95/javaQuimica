<%-- 
    Document   : join_email_list
    Created on : 05-Oct-2016, 10:59:05
    Author     : Fernando
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

    <%@include file="/header.html" %>
    
    <%@page import="business.User" %>
    <%
        // get attributes from the request 
        User user = (User) request.getAttribute("user"); 
        String message =  
            (String) request.getAttribute("message"); 
        // handle null values 
        if (user == null) user = new User(); 
        if (message == null) message = ""; 
    %>
    
  <h1>Join our email list</h1>
  <p>To join our email list, enter your name and
     email address below. <br>
     Then, click on the Submit button.</p>
  
  <p><i><%= message %></i></p>

  <form action="addToEmailList" method="post">
  <table cellspacing="5" border="0">
    <tr>
      <td align="right">First name:</td>
      <td><input type="text" name="firstName"
                 value="<%= user.getFirstName() %>"></td>
    </tr>
    <tr>
      <td align="right">Last name:</td>
      <td><input type="text" name="lastName"
                 value="<%= user.getLastName() %>"></td>
    </tr>
    <tr>
      <td align="right">Email address:</td>
      <td><input type="text" name="emailAddress"
                 value="<%= user.getEmailAddress() %>"></td>
    </tr>
    <tr>
      <td align="right">Carrera:</td>
      <td><select name="carrera"
                  value="<%= user.getCarrera() %>"> 
          <option> INT </option>
          <option> ISC </option>
          <option> ISD </option>
          <option> ITC </option>
          <option> ITE </option>
          <option> ITIC </option>
          <option> ITS </option>
          </select>  </td>
    </tr>
    <tr>
      <td></td>
      <td><br><input type="submit" value="Submit"></td>
    </tr>
  </table>
  </form>
                  
  <%@include file="/footer.jsp" %>