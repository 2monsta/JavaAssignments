package assignment;

import java.awt.Point;
import java.awt.Rectangle;

public class Assignment6 {

	//this is just sample code demonstrating aliasing
	public static void aliasing1()
	{
		Point pt1=new Point(10,10);
		Point pt2=new Point(5,5);
		
		Point alias=pt1;
		alias.x+=pt2.x;
		
		alias=pt2;
		alias.y+=5;
		
		int sumX=pt1.x+pt2.x;
		int sumY=pt1.y+pt2.y;
		
		System.out.println("sumX= "+sumX+ " -sumY= "+sumY);
	}

	// more sample code
	public static void playWithRectangles(){
		Rectangle r=new Rectangle(10, 10, 5, 7);
		System.out.println(r.x);
	}
	/* Examples */
	
	/*
	 * A point is to the left of another if its x coordinate is less than the other
	 */
	public static boolean isToTheLeft(Point p1, Point p2)
	{
		return p1.x < p2.x;
	}
	
	/*
	 * A point is to the right of another if its x coordinate is bigger than the other
	 */
	public static boolean isToTheRight(Point p1, Point p2)
	{
		// TODO - you need to implement this
		return p1.x > p2.x;
	}

	/*
	 * We use 'screen coordinates', with y=0 being at the top of the screen and growing downwards
	 * so a point is above another if its y coordinate is less
	 */
	public static boolean isAbove(Point p1, Point p2)
	{
		return p1.y<p2.y;
	}

	/* isBelow returns true if the first point is below the second one (a point is below another if its y coordinate is bigger)
	 */
	public static boolean isBelow(Point p1, Point p2)
	{
		// TODO - you need to implement this
		return p1.y>p2.y;
	}

	// Example - calculate area of a rectangle
	public static int getArea(Rectangle r)
	{
		return r.width*r.height;
	}
	

	// Example - grow a rectangle's width and height by a factor. Notice we're modifying the rectangle
	public static void growRectangle(Rectangle r, int factor)
	{
		r.width *= factor;
		r.height *= factor;
	}


	/* The rectangle has the top-left coordinates (in screen coordinates, y=0 is top, y grows down)
	 * So the bottom-right coordinate can be calculated by adding the width and height to x and y, respectively
	 */
	public Point getBottomRightCorner(Rectangle r)
	{
		return new Point(r.x+r.width, r.y+r.height);
	}
	
	/*
	 * Returns the center of the rectangle. The center is obtained by adding half the width and half the height to the x and y coordinates respectively
	 * Round DOWN (if needed) when calculating the center.
	 */
	public static Point getCenter(Rectangle r)
	{
		// TODO - you need to implement this
		return new Point(r.x+r.width/2, r.y+r.height/2);
	}
	
	/**
	 * Example Returns true if x is between low and high (inclusive)
	 */
	public static boolean isInBetween(int x, int low, int high)
	{
		return x>=low && x<=high;
	}

	/**
	 * Returns true if the rectangle contains the point; that is, if the point lies within the boundaries of the rectangle
	 * If the point is exactly in the border we still return true.
	 * @param r - the rectangle
	 * @param p - the point
	 * @return true if the point lies within the rectangle or on its border
	 */
	public static boolean contains(Rectangle r, Point p)
	{
		// TODO - you need to implement this. May want to use isInBetween
		return isInBetween(p.y, r.y, r.height) && isInBetween(p.x , r.x, r.width);
	}
	
	/* Person example */
	public static void usingPerson() {
		Person p1=new Person("Orlando","Karam",40); // we construct with first, last names, age
		System.out.println(p1.getFirstName()); // would print Orlando
		System.out.println(p1.getLastName()); // would print Karam
		System.out.println(p1.getAge()); // would print 40
		
	}
	/* Example - two people are relatives if they have the same last name :) */
	public static boolean areRelatives(Person p1, Person p2)
	{
		return p1.getLastName().equals(p2.getLastName());
	}

	/* Example creating a description for a person, with name and age*/
	public String getDescription(Person p)
	{
		return p.getFirstName()+" "+p.getLastName()+" is "+p.getAge()+" years old";
	}

	/* return true if the persons' first and last name and age are equal */
	public static boolean personEquals(Person p1, Person p2)
	{
		// TODO - you need to implement this
		return p1.getFirstName().equals(p2.getFirstName()) && areRelatives(p1, p2); // p1.getLastName().equals(p2.getLastName());  //why can't i use areRelatives for the last part?
	}
	
	/* returns a person's full name, composed of the first name, a space and the last name, as in
	 * Orlando Karam
	 */
	public static String getFullName(Person p)
	{
		// TODO - you need to implement this
		return p.getFirstName() + " " + p.getLastName();
	}
	
	/* returns a 'formal' full name, composed of the last name, a comma, a space and the first name, as in
	 * Karam, Orlando
	 */
	public static String getFormalFullName(Person p)
	{
		// TODO - you need to implement this
		return p.getLastName() + "," + " " + p.getFirstName();
	}
	

	public static void main(String[] args) {
		// you can use this as you wish to test or exercise your function. Not graded.
	}
	
}
