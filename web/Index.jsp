<%-- 
    Document   : Index
    Created on : 19-oct-2016, 22:02:07
    Author     : alexiscastro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
   
        <title>Calculadora servlet</title>
    </head>
    <body>
       <center><h1>Calculadora de figuras</h1></center><br><br><br><br><br>
       <center><table width="350">
           <tr> 
                <form action="Circulo.jsp" method="POST"> 
                    <input type="submit" value="Circulo" name="Enviar" /></td>
                </form>
       </tr> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <tr> 
                <form action="Triangulo.jsp" method="POST"> 
                    <input type="submit" value="Triangulo" name="Enviar" /></td>
                </form>
           </tr> 
       </table>  </center>   
        
        
    </body>
</html>
