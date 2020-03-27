package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Behave
 */
@WebServlet("/Behave")
public class Behave extends HttpServlet {
	private static final long serialVersionUID = 1L;

/*	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("choice");
		
		if(action.equals("Add")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if (action.equals("Delete")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("deleteBook.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(action.equals("Edit")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("editBook.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(action.equals("Retrieve")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("retrieveBook.jsp");
			dispatcher.forward(request, response);
			return;
		}
		out.println("We know your action is " + action);

		
		
		
	
	}

}
