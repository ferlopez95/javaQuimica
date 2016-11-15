<%-- 
    Document   : error_java
    Created on : 09-Oct-2016, 13:36:25
    Author     : Fernando
--%>

<%@include file="/header.html" %>
<%@page isErrorPage="true"%>

<h1>Java Error</h1>
<p>Sorry Java has thrown an exception.</p>
<p>To continue, click on the Back button.</p>
<br>

<h2>Details</h2>
<p>
    Type: <%= exception.getClass() %>
    Message: <%= exception.getMessage() %>
</p>

<%@include file="/footer.jsp" %>
