
package Calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CalculaT extends HttpServlet {
    Double AlturaT;
    Double BaseT;
    int operacion;


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AlturaT = Double.parseDouble(request.getParameter("AlturaT"));
         BaseT = Double.parseDouble(request.getParameter("BaseT"));
         operacion = Integer.parseInt(request.getParameter("operacion"));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaT</title>");            
            out.println("</head>");
            out.println("<body><script language=\"JavaScript\" type=\"text/javascript\">\n" +
            "alert(\"" + Calculat() + "\");\n" +
            "</script>");
            out.println("</body><form action=\"Triangulo.jsp\" method=\"POST\"> <input type=\"submit\" value=\"Regresar\" name=\"Enviar\" /></form>");
            out.println("</html>");
        }
    }

   public int Calculat() {
        
        if (operacion == 1) {
            return (int) ((AlturaT * BaseT) / 2);
        }else{
            if (operacion == 2) {
                return (int) (BaseT*3);
            }
        }
        return operacion;
    }// </editor-fold>
}
