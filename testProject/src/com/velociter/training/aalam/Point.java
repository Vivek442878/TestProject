package com.velociter.training.aalam;

public class Point 
{

	private double x ;  //x ,y will used to hold upcoming values 
	private double y ;
	
	// Create a Point object by using given  coordinate value x ,y
	  public Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }
	 
	  // Create a Point object by another Point reference from both constructor one will be execute
	  public Point(Point p) {
	    x = p.x;
	    y = p.y;
	  }
	 
	  // Get the value of the x coordinate
	  double getX() {
	    return x;
	  }
	 
	  // Get the value of the y coordinate
	  double getY() {
	    return y;
	  }
	 
	  public String toString(){
	    return x +","+y;

	
   }
}
