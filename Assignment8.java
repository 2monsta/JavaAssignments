package assignment;

import java.text.MessageFormat;
import java.util.Scanner;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.time.LocalDate;

class Review {
	public String reviewText;
	public int numberOfStars;
	
	public Review(String reviewText, int numberOfStars) {
		this.reviewText=reviewText;
		this.numberOfStars=numberOfStars;
	}
}
class GameInfo {
	private String title;
	// need an array to keep the reviews; I suggest as below, but feel free to use something else
	// your array needs to be able to contain *at least 10* reviews. My tests will not add more than 10 (later we'll see better collections)
	// private Review[] reviews;
	// can add any other fields; for example, one to keep track of how many reviews you actually have (your array may contain up to 10, but at any given time may have way less; even 0)
	private Review[] reviews;
	int numOfReviews = 0;
	
	public GameInfo(String title) {
		this.title=title;
		reviews = new Review[10];  // can you please explain why you MUST initialize reviews??
		
		// you may want to initialize any other variables you create here
	}
	
	public String getTitle() {
		return title;
	}
	
	
	// TODO - adds the review to the 'array' of reviews. You need to keep all reviews in an array
	public void addReview(Review r) {
		reviews[numOfReviews] = r;
		++numOfReviews;
		
	}

	// TODO - returns the number of reviews which have been added to this GameInfo
	public int getNumberOfReviews() {
		return numOfReviews;
	}
	
	// TODO - returns the sum of the number of stars which have been added to this GameInfo
	// you have to calculate this from your array
	public int getSumOfStars() {
		int sumOfStars =0;
		for(int i = 0; i<numOfReviews; i++){
			sumOfStars += reviews[i].numberOfStars;
		}
		return sumOfStars;

	}

	// TODO - returns the average number of stars for this GameInfo's reviews
	// again, have to calculate this (or at least the sum of stars) from your array
	public double getAverageStarRating() {
		double average = (double) getSumOfStars()/ numOfReviews;
		return average;
	}
}

public class Assignment8 {
	
	// TODO - calculate the product of an array of ints. Can assume array is not empty
	public static int getArrayProduct(int[] arr) {
		int product;
		product = arr[0] * arr[1];
		for ( int i = 2; i<arr.length; i++){
			product *= arr[i];
		}
		return product;
		
	}
	
	// TODO - this function returns the largest element in an array. Can assume array is not empty
	public static int max(int[] arr) {
		// we assume the array is not empty
		
		int largestSoFar;
		largestSoFar = arr[0];
		for(int i =1; i< arr.length; i++){
			if(largestSoFar < arr[i]){
				largestSoFar = arr[i];
			}
		}
		return largestSoFar;
		
		
	}

	// TODO - get the x coordinate of the point with the lowest X coordinate in the array
	// can assume array is not empty
	public static int getLowestX(Point[] arr)
	{
		Point lowestX = arr[0];
		for(int i = 1; i<arr.length; ++i){
			if(lowestX.x > arr[i].x ){
				lowestX.x = arr[i].x;
			}
		}
		return lowestX.x;
	}
	
	// TODO - get a point representing the top-left corner of a given array of points
	// this is a point with the lowest X and the lowest Y (notice this may not be a point in the array)
	// so, for points (1,5), (2,4), (3,3) the top-left corner would be (1,3), since 1 is the lowest X and 3 is the lowest Y
	// can assume array is not empty
	public static Point getTopLeftCorner(Point[] arr) {
		Point topLeftCorner = arr[0];
		for(int i = 1; i< arr.length; ++i){
			
				if(topLeftCorner.y > arr[i].y){
					topLeftCorner.y = arr[i].y;
				}
			
				if(topLeftCorner.x > arr[i].x){
					topLeftCorner.x = arr[i].x;
				}
			}
		return topLeftCorner;
	}
	
	
	public static void main(String[] args) {
		
		// you can use this as you wish to test or exercise your function. Not graded.
		GameInfo p1 = new GameInfo("MEH");
		Review p = new Review("decent", 5);
		p1.addReview(p);
	}
}


