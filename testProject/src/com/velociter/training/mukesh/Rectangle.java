// Define a class for rectangle objects defined by two points, the top-left and bottom right corners of the rectangle.

package com.velociter.training.mukesh;
public class Rectangle 
{
		private Point topLeft;
		private Point bottomRight;
		
		public Rectangle(double topLeft1, double bottomRight1, double topLeft2, double bottomRight2) 
		{
			topLeft = new Point(Math.min(topLeft1,topLeft2),Math.min(bottomRight1,bottomRight2));
			bottomRight = new Point(Math.max(topLeft1,topLeft2),Math.max(bottomRight1,bottomRight2));
		}
		
		public Rectangle(Point topLeftData, Point bottomRightData) 
		{
		    topLeftData.getfirstPoint();
		    topLeftData.getsecondPoint();
		    bottomRightData.getfirstPoint();
		    bottomRightData.getsecondPoint();
		  }

		 public Rectangle(Rectangle rectangleValue) 
		 {
			    topLeft = new Point(rectangleValue.topLeft);
			    bottomRight = new Point(rectangleValue.bottomRight);
		 }
		 // Methods to create a rectangle enclosing the current rectangle and the argument
		  public Rectangle encloses(Rectangle rectangleValue) 
		  {
		    // Return a new rectangle defined by the minimum firstPoint,secondPoint for to left and the and maximum firstPoint,secondPoint for bottom right
		    return new Rectangle(Math.min(topLeft.getfirstPoint(), rectangleValue.topLeft.getfirstPoint()),
		                         Math.min(topLeft.getsecondPoint(), rectangleValue.topLeft.getsecondPoint()),
		                         Math.max(bottomRight.getfirstPoint(), rectangleValue.bottomRight.getfirstPoint()),
		                         Math.max(bottomRight.getsecondPoint(), rectangleValue.bottomRight.getsecondPoint()));
		 
		  }
		  public String toString() 
		  {
			    return "Rectangle: " + topLeft + " : " + bottomRight;
		 }
}
