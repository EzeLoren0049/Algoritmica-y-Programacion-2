package Ejercicios;

import java.util.Scanner; // Program uses scanner.

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//"Creates a Scanner object to read input from the keyboard.  
		
		//variable declaration.
		int number1;
		int number2;
		
		System.out.print("Enter first number: ");// prompt
		number1 = input.nextInt();// read first number 
		System.out.print("Enter second number: ");// prompt
		number2 = input.nextInt();// read first number 
		
		//comparison.
		if (number1 % number2 == 0 ) {
			System.out.printf("%d is multiple of %d\n", number1, number2);// Result of screen
		} else {
			System.out.print("Numbers not are multiple.");// Result of screen
		}
		input.close(); //Close Scanner
	}

}
