package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletFormulario extends HttpServlet {
    String nombre;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("NOMBRE");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title><style>\n" +
"            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n" +
"        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:#708573; font-family: Roboto Condensed;\">");
        out.println("<br><br><br><br><p><h1><center><Font color=\"white\">Your name is: <B>" + nombre + "</B></Font> </center></h1></p>");
        out.println("<center><Font color=\"white\" >Date: " + new Date()+"</Font> </center>");
        out.println("</div></body></html>");
        out.close();
    }
}
