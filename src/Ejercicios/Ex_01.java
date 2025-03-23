package Ejercicios;

import java.util.Scanner; // Program uses class Scanner

public class Ex_01 
{
	// Main method begins execution of java application
	public static void main(String[] args) 
	{		
		try (Scanner input = new Scanner( System.in )) {
			// Variable declaration
			int number1;
			int number2;
			
			int sum;
			int difference;
			int modulus;
			int product;
			int quotient;
			
			System.out.print( "Enter first integer: " ); // prompt
			number1 = input.nextInt(); 

			System.out.print( "Enter second integer: " ); // prompt
			number2 = input.nextInt(); // read second number
			
			System.out.println(); // Blank line
			System.out.printf("First number: %d\n", number1); // Scann first number
			System.out.printf("Second number: %d\n", number2); // Scann second number
			System.out.println(); // Black Line
			
			// Operations 
			sum = number1 + number2;
			difference = number1 - number2;
			product = number1 * number2;
			quotient = number1 / number2;
			modulus = Math.abs(difference);
			
			// Results on screen 
			System.out.printf("Sum is: %d\n", sum);
			System.out.printf("Diference is: %d\n", modulus);
			System.out.printf("Product is: %d\n", product);
			System.out.printf("Quotient is: %d\n", quotient);
		}
		
	} // End method Main
} // End class Ex_01
