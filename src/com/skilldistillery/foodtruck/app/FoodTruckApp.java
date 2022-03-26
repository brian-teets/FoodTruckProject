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
		System.out.println("Please enter the name of a food truck you want to rate: ");
		Scanner sc = new Scanner(System.in);
		
		
		FoodTruck[] trucks = new FoodTruck[ 5 ]; 
//		trucks[0].setName( "name" );
		FoodTruck tempTruck = new FoodTruck(); 
		trucks[0] = tempTruck;
		tempTruck.setName = sc.nextLine();  // how do i set this object's name to the user input? 
		
		sc.close();
		
		
		// TODO User Story 3 - call userMenu
		 userMenu(); 
	}
	
	
	
	
	// TODO User Story 3 - create method to display menu of options to user
	public static void userMenu() {
		System.out.println("Enter 1 - 4 to choose from the menu below: ");
		System.out.println("1 List all existing food trucks ");
		System.out.println("2 See the average rating of food trucks ");
		System.out.println("3 Display the highest-rated food truck ");
		System.out.println("4 Quit the program ");
	}
	
	

} // end of class 
