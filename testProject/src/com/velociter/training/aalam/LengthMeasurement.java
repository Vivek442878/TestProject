
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

	public static final int CENTIMETER_PER_METER = 100;
	public static final int MILLIMETER_PER_CENTIMETER = 10;
	public static final int MILLIMETER_PER_METER = 1000;
	
	// Private member variables:
	  private int meter ,centimeter, millimeter;

	  public LengthMeasurement()     
	  {
		//no-argument constructor
	  }
	  public LengthMeasurement(int meter ,int centimeter ,int millimeter )
	  {
		  this.meter = meter;
		  this.centimeter= centimeter;
		  this.millimeter = millimeter;
	  }
	 
	  public LengthMeasurement(double centiMeter )
	  {
		  this((int)Math.round(centiMeter *MILLIMETER_PER_CENTIMETER));
	  }
	   
	  public LengthMeasurement(int milliMeter)
	  {   
		
		  meter = milliMeter / MILLIMETER_PER_METER;
		  centimeter = (milliMeter -meter * MILLIMETER_PER_METER)/ MILLIMETER_PER_CENTIMETER;
		  millimeter = milliMeter - meter * MILLIMETER_PER_METER - centimeter * MILLIMETER_PER_CENTIMETER;
		  
		  
	  }
	  
	 //override toString to display output in M,CM,MM
	  public String toString()
	  {
		  return Integer.toString(meter) + "m " + centimeter + "cm " + millimeter + "mm";
		                                                               
	  }
	  
	  
	  public int toMillimeter()
	  { 
		  return meter * MILLIMETER_PER_METER + centimeter * MILLIMETER_PER_CENTIMETER + millimeter;  //mm is millimeter
	  }
	  
	  
	  public double changeIntoMeter() 
	  {
		  return meter + ((double)(centimeter)) / CENTIMETER_PER_METER + ((double)(millimeter))/MILLIMETER_PER_METER;
	  }
	  
	  // All methods (add() ,substract(),divide(), multiply() use the changeIntoMillimeter()
	  //add()
	  public LengthMeasurement add(LengthMeasurement length)
	  {
	    return new LengthMeasurement(toMillimeter()+length.toMillimeter());    //14009 mm + 14.009 meter == 28m,1cm,8mm
	  }
	  
	  
	  //substract()
	  public LengthMeasurement subtract(LengthMeasurement length)
	  {
	    return new LengthMeasurement(toMillimeter()-length.toMillimeter());   // 14009 mm -14.009 meter ==
	  }
	  
	  //multiplication
	  public LengthMeasurement multiply(int multiplyValue)
	  {
	    return new LengthMeasurement(multiplyValue * toMillimeter());                             //  14009 mm * inputValue(eg.2)  ==28018
	  }
	  
	  //division
	  public LengthMeasurement divide(int divisibleValue)
	  {
	    return new LengthMeasurement(toMillimeter() / divisibleValue);
	  }
	  
	//Calculate area in square mm
	  public long area(LengthMeasurement length) {
	    return (toMillimeter() * length.toMillimeter());
	  }
	 
	
}
