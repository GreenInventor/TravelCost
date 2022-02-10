package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PlaneCalculator;

/**
 * Servlet implementation class getPlaneCostServlet
 */
@WebServlet("/getPlaneCostServlet")
public class getPlaneCostServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPlaneCostServlet() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String milTraveled = request.getParameter("milTraveled");
		String people = request.getParameter("people");
		String tripAcc = request.getParameter("tripAcc");
		String flightType = request.getParameter("flightType");
		
		PlaneCalculator planeCalc = new PlaneCalculator(Integer.parseInt(milTraveled), Integer.parseInt(people), Integer.parseInt(tripAcc), Integer.parseInt(flightType));
		
		request.setAttribute("planeCost", planeCalc);
		
		getServletContext().getRequestDispatcher("/planeresult.jsp").forward(request, response);
	}

}
