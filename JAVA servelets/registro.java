package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ape:<input type="text" name="apellido">
 * Servlet implementation class registro
 */
@WebServlet("/registro")
public class registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter salida=response.getWriter();
		salida.println("<html><body>");
		//salida.println("Nombre introducido " + request.getParameter("nombre"));
		//salida.println("<br><br>");
		//salida.println("Apellido introducido " + request.getParameter("apellido"));
		
		

        int n;
        
        n = Integer.parseInt(request.getParameter("nombre"));
        
        
        
        int fibo4[] = {0, 0, 1, 1};
		if ( n > 0 && n<5) {
			salida.println("EL FIBONACCI DEBE SER NAYOR QUE 4 O IGUAL NO " + n + " FIBONACCI DE 4 <br>");
			for(int i=0;i<fibo4.length;i++)
	        {
				salida.println(fibo4[i]+" ");
	        }
		}
		
		if (n > 4) {
			salida.println("EL FIBONACCI DE " + n + " ES <br>");
	        n=n-1;
	        if (n <= 0) {
	            //System.out.printf("Debe ingresar un número mayor que cero");
	        } else {
	            if (n >= 1) {
	            	salida.println("0 0 ");
	            }
	            if (n >= 2) {
	            	salida.println("1 ");
	            }
	            long anterior = 0;
	            long actual = 1;
	            int i;
	            for (i = 3; i <= n; i++) {
	                long copia_actual = actual;
	                actual = actual + anterior;
	                anterior = copia_actual;
	                salida.println(" " + actual);
	            }
	        }
		}
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
