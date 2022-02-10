package model;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Feb 9, 2022
 */
public class PlaneCalculator 
{
	private int milTraveled, people, tripAcc, flightType;
	private final int BUSINESS = 2;
	private final int FIRSTCLASS = 3;
	private final int INTERNATIONAL = 2;
	private int cost = 0;
	private int foodCost = 0;
	private int flightCost = 0;
	private final double COSTPERMILEDOMESTIC = .10;
	private final double COSTPERMILEINTERNATIONAL = .25;
	private final double BUSINESSFACTOR = 2.5;
	private final double FIRSTCLASSFACTOR = 4;
	private final double AVGFOODCOST = 25;
	private int hours = 0;
	private int foodTime = 0;
	private final int MPH = 580;
	private final int FOODHOUR = 8;
	
	/**
	 * 
	 */
	public PlaneCalculator() 
	{
		super();
	}

	/**
	 * @param milTraveled
	 * @param people
	 * @param tripAcc
	 * @param flightType
	 */
	public PlaneCalculator(int milTraveled, int people, int tripAcc, int flightType) 
	{
		super();
		this.milTraveled = milTraveled;
		this.people = people;
		this.tripAcc = tripAcc;
		this.flightType = flightType;
		calculatePlaneCost();
	}
	
	/**
	 * @return the milTraveled
	 */
	public int getMilTraveled() {
		return milTraveled;
	}

	/**
	 * @return the people
	 */
	public int getPeople() {
		return people;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return the foodCost
	 */
	public int getFoodCost() {
		return foodCost;
	}

	/**
	 * @return the flightCost
	 */
	public int getFlightCost() {
		return flightCost;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * calculate total cost to fly to destination
	 */
	public void calculatePlaneCost()
	{
		cost = 0;
		foodCost = 0;
		flightCost = 0;
		hours = milTraveled / MPH;
		foodTime = hours / FOODHOUR;
		for(int i = 0; i < foodTime; i++)
		{
			if(tripAcc == BUSINESS)
			{
				foodCost+=(AVGFOODCOST * BUSINESSFACTOR) * people;
			}
			else if(tripAcc == FIRSTCLASS)
			{
				foodCost+=(AVGFOODCOST * FIRSTCLASSFACTOR) * people;
			}
			else
			{
				foodCost+=AVGFOODCOST * people;
			}
		}
		if(flightType == INTERNATIONAL)
		{
			if(tripAcc == BUSINESS)
			{
				flightCost+=(milTraveled * COSTPERMILEINTERNATIONAL * BUSINESSFACTOR) * people;
			}
			else if(tripAcc == FIRSTCLASS)
			{
				flightCost+=(milTraveled * COSTPERMILEINTERNATIONAL * FIRSTCLASSFACTOR) * people;
			}
			else
			{
				flightCost+=(milTraveled * COSTPERMILEINTERNATIONAL) * people;
			}
		}
		else
		{
			if(tripAcc == BUSINESS)
			{
				flightCost+=(milTraveled * COSTPERMILEDOMESTIC * BUSINESSFACTOR) * people;
			}
			else if(tripAcc == FIRSTCLASS)
			{
				flightCost+=(milTraveled * COSTPERMILEDOMESTIC * FIRSTCLASSFACTOR) * people;
			}
			else
			{
				flightCost+=(milTraveled * COSTPERMILEDOMESTIC) * people;
			}
		}
		cost = flightCost + foodCost;
	}
}
