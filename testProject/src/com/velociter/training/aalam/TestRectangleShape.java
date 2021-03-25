package com.velociter.training.aalam;

public class TestRectangleShape 
{
	public static void main(String[] args) 
	{
		
		    RectangleShape[] rects = new RectangleShape[4]; //array to old rectangle object
		    RectangleShape rectangleObject;    //create reference object of type RectangleShape 
		 
		    // Initialize the RectangleShapes as arbitrary sizes and at arbitrary positions:
		    for(int i = 0 ; i < rects.length ; ++i) 
		    {
		      rects[i] = new RectangleShape(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
		      System.out.print("Coords of RectangleShape " + i + " are: ");
		      System.out.println(rects[i]);
		    }
		 
		    // Initialize the enclosing RectangleShape to be first RectangleShape
		    rectangleObject = rects[0];
		    
		    // This will give  result in the RectangleShape that encloses them all.
		    for(RectangleShape rect : rects)  
		    {
		    	rectangleObject = rectangleObject.enclosing(rect);     //here enclosing is a reference veriable 
		    }
		 
		    System.out.println("\nCoords of Enclosing RectangleShape are ");
		    System.out.println(rectangleObject);
		  }
		  
		
	}


