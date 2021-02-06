package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String Book1cost = request.getParameter("Book1cost");
		String Book2cost = request.getParameter("Book2cost");
		String Book3cost = request.getParameter("Book3cost");
		String Book4cost = request.getParameter("Book4cost");
		
		String Book1 = request.getParameter("Book1");
		String Book2 = request.getParameter("Book2");
		String Book3 = request.getParameter("Book3");
		String Book4 = request.getParameter("Book4");
		
		int Book1amt = 0, Book2amt = 0, Book3amt = 0, Book4amt = 0;
		
		HttpSession session = request.getSession(true);
		
		if(Book1 != null && !Book1.equals("")) {
			Book1amt = Integer.parseInt(Book1cost) * Integer.parseInt(Book1);
			if(session.getAttribute("Book1amt") != null) {
				Book1amt = Book1amt + Integer.parseInt(session.getAttribute("Book1amt").toString());
			}
			
			session.setAttribute("Book1amt", Book1amt+"");
		}
		if(Book2 != null && !Book2.equals("")) {
			Book2amt = Integer.parseInt(Book2cost) * Integer.parseInt(Book2);
			if(session.getAttribute("Book2amt") != null) {
				Book2amt = Book2amt + Integer.parseInt(session.getAttribute("Book2amt").toString());
			}
			session.setAttribute("Book2amt", Book2amt+"");
		}
		if(Book3 != null && !Book3.equals("")) {
			Book3amt = Integer.parseInt(Book3cost) * Integer.parseInt(Book3);
			if(session.getAttribute("Book3amt") != null) {
				Book3amt = Book3amt + Integer.parseInt(session.getAttribute("Book3amt").toString());
			}
			session.setAttribute("Book3amt", Book3amt+"");
		}
		if(Book4 != null && !Book4.equals("")) {
			Book4amt = Integer.parseInt(Book4cost) * Integer.parseInt(Book4);
			if(session.getAttribute("Book4amt") != null) {
				Book4amt = Book4amt + Integer.parseInt(session.getAttribute("Book4amt").toString());
			}
			session.setAttribute("Book4amt", Book4amt+"");
		}	
		
		response.sendRedirect("./additem.html");
		
	}

}
