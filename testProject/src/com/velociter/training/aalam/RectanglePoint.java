package com.velociter.training.aalam;

public class RectanglePoint 
{

	private double xcoordinate ;  //x ,y will used to hold upcoming values 
	private double ycoordinate ;
	
	// Create a Point object by using given  coordinate value x ,y
	  public RectanglePoint(double xcoordinate, double ycoordinate) {
	    this.xcoordinate = xcoordinate;
	    this.ycoordinate = ycoordinate;
	  }
	 
	  // Create a Point object by another Point reference ( constructor)
	  public RectanglePoint(final RectanglePoint oldpPoint) {
	   this.xcoordinate = oldpPoint.xcoordinate;
	    this.ycoordinate = oldpPoint.ycoordinate;
	  }
	
	 
	  // Get the value of the x coordinate
	  double getX() {
	    return xcoordinate;
	  }
	 
	  // Get the value of the y coordinate
	  double getY() {
	    return ycoordinate;
	  }
	 
	  //to return values to display
	  public String toString(){
	    return xcoordinate +","+ycoordinate;

	
   }
}
