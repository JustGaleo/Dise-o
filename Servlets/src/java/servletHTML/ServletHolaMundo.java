 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>HolaMundoServlet</title><style>\n" +
"            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n" +
"        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:#183028; font-family: Roboto Condensed;\">");
        out.println("<center><Font color=\"white\" size=\"8\"><br><br><br><br>Hola   Mundo   desde   el   servidor WEB</font</center>");
        out.println("</div></body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
