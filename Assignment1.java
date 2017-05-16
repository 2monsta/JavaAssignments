package assignment;

public class Assignment1 {
    // This function returns true if its parameter is even, false otherwise
    // provided as example
    public static boolean isEven(int n) {
        return n%2==0;
    }

    	// This function returns true if its parameter is odd, false otherwise
    public static boolean isOdd(int n) {
        // TODO - you need to implement this
        return !isEven(n);
        
    }
    
    	// examples of using isOdd; feel free to modify
    public static void useIsOdd() {
        System.out.print("IsOdd(6) should print false - " + isOdd(6) ); // should print false
        System.out.print("IsOdd(9) should print true - " + isOdd(9) );  // should print true 
    }

    	// adapted from http://codingbat.com/prob/p187868
    	// We sleep in if it is NOT a week day or if we are on vacation. 
    	// The following function should return true if it is NOT a weekday or we are on vacation (or both), false otherwise
    public static boolean sleepIn(boolean isWeekDay, boolean areWeOnVacation)
    {
        // TODO - you need to implement this
    	return (!isWeekDay || areWeOnVacation);
    	
    }
    
    	// Example, returns whether the first parameter is between the other two (inclusive)
    public static boolean isInBetween(int number, int low, int high) {
    	 return number<=high && number>=low;
    }
    
    	// adapted from http://codingbat.com/prob/p184004
    	// Given an int n, return true if it is within 10 of 100, inclusive (so 90 to 110) 
    	// HINT - you can call isInBetween with the right parameters ...
    public static boolean nearHundred(int n) {
        // TODO - you need to implement this
        return isInBetween(n, 90, 110);
    }

    	// Given an int n, return true if it is within 10 of 200, inclusive (so 190 to 210)
    public static boolean nearTwoHundred(int n) {
        // TODO - you need to implement this
        return isInBetween(n, 190, 210);
        
        
    }

    // Given an int n, return true if it is within 10 of either 100 or 200, inclusive (so 90 to 110 or 190 to 210)
    public static boolean nearSomeHundred(int n) {
        // TODO - you need to implement this
        return isInBetween(n, 90, 110) || isInBetween(n, 190, 210);
              
    }
    

    	// Given a number of yards, returns the corresponding number of feet. There are 3 feet in one yard. 
    public static int yardsToFeet(int yards)
    {
    	int feet = yards * 3;
        // TODO - you need to implement this
        return feet;
    }    
    
    	// calculates the area of a triangle. The area of a triangle is the length of the base times the height, divided by 2
    public static double triangleArea(double base, double height)
    {
    	double area = (base*height)/2;
        // TODO - you need to implement this
        return area;
    }
    
    // This is the main function that will be executed
    // Feel free to modify to try different things
    public static void main(String args[]) {
        useIsOdd();
    }
}
