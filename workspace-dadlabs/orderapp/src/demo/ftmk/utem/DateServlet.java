package demo.ftmk.utem;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet("/dateServlet")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get link parameter
		int paramValue = Integer.parseInt(request.getParameter("param"));
		
		//Get writer
		PrintWriter writer = response.getWriter();
		
		//Get today date
		LocalDate now = LocalDate.now();
		
		//Get the yesterday date
		LocalDate yesterday = now.minusDays(1);
		
		//Get the tomorrow date
		LocalDate tomorrow = now.plusDays(1);
		
		if(paramValue == 0) 
		{
			writer.println("Today is " + now.toString());
		}
		
		else if (paramValue == 1)
		{
			writer.println("Tomorrow is " + tomorrow.toString());
		}
		
		else if (paramValue == -1)
		{
			writer.println("Yesterday is " + yesterday.toString());
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
