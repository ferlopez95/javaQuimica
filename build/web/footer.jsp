<%-- 
    Document   : footer
    Created on : 06-Oct-2016, 19:29:50
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="java.util.*" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>

<p><small>
&copy; Copyright <%= currentYear %>
Fernando Lopez &amp; Eduardo Acosta, Inc.
All rights reserved
</small></p>
</body>
</html>