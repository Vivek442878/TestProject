
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

public class TestLengthMeasurement {

	public static void main(String[] args) 
	{
		
		LengthMeasurement mcmlengthObjectmm = new LengthMeasurement();  //create object with millimeter value
		LengthMeasurement  objectWithDoubleValue = new LengthMeasurement(2000.6); 
		System.out.println(objectWithDoubleValue.toString());
		
	}

}
