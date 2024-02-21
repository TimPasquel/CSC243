// Author: Tim Pasquel
// Major: Information Technology
// Creation Date: Feb 6 2024
// Due Date: Feb 14 2024
// Course: CSC243 - 10
// Prefessor: Professor DeMarco
// Assignment Number: Program 1
// Filename: Retirement_SavingsTP.java 
// Purpose: Program takes the amount of years until retirement as well as the
// amount of money saved annually, then calculates the money that will be saved
// for retirement

// Import the required libraries
import java.util.Scanner;
import java.util.Formatter;

public class Retirement_SavingsTP {

//
// Function Name: calc
//
// Description: Takes the number of years until retirement and the amount of money
// saved anually to compound the money to figure out the total amount of money 
// for retirement
//
// Parameters: int years - Number of years till retirement
// 				double saved - Amount of money saved each year for retirement
//
// Return Value: double - Amount of money for retirement
//
public static double calc(int years, double saved) {
	double total = 0;

	// Calculates money saved	
	while(years > 0) {
		total = (total + saved) * 1.05;
		years--;
	}
	
	return total;
}

//
// Function Name: getYears
// 
// Description: Asks the users for the amount of years until retirement and then
// returns that value
//
// Parameters: None
//
// Return Value: int - Number of years until retirement
//
public static int getYears() {
	Scanner in = new Scanner(System.in);
	int years = 0;
	do
	{
		// Prompts the user for input 
		System.out.println( "Please Enter the Number of Full Years Until Retirement:");
		years = in.nextInt();
	
		// Error checking
		if(years <= 0 || years > 150) {
			System.out.println("Please Enter a Valid Number of Years Until Retirement [Above 0, 150 and below]");
			years = 0;
		}
	}
	while(years <= 0 || years > 150);
	return years;
}

//
// Function Name: getSaved
//
// Description: Asks the user for the amount of money saved annually for retirement
// and then returns that value
//
// Parameters: None
//
// Return Value: double - Amount of money saved annually
//
public static double getSaved() {
	Scanner in = new Scanner(System.in);
	double saved = 0;
	do
	{
		// Prompts the user for input
		System.out.println( "Please Enter the Amount of Money Saved Annually [$USD]:");
		saved = in.nextDouble();

		// Error checking
		if(saved <= 0) {
			System.out.println("Please Enter a Valid Amount of Money Saved Annually [$0 and Above]");
		}
	}
	while(saved <= 0);

	return saved;
}

//
// Function Name: main
//
// Description: Runs all of the nessessary functions to figure out the money
// saved for retirement
//
// Parameters: None
//
// Return Value: None
//
public static void main(String[] args) {

// Define variables and objects
Scanner in = new Scanner(System.in);
boolean flag = true;

do {
	Formatter formatter = new Formatter();
	int choice = 0;
	int years = 0;
	double saved = 0;
	double total = 0;

	years = getYears();
	saved = getSaved();
	total = calc(years, saved);

	// Formats the output to have commas and 2 decimal places
	formatter.format("%,.2f", total);

	// Outputs the amount of money saved
	System.out.println("There will be $" + formatter.toString() + " in " + years + " years for retirement");

	// Asks user to exit or continue
	do{
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Exit? (1 - Exit | 0 - Continue)");
		System.out.println("---------------------------------------------------------------------------------");
		choice = in.nextInt();
	}
	while(choice > 1 || choice < 0);

	// Sees if program needs to exit
	if(choice == 1){
		flag = false;
	}

	System.out.println("---------------------------------------------------------------------------------");
}
while(flag == true);

// Exits program
System.out.println("Goodbye...");

} // End Main

} // End Class
