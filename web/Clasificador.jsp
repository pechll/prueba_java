<%-- 
    Document   : Clasificador
    Created on : 18/11/2018, 11:17:35 AM
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

        <title>Clasificador de Ingresos</title>

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

      <!--  <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"/> -->
    </head>
    <body>
        <div class="container">
            <div class="card mx-auto mt-5">
                <div class="card-header">Mantenedor de Clasificador de Ingresos</div>
                <div class="card-body">
                    <form action="ClasificadorController" method="POST">
                        <!-- FILA-->
                        <div class="form-group">                            
                            <div class="form-row">
                                <!-- COLUMNA-->
                                <div class="col-md-6">
                                    <input type="submit" value="Guardar" class="btn btn-primary" name="cmdGuardar"/>
                                    <input type="submit" value="Modificar" class="btn btn-primary" name="cmdModificar"/>
                                    <input type="submit" value="Cancelar" class="btn btn-primary" name="cmdCancelar"/>
                                    <input type="submit" value="Volver" class="btn btn-primary" name="cmdVolver"/>                                    
                                </div>                                
                            </div>                            
                        </div>
                        <!-- OTRA FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Información de Clasificador de Ingresos</h1>
                            </div>
                        </div>
                        <!-- OTRA FILA-->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- OTRA COLUMNA-->
                                <div class="col-md-1" align="center">
                                    <label name="lblAnos">Año Fiscal</label>
                                    <input type="number" placeholder="Año" name="txtAnos" class="form-control"/>                                    
                                </div>
                                
                                <!-- OTRA COLUMNA-->
                                <div class="col-md-1" align="right">
                                    <label name="lblIdClasificador">Cod.Autogenerado.</label>
                                    <input type="number" placehorlder="(Autogenerado)" name="txtIdClasificador" class="form-control" readonly="false" />
                                </div>
                            </div>
                        </div>
                        <!-- OTRA FILA-->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- columna-->
                                <div class="col-md-1">
                                    <label name="lblIdtributo">Cod.Inform.</label>
                                    <input type="number" placeholder="Cód.Informático" name="txtIdtributo" class="form-control" required="true" />
                                </div>
                                <!-- columna-->
                                <div class="col-md-6">
                                    <label name="lblConcepto">Concepto</label>
                                    <input type="text" placeholder="Digite Concepto" name="txtConcepto" class="form-control" required="true"/>
                                </div>
                                <div class="col-md-5">
                                    <label name="lblConceCorto">Concepto Abreviado</label>
                                    <input type="text" placeholder="Digite Concepto Corto" name="txtConceCorto" class="form-control" required="true"/>
                                </div>
                            </div>
                        </div>
                        <!-- OTRA FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- OTRA COLUMNA -->
                                <div class="col-md-2">
                                    <label name="lblIdPresupuestal">Cod.Presupuestal</label>
                                    <input type="text" placeholder="Ing.Cod.Presupuestal" name="txtIdPresupuestal" class="form-control" required="true"/>
                                </div>
                                <div class="col-md-2">
                                    <label name="lblIdFinanciero">Cod.Financiero</label>
                                    <input type="text" placeholder="Ing.Cod.Financiero" name="IdFinanciero" class="form-control" required="true"/>
                                </div>
                                <div class="col-md-2">
                                    <label name="lblImporte">Importe</label>
                                    <input type="number" step="0.01" placeholder="Digite Importe" name="txtImporte" class="form-control" required="true"/>
                                </div>
                                <div class="col-md-2">
                                    <label name="lblTasa">Tasa</label>
                                    <input type="number" step="0.01" placeholder="Digite Tasa" name="txtTasa" class="form-control" required="true"/>
                                </div>                                                                               
                                <div class="col-md-2">
                                    <label name="lblCodEp">Cod.Ep</label>
                                    <input type="text" placeholder="Digite Cod.Ep" name="txtCodEp" class="form-control" />
                                </div>                                                                                                
                                <div class="col-md-2">
                                    <label name="lblTipo" >Tipo</label>
                                    <select class="form-control" name="ddlTipo" required="true">
                                        <option value="">Ninguno</option>
                                        <option value="TR">Tributario</option>
                                        <option value="NT">No Tributario</option>
                                    </select> 
                                </div>                                        
                            </div>
                        </div>
                         <!-- OTRA FILA -->
                        <div class="form-group">
                            <div class="form-row">
                                <!-- OTRA COLUMNA -->
                                <div class="col-md-2">
                                    <label name="lblSubTipo" >Sub Tipo</label>
                                    <select class="form-control" name="ddlSubTipo">
                                        <option value="0">Ninguno</option>
                                        <option value="1">Impuesto</option>
                                        <option value="2">Arbitrio</option>
                                        <option value="3">Tasa</option>
                                        <option value="4">Multa Tributaria</option>
                                        <option value="9999">Otros</option>                                        
                                    </select> 
                                </div>                                                            
                                <!-- OTRA COLUMNA -->
                                <div class="col-md-2">
                                    <label name="lblFecha">Fecha de Registro</label>
                                    <input type="date" name="dFecha" class="form-control" value="01/11/2018"/>
                                </div>
                                <!-- OTRA COLUMNA -->
                                <div class="col-md-2">
                                    <div>
                                        <label name="lblUsuario">Usuario</label>
                                        <input type="text" placeholder="Usuario" name="txtUsuario" class="form-control" readonly="false" />
                                    </div>
                                </div>
                                <!-- OTRA COLUMNA -->
                                <div class="col-md-4">
                                    <label name="lblEstado">
                                        <input type="checkbox" name="chkEstado" checked="true"/>
                                       Estado
                                    </label>
                                </div>
                            </div>
                        </div>
                    </form>    
                </div>
            </div>
        </div>
    </body>
</html>
