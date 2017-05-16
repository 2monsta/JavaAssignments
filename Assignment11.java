package assignment;

import java.text.MessageFormat;
import java.util.*; // List, ArrayList, Map, HashMap
import java.io.*; // Reader, FileInputStream etc


public class Assignment11 {
	
	/* utility function to print a List. Feel free to use for debugging
	 */
    public static <T> void printArray(List<T> array) {
        System.out.print("{ ");
        for(T elem : array) {
            System.out.print(elem);
            System.out.print(" ");
        }
        System.out.println("}");        
    }
    
    /**
     * Example function showing how to read from a file
     * @param fileName
     * @return an ArrayList containing all ints in the file (as long as it has right format)
     * @throws FileNotFoundException if the file doesn't exist
     * @throws IOException if there are other IO issues
     */
    public static ArrayList<Integer> readAllIntsFromFile(String fileName) throws FileNotFoundException, IOException
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        InputStream inS=new FileInputStream(fileName);
        Scanner s=new Scanner(inS);
        while(s.hasNextInt()) {
            arr.add(s.nextInt());            
        }
        inS.close();
        s.close();
        return arr;
    }
    
    /** TODO - you need to implement this function, similarly to readAllIntsFromFile
     * Can assume the file contains only doubles (represented as text).
     * @param fileName
     * @return a list of Doubles
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static ArrayList<Double> readAllDoublesFromFile(String fileName) throws FileNotFoundException, IOException
    {
        ArrayList<Double> arr=new ArrayList<Double>();
        InputStream inS = new FileInputStream(fileName);
        Scanner s=new Scanner(inS);
        while(s.hasNextDouble()){
        	arr.add(s.nextDouble());
        }
        inS.close();
        s.close();
        return arr;
    }
    
    /** TODO - you need to implement this function.
     * You need to read ints from a file (can just call readAllInstFromFile) and calculate their sum
     * --- You need to handle all exceptions. If reading from the file throws an exception
     * this function should return 0.
     * @param fileName
     * @return the sum of all ints in the file
     */
    public static int intFileSum(String fileName) throws Exception  // why don't i have to use the throws Exception here? I tried without throws Exception and it still works?
    {
    	// remember, in this function you need to handle all exceptions !!
    	// you can call readIntsFromFile
    	try{
    		ArrayList<Integer> ints = readAllIntsFromFile(fileName);
    		int sum =0;
    		for(int i=0; i<ints.size(); i++){
    			sum+=ints.get(i);
    		}
    		return sum;
    	}catch(Exception e){
    		return 0;
    	}
    	
    }
    
    /**
     * Example function of reading all lines from a file. Returns an ArrayList of Strings 
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static ArrayList<String> readAllLinesFromFile(String fileName) throws FileNotFoundException, IOException
    {
        ArrayList<String> arr=new ArrayList<String>();
        InputStream inS=new FileInputStream(fileName);
        Scanner s=new Scanner(inS);
        while(s.hasNext()) {
            arr.add(s.nextLine());            
        }
        inS.close();
        return arr;
    }
    public static void printFizzBuzz(int from, int to){
    	for(int i = from ; i<=to; i++){
    		if(i %3==0 && i %5==0){
    			System.out.println("FizzBuzz");
    		}
    		else if(i %3 ==0){
    			System.out.println("Fizz");
    		}
    		else if(i%5==0){
    			System.out.println("Buzz");
    		}else{
    			System.out.println(i);
    		}
    	}
    }
	
	public static void main(String[] args) throws Exception // don't do this in real life, catch the exceptions :)
    {
		// you can use this as you wish to test or exercise your function. Not graded.
//        ArrayList<Integer> arr=readAllIntsFromFile("inputs/ints.txt");
//        printArray(arr);
//                
//        ArrayList<String> arr2=readAllLinesFromFile("inputs/doubles1.txt");
//        printArray(arr2);
//
//        ArrayList<Double> arr3=readAllDoublesFromFile("inputs/doubles2.txt");
//        printArray(arr3);
        
        printFizzBuzz(1,100);

    }
}


