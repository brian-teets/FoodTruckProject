package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	// inside of FoodTruckApp class will contain array of up to five FoodTruck objects

	public static void main(String[] args) {
		
		// TODO User Story #1 - prompt user to input name, food type, 
		// and rating for up to 5 food trucks. The food truck id is not input by the user
		// but instead assigned automatically from the Food Truck constructor (Food Truck class). 
		// Truck id is incremented when a new truck object is created. 
		Scanner tn = new Scanner(System.in); // scanner object to collect and store food truck name user entered 
		
		
		FoodTruck[] trucks = new FoodTruck[ 5 ]; // trucks is an array of 5 food truck objects 
		
		for( int i = 0; i < 5; i ++ ) {
			
			System.out.println("Please enter the name of a food truck you want to rate, or type Quit to exit: ");
			String truckName = tn.nextLine();
			if(truckName.equalsIgnoreCase("quit")) { // if user types the word quit, regardless of case
				break; // then we break the loop 
			}
			System.out.println("Now, please enter the type of food: ");
			String foodType = tn.nextLine();
			System.out.println("Now, please enter your rating from 1 to 5: ");
			int rating = tn.nextInt();
			tn.nextLine();
			
			FoodTruck tempTruck = new FoodTruck( truckName, foodType, rating ); 
			trucks[i] = tempTruck;
			
			
		} 
		// TODO User Story 3 - display user Menu
		 userMenu(); 
		 tn.close(); // close the Scanner object
		 
	} // end of main method 
	
	// TODO User Story 3 - create method to display menu of options to user
	public static void userMenu(  ) {
		System.out.println("Enter 1 - 4 to choose from the menu below: ");
		System.out.println("1 List all existing food trucks ");
		System.out.println("2 See the average rating of food trucks ");
		System.out.println("3 Display the highest-rated food truck ");
		System.out.println("4 Quit the program ");
		System.out.println(  );
		
		Scanner choice = new Scanner(System.in);
		String userInput = choice.nextLine(); 
			
			boolean keepGoing = true;
			while(keepGoing) {
				
				if( userInput == "1" || userInput.equalsIgnoreCase("list") )  {
					System.out.println( "placeholder - invoke toString method of FoodTruck class" );
				}
				else if( userInput == "2" || userInput.equalsIgnoreCase("see") || userInput.equalsIgnoreCase("average")) {
					// Sysout calculated average rating from tempTruck array inside of main - how to? 
					
				}
				else if( userInput == "3" || userInput.equalsIgnoreCase("display") || userInput.equalsIgnoreCase("higest")
						|| userInput.equalsIgnoreCase("highest-rated") ) {
					// Sysout highest rated value from tempTruck array inside of main - how to? 
				}
				else if( userInput == "4" || userInput.equalsIgnoreCase("quit")) {
					System.out.println("Goodbye");
					keepGoing = false; 
				}
				
			}
		
		choice.close(); 

		// TODO User Story 4 - 
		
	} // end of my userMenu method 
	

} // end of class 
