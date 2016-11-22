package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import business.DBHandler;
import business.User;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=windows-1252");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      business.DBHandler x = null;
      synchronized (session) {
        x = (business.DBHandler) _jspx_page_context.getAttribute("x", PageContext.SESSION_SCOPE);
        if (x == null){
          x = new business.DBHandler();
          _jspx_page_context.setAttribute("x", x, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');

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

      out.write('\n');
      out.write('\n');

String autorizado = (String)session.getAttribute("autorizado");
String mensaje = (String) request.getAttribute("mensaje");
if ( autorizado.equals("si") ) {
    mensaje = "";

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.html");
        return;
      }
      out.write('\n');

}
else {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("ingresarAdministrador.jsp");
        return;
      }
      out.write("    \n");

}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
