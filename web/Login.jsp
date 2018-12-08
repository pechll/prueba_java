<%-- 
    Document   : Login
    Created on : 17/11/2018, 11:03:27 PM
    Author     : Ing. Percy Edward Chávez LLamoga <pechll@hotmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Registro de Usuarios</title>

        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Custom fonts for this template-->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">
        <link href="css/sweetalert.css" rel="stylesheet">

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core Plugin Javascript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="js/sweetalert.min.js"></script>        
    </head>
    <body class="bg-dark">
        <%
            if (request.getAttribute("stError") != null) {
        %>
        <input type="text" hidden="" id="txtMensaje" value="<%=request.getAttribute("stError").toString()%>"/>
        <script>
            var stMensaje = document.getElementById("txtMensaje").value
   //         swal("Mensaje", document.getElementById("txtMensaje").value,"error");
            swal("Mensaje", stMensaje,"error");
        </script>
            
        <%
            }
        %>
        <div class="container">
            <div class="card card-login mx-auto mt-5">
                <div class="card-header">Inicio de Sesión</div>
                <div class="card-body">
                    <form action="LoginController" method="POST">
                         <div class="form-group">                       
                                <label for="lblEmail">Correo Electrónico</label>
                                <input type="email" name="txtEmail" class="form-control" placeholder="Correo Electrónico" autofocus="autofocus">
                         </div>                       
                        <div class="form-group">
                                <label for="lblPassword">Contraseña</label>                                
                                <input type="password" name="txtPassword" class="form-control" placeholder="Contraseña" >                                
                        </div>
                        <div class="form-group">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" value="remember-me">
                                    Recordar Contraseña
                                </label>
                            </div>
                        </div>
                        <input name="cmdAceptar" type="submit" class="btn btn-primary btn-block" value="Aceptar">                        
                    </form>
                    
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Registrar.jsp">Registrar Cuenta</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
