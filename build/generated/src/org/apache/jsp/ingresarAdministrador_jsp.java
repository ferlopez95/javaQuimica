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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags always come first -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Catalogo</title>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Material Design Bootstrap -->\n");
      out.write("        <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Sweet Alert2-->\n");
      out.write("        <script src=\"sweetalert2/sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2/sweetalert2.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fixed-sn mdb-skin\">\n");
      out.write("        <!--Double navigation-->\n");
      out.write("        <header>\n");
      out.write("            <!-- Sidebar navigation -->\n");
      out.write("            <ul id=\"slide-out\" class=\"side-nav fixed custom-scrollbar\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"logo-wrapper waves-light sn-avatar-wrapper\">\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <img src=\"http://mdbootstrap.com/images/avatars/img%20(8)\" class=\"img-circle\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!--/. Logo -->\n");
      out.write("                <!--About-->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"about\">\n");
      out.write("                        <p>Menu principal.</p>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!--/.About-->\n");
      out.write("                <!--Social-->\n");
      out.write("                <li>\n");
      out.write("                    <ul class=\"social\">\n");
      out.write("                        <li><a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\" class=\"icons-sm tw-ic\"><i\n");
      out.write("                                    class=\"fa fa-twitter\"> </i></a></li>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\" class=\"icons-sm fb-ic\"><i\n");
      out.write("                                    class=\"fa fa-facebook\"> </i></a></li>\n");
      out.write("                        <li><a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\" class=\"icons-sm drib-ic\"><i\n");
      out.write("                                    class=\"fa fa-dribbble\"> </i></a></li>\n");
      out.write("                        <li><a href=\"https://www.linkedin.com/in/michal-szymanski-9228918a\" target=\"_blank\"\n");
      out.write("                               class=\"icons-sm li-ic\"><i class=\"fa fa-linkedin\"> </i></a></li>\n");
      out.write("                        <li><a href=\"https://www.instagram.com/material_design_for_bootstrap/\" target=\"_blank\"\n");
      out.write("                               class=\"icons-sm ins-ic\"><i class=\"fa fa-instagram\"> </i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!--/Social-->\n");
      out.write("                <!-- Side navigation links -->\n");
      out.write("                <li>\n");
      out.write("                    <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("                        <li><a class=\"collapsible-header waves-effect arrow-r\" href=\"index.html\"><i class=\"fa fa-bus\"></i>Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a class=\"collapsible-header waves-effect arrow-r\" href=\"prestamos.php\"><i class=\"fa fa-camera\"></i>Prestamos</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-user\"></i> Administrador<i\n");
      out.write("                                    class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                            <div class=\"collapsible-body\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Login</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Pagina de admin</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fa fa-envelope\"></i>Contactanos<i\n");
      out.write("                                    class=\"fa fa-angle-down rotate-icon\"></i></a>\n");
      out.write("                            <div class=\"collapsible-body\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\" class=\"waves-effect\">Envia un mensaje</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!--/. Side navigation links -->\n");
      out.write("            </ul>\n");
      out.write("            <!--/. Sidebar navigation -->\n");
      out.write("            <!--Navbar-->\n");
      out.write("            <nav class=\"navbar navbar-fixed-top scrolling-navbar double-nav\">\n");
      out.write("                <!-- SideNav slide-out button -->\n");
      out.write("                <div class=\"pull-left\">\n");
      out.write("                    <a href=\"#\" data-activates=\"slide-out\" class=\"button-collapse\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Breadcrumb-->\n");
      out.write("                <div class=\"breadcrumb-dn\">\n");
      out.write("                    <p>Departamento de quimica</p>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!--/.Navbar-->\n");
      out.write("        </header>\n");
      out.write("        <!--/Double navigation-->\n");
      out.write("        \n");
      out.write("        <!--Main layout-->\n");
      out.write("        <main>\n");
      out.write("            <h5 class=\"title\">Ingresa como administrador</h5>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("            ");
 if (DBHandler.usuarioValido == false) { 
      out.write("\n");
      out.write("            <p style=\"color:red\">El usuario o la contrase&ntilde;a estan incorrectos</p>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <form action=\"login.jsp\" method=\"post\">\n");
      out.write("                    <h4>Usuario: </h4>\n");
      out.write("                    <input name=\"user\" type=\"text\" /> <br><br>\n");
      out.write("                    <h4>Contrase&ntilde;a: </h4>\n");
      out.write("                    <input name=\"password\" type=\"password\" />\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <input class=\"active btn btn-primary btn-lg waves-effect waves-light\" type=submit value=\"Ingresar\">\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
      out.write("        <!--/Main layout-->\n");
      out.write("        \n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <!--Footer-->\n");
      out.write("        <footer class=\"page-footer center-on-small-only\">\n");
      out.write("            <!--Footer Links-->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!--First column-->\n");
      out.write("                    <div class=\"col-md-12 col-md-offset-1\">\n");
      out.write("                        <h5 class=\"title\">Departamento de quimica</h5>\n");
      out.write("                        <p>Informacion de institución.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.First column-->\n");
      out.write("                    <hr class=\"hidden-md-up\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Footer Links-->\n");
      out.write("            <hr>\n");
      out.write("            <!--Social buttons-->\n");
      out.write("            <div class=\"social-section\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\" class=\"btn-floating btn-small btn-fb\"><i\n");
      out.write("                                class=\"fa fa-facebook\"> </i></a></li>\n");
      out.write("                    <li><a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\" class=\"btn-floating btn-small btn-tw\"><i\n");
      out.write("                                class=\"fa fa-twitter\"> </i></a></li>\n");
      out.write("                    <li><a href=\"https://plus.google.com/u/0/+Mdbootstrap\" target=\"_blank\"\n");
      out.write("                           class=\"btn-floating btn-small btn-gplus\"><i class=\"fa fa-google-plus\"> </i></a></li>\n");
      out.write("                    <li><a href=\"https://pl.linkedin.com/in/dawid-adach-97435534/pl\" target=\"_blank\"\n");
      out.write("                           class=\"btn-floating btn-small btn-li\"><i class=\"fa fa-linkedin\"> </i></a></li>\n");
      out.write("                    <li><a class=\"btn-floating btn-small btn-git\"><i class=\"fa fa-github\"> </i></a></li>\n");
      out.write("                    <li><a href=\"https://pl.pinterest.com/materialdesignf/\" target=\"_blank\"\n");
      out.write("                           class=\"btn-floating btn-small btn-pin\"><i class=\"fa fa-pinterest\"> </i></a></li>\n");
      out.write("                    <li><a href=\"https://www.instagram.com/material_design_for_bootstrap/\" target=\"_blank\"\n");
      out.write("                           class=\"btn-floating btn-small btn-ins\"><i class=\"fa fa-instagram\"> </i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Social buttons-->\n");
      out.write("            <!--Copyright-->\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    © 2016 Copyright: Tecnologico de Monterrey\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/.Copyright-->\n");
      out.write("        </footer>\n");
      out.write("        <!--/.Footer-->\n");
      out.write("        <!-- SCRIPTS -->\n");
      out.write("        <script src=\"js/catalogo.js\"></script>\n");
      out.write("        <!-- JQuery -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.2.3.min.js\"></script>\n");
      out.write("        <!-- Tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/tether.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- MDB core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // SideNav init\n");
      out.write("            $(\".button-collapse\").sideNav();\n");
      out.write("            var el = document.querySelector('.custom-scrollbar');\n");
      out.write("            Ps.initialize(el);\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            new WOW().init();\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
