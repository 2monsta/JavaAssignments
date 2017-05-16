package assignment;

import java.util.Scanner;
import java.util.Random;

interface IShape  {
	double getArea();
	double getPerimeter();
    String forProblemStatement(); 
}

// Provided to you as an example
class Rectangle implements IShape {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() { return width*height; }
	
	@Override
	public double getPerimeter() { return 2*(width+height); } 
	
	@Override
	public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
	
	@Override
	public String forProblemStatement() {
        return "rectangle with width "+ width +" and height "+height+".";
	}
}

class Circle implements IShape {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override public double getArea() { return Math.PI*radius*radius;}
	@Override public double getPerimeter() {return 2*radius*Math.PI;} 
	@Override public String toString(){ return "Circle[radius:"+radius+"]"; }
    @Override public String forProblemStatement() {
        return "circle with radius "+radius;
    }
}

// TODO - define a class Square and implement functions. The constructor takes one double only (the side of the square).
// I am giving you the skeleton. You also need to implement getSide
class Square implements IShape {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	
	double getSide(){
		return side;
	}
	
	@Override
	public double getArea() { 
		return side * side; 
	}
	
	@Override
	public double getPerimeter() { 
		return side * 4; 
	} 
	
	// should return something like Square[side=x] ; not tested
	@Override
	public String toString(){ return "Square [side = " + side + " ]"; }
	
	// this should return "square with side x. where x is the length of the side; not tested
	@Override
	public String forProblemStatement() {
        return "square with side ." + side;
	}
}

// TODO - define a class RegularPolygon and implement functions. The constructor takes three parameters, the first is the number of sides (an int), the second is the size size and the third is the apothem.
// I googled for you - http://www.mathwords.com/a/area_regular_polygon.htm :)
// fun extension - make fromProblemStatement use right names for Regular polygons of sm
// no skeleton provided

class RegularPolygon implements IShape {
	private int side;
	double size, apothem;
	public RegularPolygon(int side, double size, double apothem){
		this.side = side;
		this.size = size;
		this.apothem = apothem;
	}
	@Override
	public double getArea(){
		double area = .5 * apothem * side * size;
		return area;
	}
	@Override
	public double getPerimeter(){
		double perimeter = side * size;
		return perimeter;
		
	}
	@Override
	public String forProblemStatement(){
		return "";    // not sure what the question is asking about? What is sm?
	}
}


class ShapeFactory {
	public static Random randomGenerator=new Random();
	public static IShape getShapeInstance(String kindOfShape, double param1, double param2, double param3) {
		kindOfShape=kindOfShape.toLowerCase();
		if(kindOfShape.equals("circle")) {
			return new Circle(param1);
		} else if (kindOfShape.equals("rectangle")) {
			return new Rectangle(param1, param2);
		} else if(kindOfShape.equals("squre")){  						// capital letters would not make a difference right? Because of the toLowerCase()?
			return new Square(param1);
		} else if(kindOfShape.equals("reuglarPolygon")){
			return new RegularPolygon((int)param1, param2, param3);
		}
        // TODO - after you've implemented your Square class, add it here so this function may return one
        // TODO - after you've implemented your RectangularPolygon class, add it here so this function may return one        
		else
			return null;
	}
	
	public static IShape getRandomShape() {
		String[] shapeNames={"circle", "rectangle" , "square", "regularPolygon"};
        // TODO - after you've implemented Square and RectangularPolygon, add them to the array above so they work
		int shape=randomGenerator.nextInt(shapeNames.length);
		int param1=randomGenerator.nextInt(10)+1;
		int param2=randomGenerator.nextInt(10)+1;
		int param3=randomGenerator.nextInt(10)+1;
        
        return getShapeInstance(shapeNames[shape],param1,param2,param3);
	}
}

public class Assignment9 {
	
    public static void askAreaProblem(IShape s, double acceptableVariance)
    {
        System.out.println("What is the area of a "+s.forProblemStatement());
        double answer=new Scanner(System.in).nextDouble();
        double area=s.getArea();
        if(Math.abs(answer-area)<=acceptableVariance) {
            System.out.println("Yay ! your answer, "+answer+" is correct");
        } else {
            System.out.println("Sorry :( your answer, "+answer+" is not correct.");
            System.out.println("The correct answer is "+area);
        }
    }
    
    public static void askPerimeterProblem(IShape s, double acceptableVariance)
    {
        System.out.println("What is the perimeter of a "+s.forProblemStatement());
        double answer=new Scanner(System.in).nextDouble();
        double perimeter=s.getPerimeter();
        if(Math.abs(answer-perimeter)<=acceptableVariance) {
            System.out.println("Yay ! your answer, "+answer+" is correct");
        } else {
            System.out.println("Sorry :( your answer, "+answer+" is not correct.");
            System.out.println("The correct answer is "+perimeter);
        }
    }

 
    // TODO - you need to implement this function
    public static double getAverageArea(IShape[] shapes)   // can we reuse IShape? Eventhough they are being used as an interface?
    {
    	double averageArea = 0;
    	for ( int i = 0; i<shapes.length; i++){
    		averageArea +=shapes[i].getArea();
    	}
    	double average = averageArea / shapes.length;
    	return average;
    }
    
    // TODO - you need to implement this function
    public static double getAveragePerimeter(IShape[] shapes)
    {
    	double averagePerimeter = 0.0;
    	for(int i = 0; i<shapes.length; i++){
    		averagePerimeter += shapes[i].getPerimeter();
    	}
    	return averagePerimeter / shapes.length;
    }

    public static void main(String[] args) {
        IShape shp=ShapeFactory.getRandomShape();
	    askAreaProblem(shp,.01);
	    askPerimeterProblem(shp,.01);
       
    }
}
