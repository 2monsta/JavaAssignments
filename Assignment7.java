package assignment;

import java.text.MessageFormat;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.time.LocalDate;

/**
 * This class represents a turtle, like a Logo-like turtle, which keeps its position.
 * The turtle keeps its x and y position, and has methods moveNorth() etc which change it
 * Assume normal math coordinates and map convention, so as you move up (North) y increases, and as you move East x increases.
 *
 */
class Turtle {
	// HINT - you may want to have variables to keep the position. Keep these variables private,
	private int x,y;
	
	// TODO - The empty constructor initializes position to 10,10
	public Turtle() {
		this.x = 10;
		this.y =10;	
	}
		
	public int getX() { 
		// TODO - implement this
		return this.x;
	}
//	public void setX(int x){
//		this.x=x;
//	}
	public int getY() {
		// TODO - implement this
		return this.y;
	}
	
	public void moveNorth() {
		this.y++;
		// TODO - implement this. this increments the y coordinate by one unit
	}
	
	public void moveSouth() {
		this.y--;
		// TODO - implement this. this decrements the y coordinate by one unit
	}
	
	public void moveEast() {
		this.x++;
		// TODO - this increments the x coordinate by one unit
	}
	
	public void moveWest() {
		this.x--;
		// TODO - this decrements the x coordinate by one unit
	}
	
	public String toString() {
		return "Turtle[x="+getX()+", y="+getY()+"]";
	}
	
	public boolean equals(Turtle t)
	{
		
		// TODO - you need to implement this
		// two turtles are equal if their X and Y coordinates are equal.
		return getX() == getY();
		//return this.x == this.y;
	}
	
	public void move(String direction)
	{
		if(direction == "North"){
			moveNorth();
		}else if(direction == "South"){
			moveSouth();
		}else if(direction == "East"){
			moveEast();
		}else if(direction =="West"){
			moveWest();
		}
		// TODO - you need to implement this
		// move to the right direction; direction can be North, South, East, West
	}
}

public class Assignment7 {
	// TODO - you need to implement this. Move the given turtle to the West, n times
	public static void moveTurtleWest(Turtle t, int n)
	{
		for(int i = 1; i<=n; ++i){
			t.moveWest();
		}
	}

	// TODO - you need to implement this. Move the given turtle to the East, n times
	public static void moveTurtleEast(Turtle t, int n)
	{
		for(int i = 1; i<=n; ++i){
			t.moveEast();
		}
	}
	
	// TODO - you need to implement this. Move the given turtle to the North, n times
	public static void moveTurtleNorth(Turtle t, int n)
	{
		for(int i = 1; i<=n; ++i){
			t.moveNorth();
		}
	}

	// TODO - you need to implement this. Move the given turtle to the South, n times
	public static void moveTurtleSouth(Turtle t, int n)
	{
		for(int i = 1; i<=n; ++i){
			t.moveSouth();
		}
	}
	
	// TODO - you need to implement this. Move the turtle to the asked position, by calling MoveXXX etc
	public static void moveTurtleTo(Turtle t, int x, int y)
	{
		if(x>t.getX()){
			moveTurtleEast(t,x-t.getX());
		}else if(x<=t.getX()){
			moveTurtleWest(t, t.getX()-x);
		}
		
		if(y>t.getY()){
			moveTurtleNorth(t,y-t.getY());
		}else if(y<=t.getY()){
			moveTurtleSouth(t,t.getY()-y);
		}
	}
	public static void main(String[] args) {
		// you can use this as you wish to test or exercise your function. Not graded.
		Turtle t=new Turtle();
		System.out.println(t);
		moveTurtleTo(t,15,16);
		System.out.println(t);	
		moveTurtleTo(t,2,2);
		System.out.println(t);
		moveTurtleTo(t,0,0);
		System.out.println(t);
		moveTurtleTo(t,100,100);
		System.out.println(t);
	}
}


