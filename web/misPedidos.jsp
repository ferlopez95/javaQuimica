<%-- 
    Document   : misPedidos
    Created on : Nov 21, 2016, 5:51:17 PM
    Author     : Edgardo Acosta
--%>
<%-- 
    Document   : prestamos
    Created on : Nov 21, 2016, 3:24:31 AM
    Author     : Edgardo Acosta
--%>
<%@page import="business.Prestamo"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="business.DBHandler"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<html lang="en">
    <head>
        <!-- Required meta tags always come first -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Prestamos</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="css/mdb.min.css" rel="stylesheet">
        <!-- Sweet Alert2-->
        <script src="sweetalert2/sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2/sweetalert2.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    </head>
    <body class="fixed-sn mdb-skin">
        <%@page import="business.Catalogo" %>
        <% ArrayList prestamos = (ArrayList) request.getAttribute("pedidos");%>
        <!--Double navigation-->
        <header>
            <!-- Sidebar navigation -->
            <ul id="slide-out" class="side-nav fixed custom-scrollbar">
                <!-- Logo -->
                <li>
                    <div class="logo-wrapper waves-light sn-avatar-wrapper">
                        <a href="#">
                            <img src="http://mdbootstrap.com/images/avatars/img%20(8)" class="img-circle">
                        </a>
                    </div>
                </li>
                <!--/. Logo -->
                <!--About-->
                <li>
                    <div class="about">
                        <p>Menu principal.</p>
                    </div>
                </li>
                <!--/.About-->
                <!--Social-->
                <li>
                    <ul class="social">
                        <li><a href="https://twitter.com/MDBootstrap" target="_blank" class="icons-sm tw-ic"><i
                                    class="fa fa-twitter"> </i></a></li>
                        <li><a href="https://www.facebook.com/mdbootstrap" target="_blank" class="icons-sm fb-ic"><i
                                    class="fa fa-facebook"> </i></a></li>
                        <li><a href="https://dribbble.com/mdbootstrap" target="_blank" class="icons-sm drib-ic"><i
                                    class="fa fa-dribbble"> </i></a></li>
                        <li><a href="https://www.linkedin.com/in/michal-szymanski-9228918a" target="_blank"
                               class="icons-sm li-ic"><i class="fa fa-linkedin"> </i></a></li>
                        <li><a href="https://www.instagram.com/material_design_for_bootstrap/" target="_blank"
                               class="icons-sm ins-ic"><i class="fa fa-instagram"> </i></a></li>
                    </ul>
                </li>
                <!--/Social-->
                <!-- Side navigation links -->
                <li>
                    <ul class="collapsible collapsible-accordion">
                        <li><a class="collapsible-header waves-effect arrow-r" href="index.html"><i class="fa fa-home"></i>Inicio</a>
                        </li>
                        <li><a class="collapsible-header waves-effect arrow-r" href="Controlador?operacion=catalogoM"><i class="fa fa-list-ol"></i>Cat&aacute;logo</a>
                        </li>
                        <li>
                            <a class="collapsible-header waves-effect arrow-r"><i class="fa fa-user"></i> Administrador<i
                                    class="fa fa-angle-down rotate-icon"></i></a>
                            <div class="collapsible-body">
                                <ul>
                                    <li><a href="#" class="waves-effect">Login</a>
                                    </li>
                                    <li><a href="#" class="waves-effect">Pagina de admin</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li>
                            <a class="collapsible-header waves-effect arrow-r"><i class="fa fa-users"></i>Contactanos<i
                                    class="fa fa-angle-down rotate-icon"></i></a>
                            <div class="collapsible-body">
                                <ul>
                                    <li><a href="#" class="waves-effect">FAQ</a>
                                    </li>
                                    <li><a href="#" class="waves-effect">Envia un mensaje</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </li>
                <!--/. Side navigation links -->
            </ul>
            <!--/. Sidebar navigation -->
            <!--Navbar-->
            <nav class="navbar navbar-fixed-top scrolling-navbar double-nav">
                <!-- SideNav slide-out button -->
                <div class="pull-left">
                    <a href="#" data-activates="slide-out" class="button-collapse"><i class="fa fa-bars"></i></a>
                </div>
                <!-- Breadcrumb-->
                <div class="breadcrumb-dn">
                    <p>Departamento de quimica</p>
                </div>
            </nav>
            <!--/.Navbar-->
        </header>
        <!--/Double navigation-->
        <!--Main layout-->
        <main>
            <div class="container-fluid">
                <!--Section: Blog v.4-->
                <section class="section section-blog-fw">
                    <div style="text-align: center">
                        <h5>Mis Pedidos</h5>
                    </div>
                    <div class="col-md-6">
                        <div class="md-form">
                            <i class="fa fa-user prefix"></i>
                            <input type="text" id="matricula" class="form-control" required>
                            <label for="form9" class="">Escribe tu matricula</label>
                        </div>
                        <div class="text-xs-center">
                            <button class="btn btn-primary waves-effect waves-light" id="btBuscar"> 
                                Buscar 
                            </button>
                        </div>
                    </div>
                    <br>
                
                </section>
                <!--/Section: Blog v.4-->
                <hr class="between-sections">


            </div>
        </main>
        <!--/Main layout-->
        <!--Footer-->
        <footer class="page-footer center-on-small-only">
            <!--Footer Links-->
            <div class="container-fluid">
                <div class="row">
                    <!--First column-->
                    <div class="col-md-12 col-md-offset-1">
                        <h5 class="title">Departamento de quimica</h5>
                        <p>Informacion de institución.</p>
                    </div>
                    <!--/.First column-->
                    <hr class="hidden-md-up">
                </div>
            </div>
            <!--/.Footer Links-->
            <hr>
            <!--Social buttons-->
            <div class="social-section">
                <ul>
                    <li><a href="https://www.facebook.com/mdbootstrap" target="_blank" class="btn-floating btn-small btn-fb"><i
                                class="fa fa-facebook"> </i></a></li>
                    <li><a href="https://twitter.com/MDBootstrap" target="_blank" class="btn-floating btn-small btn-tw"><i
                                class="fa fa-twitter"> </i></a></li>
                    <li><a href="https://plus.google.com/u/0/+Mdbootstrap" target="_blank"
                           class="btn-floating btn-small btn-gplus"><i class="fa fa-google-plus"> </i></a></li>
                    <li><a href="https://pl.linkedin.com/in/dawid-adach-97435534/pl" target="_blank"
                           class="btn-floating btn-small btn-li"><i class="fa fa-linkedin"> </i></a></li>
                    <li><a class="btn-floating btn-small btn-git"><i class="fa fa-github"> </i></a></li>
                    <li><a href="https://pl.pinterest.com/materialdesignf/" target="_blank"
                           class="btn-floating btn-small btn-pin"><i class="fa fa-pinterest"> </i></a></li>
                    <li><a href="https://www.instagram.com/material_design_for_bootstrap/" target="_blank"
                           class="btn-floating btn-small btn-ins"><i class="fa fa-instagram"> </i></a></li>
                </ul>
            </div>
            <!--/.Social buttons-->
            <!--Copyright-->
            <div class="footer-copyright">
                <div class="container-fluid">
                    © 2016 Copyright: Tecnologico de Monterrey
                </div>
            </div>
            <!--/.Copyright-->
        </footer>
        <!--/.Footer-->
        <!-- SCRIPTS -->
        <script src="js/misPedidos.js"></script>
        <!-- JQuery -->
        <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>
        <!-- Tooltips -->
        <script type="text/javascript" src="js/tether.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="js/mdb.min.js"></script>
        <script>
            // SideNav init
            $(".button-collapse").sideNav();
            var el = document.querySelector('.custom-scrollbar');
            Ps.initialize(el);
        </script>
        <script>
            new WOW().init();
        </script>
    </body>
</html>
