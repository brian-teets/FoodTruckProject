package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 1; // every food truck will have a unique numeric ID. initialized with value of 1
	private int iD;
	private String name;
	private String foodType;
	private int rating;
	private final int MAX_TRUCKS = 5; // per user story 1: user may rate UP TO 5 food trucks

	// TODO one to two lines of code within FoodTruck constructor to iterate / loop
	// for iD
	public FoodTruck( String name, String foodType, int rating) {
		this.iD = nextTruckId; // nextTruckId is shared, but
		nextTruckId++; // then increment the value of nextTruckId + 1 and assign to this invoking object's iD
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}
	
	public FoodTruck() {
		// no arg constructor 
		this.iD = nextTruckId; // nextTruckId is shared, but
		nextTruckId++; // then increment the value of nextTruckId + 1 and assign to this invoking object's iD
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	

} // end of FoodTruck class
