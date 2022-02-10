package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarCalculator;

/**
 * Servlet implementation class getCarCostServlet
 */
@WebServlet("/getCarCostServlet")
public class getCarCostServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCarCostServlet() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String milTraveled = request.getParameter("milTraveled");
		String gasCost = request.getParameter("gasCost");
		String fuelEcon = request.getParameter("fuelEcon");
		String people = request.getParameter("people");
		String tripAcc = request.getParameter("tripAcc");
		
		CarCalculator carCalc = new CarCalculator(Integer.parseInt(milTraveled), Integer.parseInt(people), Integer.parseInt(tripAcc), Double.parseDouble(fuelEcon), Double.parseDouble(gasCost));
		
		request.setAttribute("carCost", carCalc);
		
		getServletContext().getRequestDispatcher("/carresult.jsp").forward(request, response);
	}

}
