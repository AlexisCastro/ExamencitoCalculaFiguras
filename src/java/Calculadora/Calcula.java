package Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexiscastro
 */
public class Calcula extends HttpServlet {
    Double operando1;
    Double operando2;
    int operacion;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        operando1 = Double.parseDouble(request.getParameter("operando1"));
         operando2 = Double.parseDouble(request.getParameter("operando2"));
         operacion = Integer.parseInt(request.getParameter("operacion"));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculadora</title>");            
            out.println("</head>");
            out.println("<body><script language=\"JavaScript\" type=\"text/javascript\">\n" +
            "alert(\"" + Calcula() + "\");\n" +
            "</script>");
            out.println("<form action=\"Index.jsp\" method=\"POST\"> <input type=\"submit\" value=\"Regresar\" name=\"Enviar\" /></form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    public int Calcula() {
        
        if (operacion == 1) {
            return (int) (operando1 + operando2);
        }else{
            if (operacion == 2) {
                return (int) (operando1 - operando2);
            }else{
                if (operacion == 3) {
                    return (int) (operando1 / operando2);
                }else{
                    if (operacion == 4) {
                        return (int) (operando1 * operando2);
                    }
                }
            }
        }
        return operacion;
    }// </editor-fold>
}
