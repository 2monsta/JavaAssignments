package assignment;

import java.text.MessageFormat;
import java.util.Scanner;

public class Assignment3 {


	
	/**
	 * use a switch statement for this function (no ifs allowed)
	 * 1=January, 2=February ... 12=December (notice they start with uppercase)
	 * return "Invalid Month" if not between 1 and 12.
	 * @return 
	 */
	public static String monthName(int month)
	{
		switch(month){
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "Invalid Month";
	}

	/**
	 * use one or more if statements for this function (no switch allowed).
     * Hint: A chained if statement probably makes more sense 
	 * 1=January, 2=February ... 12=December (notice they start with uppercase)
	 * return "Invalid Month" if not between 1 and 12.
	 * @return 
	 */
	public static String monthName_if(int month)
	{
		if(month ==1){
			return "January";
		}
		else if(month == 2){
			return "February";
		}
		else if(month == 3){
			return "March";
		}
		else if(month==4){
			return "April";
		}	
		else if(month == 5){
			return "May";
		}
		else if(month == 6){
			return "June";
		}
		else if(month == 7){
			return "July";
		}
		else if(month == 8){
			return "August";
		}
		else if(month == 9){
			return "September";
		}
		else if(month == 10){
			return "October";
		}
		else if(month == 11){
			return "November";
		}
		else if(month == 12){
			return "December";
		}
		else{
		return "Invalid Month";     
		}
    }
	
    /**
    * This function calculates the commision a company gives its vendor for a given product. The commission is calculated as follows (can safely assume amount is greater than 0):
    - if it is an annual license, the rates are:
        10% if sale is between $ 0 and $1,000
        15% if sale is between $1,001 and $10,000
        20% if sale is above $10,000
    - if it is a forever license (not an annual one), the rates are:
        10% if sale is between $ 0 and $10,000
        15% if sale is between $10,001 and $50,000
        20% if sale is above $50,000
    */   
    public static int commissionRate(boolean isAnnualLicense, int saleAmount)
    {
    	
    	if(isAnnualLicense==true){
    		if(saleAmount >=0 && saleAmount<= 1000){
    			return 10;
    		}
    		else if(saleAmount >=1001 && saleAmount <= 10000){
    			return 15;
    		}
    		else if(saleAmount >10000){
    			return 20;
    		}
    		else {
    			return saleAmount;
    		}
    	}
    	else{
    		if(saleAmount <= 10000 && saleAmount>=0){
    			return 10;
    		}
    		else if(saleAmount >=10001 && saleAmount <= 50000){
    			return 15;
    		}
    		else if(saleAmount > 50000){
    			return 20;
    		}
    		else {
    			return saleAmount;
    		}
    	}
    }
    
    
    /* The AHA classifies diabetes (or normal sugar) depending on two different tests, according to the following table
      - if it is an FPG test
	  	+ <100 of blood glucose -> Normal 
    	+ 100-125  mg/dL of blood glucose -> Prediabetes
		+ 126 or more of blood glucose -> Diabetes
	 - if it is not an FPG test (it is an OGTT test)
	 	+ <140 of bloog glucose -> Normal
		+ 140-199 of blood glucose -> Prediabetes
		+ 200+ of blood glucose -> Diabetes
	*/
    public static String diabetesStatus(boolean isFPGTest, int bloodGlucose)
    {
    	if(isFPGTest==true){
    		if(bloodGlucose <100){
    			return "Normal";
    		}
    		else if(bloodGlucose >=100 && bloodGlucose <=125){
    			return "Prediabetes";
    		}
    		else if(bloodGlucose >= 126){
    			return "Diabetes";
    		}
    	}
    	else {
    		if(bloodGlucose <140){
    			return "Normal";
    		}
    		else if(bloodGlucose <=199 && bloodGlucose >=140){
    			return "Prediabetes";
    		}
    		
    		else if(bloodGlucose >= 200){
    			return "Diabetes";
    		}
    	}
    			return "";
   }
    
	public static void main(String[] args) {
		// Use as you see fit, not used for grading
		
		System.out.println(commissionRate(true,100000));
		
		System.out.println(diabetesStatus(true, 120));
	}

}
