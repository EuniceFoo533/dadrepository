package demo.ftmk.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckOutRedirectServlet
 */
@WebServlet("/demo/checkOutRedirectServlet")
public class CheckOutRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOutRedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Get orderedProducts from session
				HttpSession session = request.getSession(true);
				
				//Forward servlet to zeroOrder.html if orderedProducts does not exist
				if(session != null) 
				{
					RequestDispatcher dispatcher = request.getRequestDispatcher("demo/zeroOrder.html");
					dispatcher.forward(request, response);
				}
				
				
				
				//Calculate total quantity and total order
				
				//Invoke the appropriate method from OrderDataManager
				
				//Display details of order
				
				//Remove attribute from session
	}

}
