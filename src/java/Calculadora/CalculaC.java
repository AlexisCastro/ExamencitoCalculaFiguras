
package Calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class CalculaC extends HttpServlet {
    Double Radio;
    int operacion;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Radio = Double.parseDouble(request.getParameter("Radio"));
         operacion = Integer.parseInt(request.getParameter("operacion"));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaC</title>");            
            out.println("</head>");
            out.println("<body><script language=\"JavaScript\" type=\"text/javascript\">\n" +
            "alert(\"" + CalculaC() + "\");\n" +
            "</script>");
            out.println("</body><form action=\"Circulo.jsp\" method=\"POST\"> <input type=\"submit\" value=\"Regresar\" name=\"Enviar\" /></form>");
            out.println("</html>");
        }
    }

    public int CalculaC() {
        
        if (operacion == 1) {
            return (int) ((3.14 * Radio*Radio));
        }else{
            if (operacion == 2) {
                return (int) (Radio*2*3.14 );
            }
        }
        return operacion;
    }// </editor-fold>
}
