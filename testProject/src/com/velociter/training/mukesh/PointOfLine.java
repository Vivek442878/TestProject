//program is to calculate distance of two points.
//Example:
//input: A(2,5) and B(3,7)
//output:distance of A and B= 2.2360

package com.velociter.training.mukesh;

public class PointOfLine {
	private double xValue;
	private double yValue;
	
    // creates and initializes a point with given (xValue, yValue)
	
	PointOfLine(double xValue,double yValue)
	{
		this.xValue=xValue;
		this.yValue=yValue;
		System.out.println(xValue+" "+yValue );
		
	}
	
	
	public void distance(final PointOfLine that)
	{
		    
		    double differenceOfXValue = this.xValue - that.xValue;	
			System.out.println("difference Of first point co-ordinates is="+differenceOfXValue);
	        double differenceOfYValue = this.yValue - that.yValue;
	    	System.out.println("difference Of second point co-ordinates is="+differenceOfYValue);
	    	
	    	//calculating distance formula of two points
	    	double distance =Math.sqrt((differenceOfXValue*differenceOfXValue)+(differenceOfYValue*differenceOfYValue));
	        System.out.println("distance of two point is ="+distance);		
	        
	}
	
	
	public static void main(String[] args)
	{
		PointOfLine point1 = new PointOfLine(Math.random()*100.0,Math.random()*100.0);		// first coo-ordinate points 		
		PointOfLine point2 = new PointOfLine(Math.random()*100.0,Math.random()*100.0);		// second coo-ordinate points		
		point1.distance(point2);
	
	}	
		
	
}

