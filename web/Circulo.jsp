<%-- 
    Document   : Circulo
    Created on : 20/10/2016, 07:40:07 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circulo</title>
    </head>
    <body>
    <center><h3>Calcular Area o Perimetro de un Circulo</h3></center>
    <center><h3>Ingresa en el recuadro el Radio del circulo</h3></center>
        <br>
        <center><form action="CalculaC" method="POST">   
            <table width="350">
                <tr>
                        <td align="right"> <input name="Radio" type="text"></td>
                        <td> <select name="operacion">
                                <option value="1" selected> Area </option>
                                <option value="2" > Perimetro </option>
                            </select> </td>
                           
                        <td><input type="submit" value="Calcula" name="Enviar" /></td>
                </tr>  
            </table>
       </form></center>
        <form action="Index.jsp" method="POST"> <input type="submit" value="Regresar" name="Enviar"/></form>
        
        
        
    </body>
</html>
