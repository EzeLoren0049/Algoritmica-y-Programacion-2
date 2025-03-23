package Ejercicios;

import java.util.Scanner; // Program uses class scanner 

public class Ex_03 
{
	// Main method begins execution of java application
	public static void main(String[] args) 
	{
		try (Scanner input = new Scanner( System.in)) { //"Creates a Scanner object to read input from the keyboard. 
			// Variable declaration
			int number1;
			int number2;
			
			System.out.print("Enter first number: ");// prompt
			number1 = input.nextInt();// read first number 
			
			System.out.print("Enter second number: ");// prompt
			number2 = input.nextInt();// read second number 
			
			// Comparation number1 == number2.
			if (number1 == number2) {
				System.out.println("Both numbers are equal.");// Results on screen
			}
			
			// Comparation number1 <> number2
			if (number1 < number2) {
				System.out.println("Number 2 is bigger.");// Results on screen
			} else {
				System.out.println("Number 1 is bigger.");// Results on screen
			}
		}
	}

}
