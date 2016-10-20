<%-- 
    Document   : Triangulo
    Created on : 20/10/2016, 07:39:51 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Triangulo</title>
    </head>
    <body>
    <center><h3>Calcular Area o Perimetro de un Triangulo</h3></center>
    <center><h3>1.- Ingresa en el 1er Recuadro la Altura del Triangulo</h3></center>
    <center><h3>2.- Ingresa en el 2do Recuadro la Base del Triangulo</h3></center>
        <center><form action="CalculaT" method="POST">   
            <table width="350">
                <tr>
                        <td align="right"> <input name="AlturaT" type="text"></td>
                        <td> <input name="BaseT" type="text"></td>
                        <td> <select name="operacion">
                                <option value="1" selected> Area </option>
                                <option value="2" > Perimetro </option>
                            </select> </td>
                        
                        <td><input type="submit" value="Calcula" name="Enviar" /></td>
                </tr>  
            </table>
       </form></center>
    <form action="Index.jsp" method="POST"> <input type="submit" value="Regresar" name="Enviar" /></form>
        
        
    </body>
</html>
