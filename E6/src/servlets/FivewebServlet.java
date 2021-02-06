package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FivewebServlet
 */
@WebServlet("/FivewebServlet")
public class FivewebServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FivewebServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String value=request.getParameter("link");
		
		if(value.equals("one")) {
			response.sendRedirect("http://www.google.com");
		}
		else if(value.equals("two")) {
			//response.sendRedirect("./Servlet2");
			response.sendRedirect("http://www.youtube.com");
		}
		else if(value.equals("three")) {
			//response.sendRedirect("./Servlet2");
			response.sendRedirect("http://www.microsoft.com");
		}
		else if(value.equals("four")) {
			//response.sendRedirect("./Servlet2");
			response.sendRedirect("http://www.amazon.in/");
		}
		else if(value.equals("five")) {
			//response.sendRedirect("./Servlet2");
			response.sendRedirect("http://github.com/");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
