<%-- 
    Document   : Registrar
    Created on : 17/11/2018, 12:11:24 PM
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

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>        
        
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"/>

        <script>
                swal("Buen Trabajo", "Se realizó proceso con éxito!","success");
        </script>
    </head>
    <body class="bg-dark">

        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registrar Cuenta</div>
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblIdentificacion">Identificación</label>                                    
                                    <input type="text" name="txtIdentificacion" class="form-control" placeholder="Ingrese identificación" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblApellidoPaterno">Apellido Paterno</label>                                    
                                    <input type="text" name="txtApepat" class="form-control" placeholder="Ingrese Apellido Paterno" required="required" autofocus="autofocus">                                    
                                </div>
                                
                                <div class="col-md-6">
                                    <label for="lblApellidoMaterno">Apellido Materno</label>                                    
                                    <input type="text" name="txtApemat" class="form-control" placeholder="Ingrese Apellido Materno" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblNombres">Nombres</label>                                    
                                    <input type="text" name="txtNombres" class="form-control" placeholder="Ingrese nombres" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>                                               
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-8">
                                    <label for="lblNombres">Dirección</label>                                    
                                    <input type="text" name="txtDireccion" class="form-control" placeholder="Ingrese dirección" required="required" autofocus="autofocus">                                    
                                </div>
                                <div class="col-md-4">
                                    <label for="lblTelefono">Telefono</label>                                    
                                    <input type="text" name="txtTelefono" class="form-control" placeholder="Ingrese teléfono" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12">
                                    <label for="lblCorreo">Correo</label>                                    
                                    <input type="text" name="txtCorreo" class="form-control" placeholder="Ingrese Correo" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <label for="lblPassword">Contraseña</label>                                    
                                    <input type="password" name="txtPassword" class="form-control" placeholder="Ingrese contraseña" required="required" autofocus="autofocus">                                    
                                </div>
                                <div class="col-md-6">
                                    <label for="lblConfirmar">Confirmar contraseña</label>                                    
                                    <input type="password" name="txtConfirmar" class="form-control" placeholder="Confirmar contraseña" required="required" autofocus="autofocus">                                    
                                </div>
                            </div>
                        </div>                                
                        
                        <input type="submit" name="cmdAceptar" class="btn btn-primary btn-block" value="Aceptar"/>
                    </form>
                    <div class="text-center">
                        <a class="d-block small mt-3" href="Login.jsp">Inicio de Sesión</a>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
