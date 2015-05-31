<%-- 
    Document   : finalizar
    Created on : 25/05/2015, 09:33:56 PM
    Author     : Willian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <title>TFG</title>
        <style>
            body{
                max-width: 60%;
                text-align: center;
                margin: 0 auto;
                
            }
            .encabezado{
                background-color: #64B5F6;
                color: white;
                margin-top: 0px;
                margin-bottom: 20px;
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <div class="encabezado">
               <h1>PRODUCCIÓN FINALIZADA</h1>
               <h3>Código de Producción: ${produccion.idProduccion}</h3>
                <h3>Fueron producidos ${produccion.cantidad}  ${produccion.producto.descripcion}</h3>
             
                
        </div>
     
  
        <div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <td>Materia ID</td>
                        <td>Nombre Materia</td>
                        <td>Cantidad Utilizada</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${produccion.produccionesMateriasList}" var="item">
                        <tr>
                            <td>${item.idProduccionMateria}</td>
                            <td>${item.materia.descripcion}</td>
                            <td>${item.cantidad}</td>
                        </tr>
                    </c:forEach>
                
                </tbody>
            
            </table>    
        </div>
        
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</html>
