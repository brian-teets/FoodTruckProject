## Food Truck Project

### Week 2 Homework Project for Skill Distillery

## Overview 

Users will input and rate a list of food trucks, then view the average rating and the highest-rated truck.

#### Structure

Define a `FoodTruck` class with fields for a unique numeric id, a name ("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), and a numeric rating.

Create a separate class with a `main` method that starts the program.  It will have an array to store up to five `FoodTruck` objects.  

The `main` method of this class is the only `static` method in the entire project.

## User Stories

#### User Story #1

The user is prompted to input the name, food type, and rating for up to five food trucks.  For each set of input, a `FoodTruck` object is created, its fields set to the user's input, and it is added to the array.  The truck id is not input by the user, but instead assigned automatically in the `FoodTruck` constructor from a static field that is incremented as each truck is created.

#### User Story #2

If the user inputs `quit` for the food truck name, input ends immediately and the program continues.

#### User Story #3

After input is complete, the user sees a menu from which they can choose to:

* List all existing food trucks.
* See the average rating of food trucks.
* Display the highest-rated food truck.
* Quit the program.

#### User Story #4

After choosing a menu item, the user sees the menu again and can choose another item until the choose to quit.

## How To Run The Program

* It is assumed the user has an IDE, such as Eclipse. 
* Download and install the .java file to local Eclipse workspace.
* Run the program

	* User / tester will enter data for up to 5 food trucks. 
	* When prompted, tester / reviewer will begin by entering the name of any food truck. Hit return.
	* Next, when prompted, tester / reviewer will enter the type of food sold by the food truck user / reviewer entered in previous step. Hit return.
	* Next, when prompted, tester / reviewer will enter their rating for the food truck. Valid input is a numeric value between 1 and 5. Hit return.
	* The program will loop and repeat the prompts. Tester / reviewer may enter a maximum of 5 food truck review sets.  
		* When prompted to enter the name of a food truck, the user may either choose to continue entering new food truck reviews,  
		* OR, may type the word 'quit'.
	* IF user chooses to quit entering new food truck names, OR reaches the maximum of 5 food truck reviews entered, then program will display menu of available options. 
		* User must either enter the menu number of 1 - 4, OR user may enter the first word of the corresponding menu item. 
		* The menu prompt will continue to be displayed if the user chooses any menu item 1 - 3. 
		* However, if the user chooses menu item 4 by typing '4', or types the word 'quit', then the loop will exit and the program will quit. 
		

## Technologies / Skills Used 

* Java
* Eclipse
* git 
* GitHub 
* Slack
* Zoom  

## Lessons Learned 

* LL1 (TODO - placeholder for lesson learned)
* LL2 (TODO - placeholder for lesson learned) 


