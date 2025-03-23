package Ejercicios;

import java.util.Scanner; // Program uses Scanner

public class Temperature_converter {
	
	//Method to convert F° to C° 
	public static double CentToFahr(double cel){
			return (cel * 9 / 5) + 32;
		}
	
	//Method to convert C° to F°
	public static double FahrToCent(double far) {
			return (far - 32) * 5 / 9;
		}
	
	// Main method begins execution of java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user
		
		int option; // variable declaration. Option is the variable that selects the operation
		
		// Display menu 
		System.out.println("Temperature converter");
		System.out.println("1: C° to F°");
		System.out.println("2: F° to C°");
		
		// Read option 
		option = input.nextInt();
		
		// Operation 1. Celsius to Fahrenheit
		if (option == 1) {
			System.out.print("Enter temperature en C°: ");
			double cel = input.nextInt();
			double far = CentToFahr(cel); // Call to Class CentToFar
			System.out.printf("temperature in F° is: %f", far); // Results on screen
		}
		// Operation 2. Fahrenheit to Celsius
		if (option == 2) {
			System.out.print("Enter temperature en F°: ");
			double far = input.nextInt();
			double cel = FahrToCent(far); // Call to Class FahrToCent
			System.out.printf("temperature in C° is: %f", cel); // Results on screen
		} 
		
		//Error screen: Option is not 1 or 2
		if (option != 1 && option != 2 ) {
			System.out.print("ERROR");
		}
		
		input.close(); // Closes the Scanner object
		
	}

}
