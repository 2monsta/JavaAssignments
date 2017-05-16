package assignment;

import java.text.MessageFormat;
import java.util.Scanner;
import java.io.PrintStream;

public class Assignment4 {

	/**
	 * Use RECURSION to write this function.
	 * Asks user for a number between low and high (inclusive), reads it. 
	 * Keeps reading until user enters a number within range (inclusive). USE RECURSION
	 * @param in - The Scanner to read from
	 * @param low - the lowest acceptable number
	 * @param high - the highest acceptable number
	 * @return the number read
	 * Your implementation needs to be RECURSIVE
	 */
	public static int readWithinRange(Scanner in, PrintStream out, int low, int high)
	{
		out.println("Enter a number within low and high");
		int num = in.nextInt();
		if (num >=low && num <=high){
			return num;
		}
		else{
			return readWithinRange(in, out, low, high );
		}
		// notice I'm passing the Scanner and the PrintStream; do NOT read from System.in or write to System.out
		 
	}
	
	/**
	 * Use RECURSION to write this function.
	 * The function gets a string, say a and an int, say n, and *returns* a new string containing a n times.
	 *   Example: 	stringTimes("abc",3) => "abcabcabc"
	 *   			stringTimes("Hola",2) => "HolaHola"
	 *   			stringTimes("Abc",0) => "" 
     * notice this function should not *print* anything
	 * @param theString - the string to replicate
	 * @param times - you can safely assume times>=0
	 */
	public static String stringTimes(String theString, int times)
	{
		if(times == 0){
			return  "";
		}
		else {
			return theString + stringTimes(theString, times -1);
		}
	}
	
    // you may want to define your recursive function as follows, and use the public one as a wrapper    
    private static boolean isPrime(int n, int lastTested)
    {
    	if(lastTested > Math.sqrt(n) ){
    		return true;
    	}
    	else if(n % lastTested == 0) {
    		return false;
    	}
    	else{
    		return isPrime(n, lastTested + 2);
    	}
    }
    
	/**
	 * Use RECURSION to write this function (or make this function a wrapper over another recursive function)
     * a number is prime if it is divisible only by itself and 1 (that is, if it is not divisible by any number between * itself and 1; we can optimize and just check between 2 and the square root of the number).
     * by convention, 1 is NOT prime
     * this function returns true if its parameter is prime, false otherwise.
     * One way to do this is to test all numbers between 2 and n; if any of them divides it, then it is not prime. If you reach the end, then it is.
     * Examples:
     * isPrime(1) => false
     * isPrime(2) => true
     * isPrime(3) => true
     * isPrime(4) => false
     */
    public static boolean isPrime(int n)
    {
    	if(n == 2){
    		return true;
    	}
    	else if (n < 2){
    		return false;
    	}
    	else if(n % 2 == 0){
    		return false;
    	}
    	else{
    		return isPrime(n, 3);
    	}
    }
    
    /**
    * provided for you, you may use it for printFizzBuzz
    */
	public static String fizzBuzz(int number) 
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
     * Use RECURSION to write this function (or make this function a wrapper over another recursive function)
	 * this function prints the appropriate FizzBuzz values (feel free to
	 * call the provided FizzBuzz function) for values from from to to, 
	 * including both of those values. Each value should be printed in a separate line.
     * Example: printFizzBuzz(2,6) would print:
     * 2
     * Fizz
     * 4
     * Buzz
     * Fizz 
	 */
	public static void printFizzBuzz(int from, int to, PrintStream out)
	{
		if( from > to ){
			return;
		}
		else{
			out.println(fizzBuzz(from));
			printFizzBuzz(from+1, to , out);
		}
	}
    
	public static void main(String[] args) {
        System.out.println(isPrime(9));
//        System.out.println(isPrime(9));
//        printFizzBuzz(10,20,System.out);
        System.out.println(Math.sqrt(9));
	}

}
