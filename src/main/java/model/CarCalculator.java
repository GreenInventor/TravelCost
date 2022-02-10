package model;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Feb 9, 2022
 */
public class CarCalculator 
{
	private int milesTraveled, people, accCost;
	private double mpg, fuelCost;
	private final int MPH = 60;
	private final int STOPHOUR = 5;
	private final int HOTELSTOP = 3;
	private final int AVGHOTELCOST = 75; //per person mid-range hotel
	private final double CHEAPFACTOR = .5;
	private final double LUXARYFACTOR = 3;
	private final int CHEAP = 1;
	private final int LUXARY = 3;
	private final int AVGFOODCOST = 50;
	private int cost = 0;
	private int hours = 0;
	private int stops = 0;
	private int fuelTotal = 0;
	private int foodTotal = 0;
	private int hotelTotal = 0;
	
	/**
	 * 
	 */
	public CarCalculator() 
	{
		super();
	}

	/**
	 * @param milesTraveled
	 * @param people
	 * @param accCost
	 * @param mpg
	 * @param fuelCost
	 */
	public CarCalculator(int milesTraveled, int people, int accCost, double mpg, double fuelCost) 
	{
		super();
		this.milesTraveled = milesTraveled;
		this.people = people;
		this.accCost = accCost;
		this.mpg = mpg;
		this.fuelCost = fuelCost;
		determineCarCost();
	}
	
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the stops
	 */
	public int getStops() {
		return stops;
	}

	/**
	 * @return the people
	 */
	public int getPeople() {
		return people;
	}

	/**
	 * @return the fuelTotal
	 */
	public int getFuelTotal() {
		return fuelTotal;
	}

	/**
	 * @return the foodTotal
	 */
	public int getFoodTotal() {
		return foodTotal;
	}

	/**
	 * @return the hotelTotal
	 */
	public int getHotelTotal() {
		return hotelTotal;
	}
	
	/**
	 * @return the milesTraveled
	 */
	public int getMilesTraveled() {
		return milesTraveled;
	}

	/**
	 * @return the accCost
	 */
	public int getAccCost() {
		return accCost;
	}

	/**
	 * determine cost to transport by car
	 */
	public void determineCarCost()
	{
		fuelTotal = 0;
		foodTotal = 0;
		hotelTotal = 0;
		hours = milesTraveled / MPH;
		stops = hours / STOPHOUR;
		for(int i = 1; i < stops + 1; i++) //determine food and hotel cost
		{
			if(i % HOTELSTOP == 0)
			{
				if(accCost == CHEAP)
				{
					hotelTotal+=(AVGHOTELCOST * CHEAPFACTOR) * people;
					foodTotal+=(AVGFOODCOST * CHEAPFACTOR) * people;
				}
				else if(accCost == LUXARY)
				{
					hotelTotal+=(AVGHOTELCOST * LUXARYFACTOR) * people;
					foodTotal+=(AVGFOODCOST * LUXARYFACTOR) * people;
				}
				else	
				{
					hotelTotal+=AVGHOTELCOST * people;
					foodTotal+=AVGFOODCOST * people;
				}
			}
			else
			{
				if(accCost == CHEAP)
				{
					foodTotal+=(AVGFOODCOST * CHEAPFACTOR) * people;
				}
				else if(accCost == LUXARY)
				{
					foodTotal+=(AVGFOODCOST * LUXARYFACTOR) * people;
				}
				else
				{
					foodTotal+=AVGFOODCOST * people;
				}
			}
		}
		fuelTotal+=(milesTraveled/mpg) * fuelCost; //determine fuel cost
		cost = hotelTotal + foodTotal + fuelTotal;
	}
}
