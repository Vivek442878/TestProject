
/*
 * Define a class, mcmLength, to represent a length measured in meters, centimeters, and millimeters,
each stored as integers. Include methods to add and subtract objects, to multiply and
divide an object by an integer value, to calculate an area resulting from the product of two
objects, and to compare objects. Include constructors that accept three arguments—meters, centimeters,
and millimeters; one integer argument in millimeters; one double argument in centimeters;
and no arguments, which creates an object with the length set to zero. Check the class
by creating some objects and testing the class operations.
 */
package com.velociter.training.aalam;

public class LengthMeasurement 
{

	public static final int CENTIMETER_IN_METER = 100;
	public static final int MILLIMETER_IN_CENTIMETER = 10;
	public static final int MILLIMETER_IN_METER = 1000;
	
	// Private member variables:
	  private int meters ,centimeters, millimeters;
	  public int mm=0;
	  
	  
	  public LengthMeasurement()     
	  {
		//no-argument constructor
	  }
	  public LengthMeasurement(int meters ,int centimeters ,int millimeters )
	  {
		  this.meters = meters;
		  this.centimeters= centimeters;
		  this.millimeters = millimeters;
	  }
	 
	  public LengthMeasurement(double centimeters )
	  {
		  this((int)Math.round(centimeters*MILLIMETER_IN_CENTIMETER));
	  }
	   
	  public LengthMeasurement(int millimeters)
	  {
		  meters = millimeters / MILLIMETER_IN_METER;
		  centimeters = (millimeters -meters * MILLIMETER_IN_METER)/ MILLIMETER_IN_CENTIMETER;
		  millimeters = millimeters - meters * MILLIMETER_IN_METER - centimeters * MILLIMETER_IN_CENTIMETER;
		  mm = millimeters;
	  }
	  
	  public String toString()
	  {
		  return Integer.toString(meters) + "m " + centimeters + "cm " + mm + "mm";
		                                                               
	  }
}
