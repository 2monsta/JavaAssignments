package assignment;

import java.text.MessageFormat;
import java.util.Scanner;
import java.io.PrintStream;

public class Assignment2 {
	
	/**
	 * This is a sample for you to get started.
	 * This method reads one integer from a Scanner it takes as parameter and returns twice the number read. 
	 * @return twice the number read, an int.
	 */
	public static int readAndDouble(Scanner in, PrintStream out)
	{
		out.println("Please enter a number");
		int number=in.nextInt();
		return 2*number;
	}
	
	/**
	 * YOU NEED TO IMPLEMENT THIS
	 * Need to read two numbers from the given Scanner (may want to print messages to the given PrintStream), and return their sum
	 * @return the sum of the two numbers read
	 */
	public static int readAndAdd(Scanner in, PrintStream out)
	{
		out.println("Enter Two Numbers");
		int number = in.nextInt();   //Is there a way to write two numbers in one line? Or do you have to write them in separate lines?
		int number2 = in.nextInt();
		return number + number2;
	}
	
	//Self-Added Function
		public static void printNumbers(int a, PrintStream out){
		out.println("The sum equals " + a);
	}
		
	/** 
	 * YOU NEED TO IMPLEMENT THIS
	 * Need to read two numbers from the given Scanner (may want to print messages to the given PrintStream), and return their product
	 * @return the product of the two numbers read
	 */
	public static int readAndMultiply(Scanner in, PrintStream out)
	{
		out.println("Enter Two Numbers");
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		return number1 * number2;
		
	}
	// Self-Added Function
	public static void printMultiply( int a2, PrintStream out){
		out.println("The product equals " + a2);
	}
	

	/**
	 * You need to implement this
	 * This function takes two int parameters, and a PrintStream, and prints (to the given PrintStream) their sum, difference, product, quotient and remainder.
	 * Preferably, print a message before it, like "The sum of 3 and 5 is 8"
	 * @param number1
	 * @param number2
	 */
	public static void printAllOperations(int number1, int number2, PrintStream out)
	{	
		out.print("The Sum of sum and product is ");
		out.println(number1 + number2);
		out.print("The Difference of sum and product is ");
		out.println(number1 - number2);
		out.print("The product of sum and product is ");
		out.println(number1 * number2);
		out.print("The quotient of sum and product is ");
		out.println(number1 / number2);
		out.print("The remainder of sum and product is ");
		out.println(number1 % number2);
		
	}

	/**
	 * TODO - you need to implement this function. 
	 * This function should:
	 *   1. Call readAndAdd to get a value
	 *   2. Call readAndMultiply to get another value
	 *   3. Call printAllOperations with those two values (in that order)
	 * @param args unused, will see later
	 */
		
	public static void main(String args[])
	{ 
		Scanner s = new Scanner(System.in); //Should this always be here when you create a Scanner?
		
		// readAndAdd
		int sum = readAndAdd(s, System.out);
		printNumbers(sum, System.out);
	
		// readAndMultiply
		int product = readAndMultiply(s, System.out);
		printMultiply(product, System.out);
		
		// printAllOperator
	
		printAllOperations(sum, product, System.out);
		
	}
	
}
