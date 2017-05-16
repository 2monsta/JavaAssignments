package assignment;

import java.text.MessageFormat;
import java.util.Scanner;
import java.io.PrintStream;

public class Assignment5 {

    // NOTE - you CANNOT use recursion for any of these assignments; you have to use loops

	/**
	 * Asks user for a number between low and high (inclusive), reads it and returns it. 
	 * Read from the provided Scanner and write too the PrintStream 
	 * Keeps reading until user enters a number within range (inclusive). USE a while (or do-while) loop
	 * @param in - The Scanner to read from
	 * @param low - the lowest acceptable number
	 * @param high - the highest acceptable number
	 * @return the number read
	 * Your implementation needs to use a while or do-while loop
	 */
//	public static int readWithinRange(Scanner in, PrintStream out, int low, int high)
//	{	
//		out.println("enter a number");
//		int input = 0;
//		while(input>high || input <low){
//			input = in.nextInt();
//			if(input >= low && input <=high){
//				break;
//			}
//		}
//		return input;
//	}
	
	public static int readWithinRange(Scanner in, PrintStream out, int low, int high)
	{	
		out.println("enter a number");
		int input = 0;
		
		int counter = 0;
		
		while(counter == 0){
			
			input = in.nextInt();
			
			if(input >= low && input <=high){
				
				counter = -1;
				
			}
		}
		return input;
	}
	
	
	/**
	 * Use a for loop to write this function.
	 * The function gets a string, say a and an int, say n, and returns a new string containing a n times.
	 *   Example: 	stringTimes("abc",3) => "abcabcabc"
	 *   			stringTimes("Hola",2) => "HolaHola"
	 *   			stringTimes("Abc",0) => "" 
	 * @param theString - the string to replicate
	 * @param times - you can safely assume times>=0
	 */
	public static String stringTimes(String theString, int times)
	{
		String ans="";
		for(int i = 1; i<=times; i++){
			ans = ans + theString;
		}
		return ans;
	}
	
    
    /**
	 * Use an appropriate loop to write this function 
     * a number is prime if it is divisible only by itself and 1 (that is, if it is not divisible by any number between * itself and 1; we can optimize and just check between 2 and the square root of the number).
     * by convention, 1 is NOT prime
     * this function returns true if its parameter is prime, false otherwise.
     * Examples:
     * isPrime(1) => false
     * isPrime(2) => true
     * isPrime(3) => true
     * isPrime(4) => false
    */
    public static boolean isPrime(int n)
    {
    	
		for ( int i = 3; i<= n; i++){
			if(n<2){
				return false;
			}else{
				if(n==2 || n ==3){
					return true;
				}else{
					if(n%2!=0 && n%5 !=0 && n%3 !=0){ //I know that prime numbers cannot be divisible by smaller prime numbers
						return true;
					}
				}	
			}	
		}
		return false;
	}

	// This one is given to you; you may want to use it in printFizzBuzz
	public static String FizzBuzz(int number) 
	{
		if( (number%3==0) && (number%5==0)) { // or if (number%15==0), but ...
			return "FizzBuzz";
		}
		else if( number%3 == 0 ) {
			return "Fizz";
		} else if( number%5 == 0 ) {
			return "Buzz";
		} else {
			return ""+number;
		}
	}

	/*
	 * use a for loop to print the appropriate FizzBuzz values (feel free to
	 * call the provided FizzBuzz function) for values from from to to, 
	 * including both of those values. Each value should be printed in a separate line.
	 */
	public static void printFizzBuzz(int from, int to, PrintStream out)
	{
//		while(from <= to){
//			out.println(FizzBuzz(from));
//			from++;
//		}
		
		for(int i = from; i <= to; i++){   // What should be the initial variable?
			out.println(FizzBuzz(i));
		}
	}
	
	
	/* This function should Return the value of the product of all the numbers
	 * between its two parameters (including the parameters). Can safely assume from<=to
	 * Examples:
	 * 		productFromTo(3,5) => 3 * 4 * 5 = 60
	 * 		productFromTo(1,6) => 1* 2 * 3 * 4 * 5 * 6 = 720
	 */
	public static int productFromTo(int from, int to)
	{
		int product = 1;
		while(from <= to){
			product *=from;
			from++;
		}
		return product;
		
	}
	
	/*readAndSumPositives (notice you're given the Scanner, do not use System.in)
	 * reads from user until given 0, Returns sum of the positive numbers read
	 * Examples:
	 *   user enters: 0   => return 0
	 *   user enters 1 2 3 0 => returns 6 (1+2+3)
	 *   user enters 1 -2 3 0 => returns 6 (1+3, skip -2 since it is negative)
	 */
	public static int readAndSumPositives(Scanner in,PrintStream out)
	{
		out.println("read a number");
		int input = 0;
		int sum =0;
		int counter = 0;
		while(counter == 0){
			input = in.nextInt();
			if(input == 0){
				counter = -1;
			}else if(input<0){
				continue;
			}else{
				sum+=input;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		// Use this as you see fit. Not graded
		//System.out.println("The sum is " + readAndSumPositives(new Scanner(System.in),System.out));;
		//printFizzBuzz(11,100,System.out);
		//System.out.println(isPrime(9));
		
	}
	
}
