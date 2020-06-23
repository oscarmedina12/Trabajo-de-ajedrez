

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;




/**
 * Servlet implementation class hola
 */
@WebServlet("/hola")
public class hola extends HttpServlet {
	private static final long serialVersionUID = 1L;
int columnas= 0;
int filas =0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		this.columnas = Integer.parseInt(request.getParameter("columnas"));
        this.filas =Integer.parseInt(request.getParameter("filas"));
        request.setAttribute("filas", this.filas );
        request.setAttribute("columnas", this.columnas );
        //request.getRequestDispatcher("index.jsp").forward(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.write("<!DOCTYPE html><html><head><style>td {  border: 1px solid black;  padding: 15px;}tr:nth-child(even) td:nth-child(even), tr:nth-child(odd) td:nth-child(odd) {  background: black;}tr:nth-child(odd) td:nth-child(even), tr:nth-child(even) td:nth-child(odd) {  background: white;}</style><title>Tablero</title></head><body>");
        out.write("<table style="+"width:100%"+">");

        for (int i = 0; i < this.filas; i++){
            out.write("<tr>");
            for (int j = 0; j < this.columnas; j++){
                    out.write("<td> </td>");
            }
            out.write("</tr>");
        }
        out.write("</table>");
        out.write("</body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
