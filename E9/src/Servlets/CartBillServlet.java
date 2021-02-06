package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartBillServlet
 */
@WebServlet("/CartBillServlet")
public class CartBillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartBillServlet() {
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
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		
		int totamt = 0;
		Enumeration names = session.getAttributeNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			totamt += Integer.parseInt(value);
		}
		
		String Book1amt = "";
		String Book2amt = "";
		String Book3amt="";
		String Book4amt = "";
		if(session.getAttribute("Book1amt") != null) {
			Book1amt = session.getAttribute("Book1amt").toString();
		}
		if(session.getAttribute("Book2amt") != null) {
			Book2amt = session.getAttribute("Book2amt").toString();
		}
		if(session.getAttribute("Book3amt") != null) {
			Book3amt = session.getAttribute("Book3amt").toString();
		}
		if(session.getAttribute("Book4amt") != null) {
			Book4amt = session.getAttribute("Book4amt").toString();
		}
		
		out.println("<table border=2 style=\"background-color:pink\">");
		out.println("<tr><td>Book1:</td><td>" + Book1amt + "</td></tr>");
		out.println("<tr><td>Book2:</td><td>" + Book2amt + "</td></tr>");
		out.println("<tr><td>Book3:</td><td>" + Book3amt + "</td></tr>");
		out.println("<tr><td>Book4:</td><td>" + Book4amt + "</td></tr>");
		out.println("<tr><td>Total amount:</td><td>" + totamt + "</td></tr>");
		out.println("</table>");
		session.invalidate();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
