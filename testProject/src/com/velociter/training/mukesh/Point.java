package com.velociter.training.mukesh;

public class Point 
{
	//these two variables declare to store the coo-ordinate points
	 private double firstPoint;
	 private double secondPoint;
	
	public Point(double firstPointValue , double secondPointValue)
	{
		firstPoint=firstPointValue;
		secondPoint=secondPointValue;
	}
	// Create a point from another Point object
	public Point(Point oldPoint) 
	{
		firstPoint=oldPoint.firstPoint;					// Copy firstPoint coordinate
		secondPoint=oldPoint.secondPoint;				//// Copy secondPoint coordinate
	}
	//Get the value of the first coordinate
	double getfirstPoint()
	{
		return firstPoint;
	}
	//Get the value of the second coordinate
	double getsecondPoint()
	{
		return secondPoint;
	}
	
	public String toString()
	{
		return firstPoint +","+secondPoint;
	}
	
}
