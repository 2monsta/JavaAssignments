package assignment;

import java.text.MessageFormat;
import java.util.Scanner;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

import java.time.LocalDate;

import java.util.*; // List, ArrayList, Map, HashMap
 
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
	// need an ArrayList to keep the reviews; 
	ArrayList<Review> reviews;
	
	
	public GameInfo(String title) {
		this.title=title;
		// you may want to initialize any other variables you create here
		reviews = new ArrayList<Review>();
	}
	
	public String getTitle() {
		return title;
	}
	
	// TODO - adds the review to the 'array' of reviews. You need to keep all reviews in an array
	public void addReview(Review r) {
		reviews.add(r);
		
	}

	// TODO - returns the number of reviews which have been added to this GameInfo
	public int getNumberOfReviews() {
		return reviews.size();
	}
	
	// TODO - returns the sum of the number of stars which have been added to this GameInfo
	// you have to calculate this from your array
	public int getSumOfStars() {
		int sum=0;
		for(int i= 0; i<reviews.size(); i++){
			sum += reviews.get(i).numberOfStars;
		}
		return sum;
	}

	// TODO - returns the average number of stars for this GameInfo's reviews
	// again, have to calculate this (or at least the sum of stars) from your array
	public double getAverageStarRating() {
		return (double) getSumOfStars()/getNumberOfReviews();
	}
}

// TODO - you need to implement all these methods
class GameInfoCollection {
    // TODO - you need to use a Map (from a String, the title, to a GameInfo) to keep track of all the GameInfo's
    
	Map<String, GameInfo> games = new HashMap<>();
	
    // TODO - if there are no reviews for the game, create a new GameInfo  (with this review) and add it to the map
    // if there's one, add the given review to the corresponding GameInfo 
    public void addGameReview(String gameTitle, Review r)
    {
        if(games.containsKey(gameTitle)){
        	games.get(gameTitle).addReview(r);   
        }else {
        	GameInfo newGame=new GameInfo(gameTitle);      
        	newGame.addReview(r);   
        	games.put(gameTitle, newGame);
        }
    }
    
    public int getNumberOfReviewsForGame(String gameTitle)
    {
    	// TODO - implement this
       return games.get(gameTitle).getNumberOfReviews(); 
    }
    
    public double getAverageNumberOfStarsForGame(String gameTitle)
    {
    	// TODO - implement this
        return games.get(gameTitle).getAverageStarRating();
    }
    
}




public class Assignment10 {
	
	// TODO - calculate the product of a list of ints. Can assume array is not empty
	public static int getListProduct(List<Integer> arr) {
		int product = 1;
		for(int i =0; i< arr.size(); i++){
			product *= arr.get(i);     // in the video, i saw that when you sum the integers, dot size would work, why wouldn't it work here?
		}
		return product;
	}
		
	
	public static void main(String[] args) {
		// you can use this as you wish to test or exercise your function. Not graded.
	}
}


