package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import business.DBHandler;

public final class ingresarAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags always come first -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Catalogo</title>\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Material Design Bootstrap -->\r\n");
      out.write("        <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Sweet Alert2-->\r\n");
      out.write("        <script src=\"sweetalert2/sweetalert2.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2/sweetalert2.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"fixed-sn mdb-skin\">\r\n");
      out.write("        <!--Double navigation-->\r\n");
      out.write("        <header>\r\n");
      out.write("            <!-- Sidebar navigation -->\r\n");
      out.write("            <ul id=\"slide-out\" class=\"side-nav fixed custom-scrollbar\">\r\n");
      out.write("                <!-- Logo -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"logo-wrapper waves-light sn-avatar-wrapper\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <img src=\"http://mdbootstrap.com/images/avatars/img%20(8)\" class=\"img-circle\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--/. Logo -->\r\n");
      out.write("                <!--About-->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"about\">\r\n");
      out.write("                        <p>Menu principal.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--/.About-->\r\n");
      out.write("                <!--Social-->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <ul class=\"social\">\r\n");
      out.write("                        <li><a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\" class=\"icons-sm tw-ic\"><i\r\n");
      out.write("                                    class=\"fa fa-twitter\"> </i></a></li>\r\n");
      out.write("                        <li><a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\" class=\"icons-sm fb-ic\"><i\r\n");
      out.write("                                    class=\"fa fa-facebook\"> </i></a></li>\r\n");
      out.write("                        <li><a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\" class=\"icons-sm drib-ic\"><i\r\n");
      out.write("                                    class=\"fa fa-dribbble\"> </i></a></li>\r\n");
      out.write("                        <li><a href=\"https://www.linkedin.com/in/michal-szymanski-9228918a\" target=\"_blank\"\r\n");
      out.write("                               class=\"icons-sm li-ic\"><i class=\"fa fa-linkedin\"> </i></a></li>\r\n");
      out.write("                        <li><a href=\"https://www.instagram.com/material_design_for_bootstrap/\" target=\"_blank\"\r\n");
      out.write("                               class=\"icons-sm ins-ic\"><i class=\"fa fa-instagram\"> </i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--/Social-->\r\n");
      out.write("                <!-- Side navigation links -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <ul class=\"collapsible collapsible-accordion\">\r\n");
      out.write("                        <li><a class=\"collapsible-header waves-effect arrow-r\" href=\"index.html\"><i class=\"fa fa-bus\"></i>Inicio</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a class=\"collapsible-header waves-effect arrow-r\" href=\"prestamos.php\"><i class=\"fa fa-camera\"></i>Prestamos</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-user\"></i> Administrador<i\r\n");
      out.write("                                    class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Login</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Pagina de admin</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-envelope\"></i>Contactanos<i\r\n");
      out.write("                                    class=\"fa fa-angle-down rotate-icon\"></i></a>\r\n");
      out.write("                            <div class=\"collapsible-body\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Envia un mensaje</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--/. Side navigation links -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!--/. Sidebar navigation -->\r\n");
      out.write("            <!--Navbar-->\r\n");
      out.write("            <nav class=\"navbar navbar-fixed-top scrolling-navbar double-nav\">\r\n");
      out.write("                <!-- SideNav slide-out button -->\r\n");
      out.write("                <div class=\"pull-left\">\r\n");
      out.write("                    <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Breadcrumb-->\r\n");
      out.write("                <div class=\"breadcrumb-dn\">\r\n");
      out.write("                    <p>Departamento de quimica</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!--/.Navbar-->\r\n");
      out.write("        </header>\r\n");
      out.write("        <!--/Double navigation-->\r\n");
      out.write("        \r\n");
      out.write("        <!--Main layout-->\r\n");
      out.write("        <main>\r\n");
      out.write("            <h5 class=\"title\">Ingresa como administrador</h5>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("    \r\n");
      out.write("            ");
 if (DBHandler.usuarioValido == false) { 
      out.write("\r\n");
      out.write("            <p style=\"color:red\">El usuario o la contrase&ntilde;a estan incorrectos</p>\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <form action=\"login.jsp\" method=\"post\">\r\n");
      out.write("                    <h4>Usuario: </h4>\r\n");
      out.write("                    <input name=\"user\" type=\"text\" /> <br><br>\r\n");
      out.write("                    <h4>Contrase&ntilde;a: </h4>\r\n");
      out.write("                    <input name=\"password\" type=\"password\" />\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write("                    <input class=\"active btn btn-primary btn-lg waves-effect waves-light\" type=submit value=\"Ingresar\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </main>\r\n");
      out.write("        <!--/Main layout-->\r\n");
      out.write("        \r\n");
      out.write("        <br><br><br>\r\n");
      out.write("        \r\n");
      out.write("        <!--Footer-->\r\n");
      out.write("        <footer class=\"page-footer center-on-small-only\">\r\n");
      out.write("            <!--Footer Links-->\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!--First column-->\r\n");
      out.write("                    <div class=\"col-md-12 col-md-offset-1\">\r\n");
      out.write("                        <h5 class=\"title\">Departamento de quimica</h5>\r\n");
      out.write("                        <p>Informacion de institución.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.First column-->\r\n");
      out.write("                    <hr class=\"hidden-md-up\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.Footer Links-->\r\n");
      out.write("            <hr>\r\n");
      out.write("            <!--Social buttons-->\r\n");
      out.write("            <div class=\"social-section\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\" class=\"btn-floating btn-small btn-fb\"><i\r\n");
      out.write("                                class=\"fa fa-facebook\"> </i></a></li>\r\n");
      out.write("                    <li><a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\" class=\"btn-floating btn-small btn-tw\"><i\r\n");
      out.write("                                class=\"fa fa-twitter\"> </i></a></li>\r\n");
      out.write("                    <li><a href=\"https://plus.google.com/u/0/+Mdbootstrap\" target=\"_blank\"\r\n");
      out.write("                           class=\"btn-floating btn-small btn-gplus\"><i class=\"fa fa-google-plus\"> </i></a></li>\r\n");
      out.write("                    <li><a href=\"https://pl.linkedin.com/in/dawid-adach-97435534/pl\" target=\"_blank\"\r\n");
      out.write("                           class=\"btn-floating btn-small btn-li\"><i class=\"fa fa-linkedin\"> </i></a></li>\r\n");
      out.write("                    <li><a class=\"btn-floating btn-small btn-git\"><i class=\"fa fa-github\"> </i></a></li>\r\n");
      out.write("                    <li><a href=\"https://pl.pinterest.com/materialdesignf/\" target=\"_blank\"\r\n");
      out.write("                           class=\"btn-floating btn-small btn-pin\"><i class=\"fa fa-pinterest\"> </i></a></li>\r\n");
      out.write("                    <li><a href=\"https://www.instagram.com/material_design_for_bootstrap/\" target=\"_blank\"\r\n");
      out.write("                           class=\"btn-floating btn-small btn-ins\"><i class=\"fa fa-instagram\"> </i></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.Social buttons-->\r\n");
      out.write("            <!--Copyright-->\r\n");
      out.write("            <div class=\"footer-copyright\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    © 2016 Copyright: Tecnologico de Monterrey\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.Copyright-->\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!--/.Footer-->\r\n");
      out.write("        <!-- SCRIPTS -->\r\n");
      out.write("        <script src=\"js/catalogo.js\"></script>\r\n");
      out.write("        <!-- JQuery -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("        <!-- Tooltips -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/tether.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap core JavaScript -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- MDB core JavaScript -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            // SideNav init\r\n");
      out.write("            $(\".button-collapse\").sideNav();\r\n");
      out.write("            var el = document.querySelector('.custom-scrollbar');\r\n");
      out.write("            Ps.initialize(el);\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            new WOW().init();\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
