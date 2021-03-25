/*Problem Description:
=============================
1. Define a class for rectangle objects defined by two points, the top-left and bottom right corners of the rectangle.

2. Include a constructor to copy a rectangle, a method to return a rectangular object that encloses the current object and the rectangle 
passed as an argument.

3. Include a method to display the defining points of the rectangle.

4. Finally test the class by creating 4 rectangles and combining these cumulatively to end up with a rectangle enclosing them all.

5. Output the defining points of the rectangle you create.
===============================
*/

package com.velociter.training.mukesh;

public class TestRectangle 
{
	  public static void main(String args[]) 
	  {
	    Rectangle[] rectAngleArray = new Rectangle[4];
	    Rectangle enclosing;
	 
	    for(int i = 0 ; i < rectAngleArray.length ; i++) 
	    {
	        rectAngleArray[i] = new Rectangle(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
	        System.out.print("Co-ordinates of rectangle " + i + " are: ");
	        System.out.println(rectAngleArray[i]);
	      }

	    // Initialize the enclosing rectangle to be first rectangle
	    enclosing = rectAngleArray[0];
	    for(Rectangle rectValue : rectAngleArray)  {
	        enclosing = enclosing.encloses(rectValue);
	      }
	  
	    System.out.println("\nCoordinates of Enclosing rectangle are ");
	    System.out.println(enclosing);
	  
	  }
}
