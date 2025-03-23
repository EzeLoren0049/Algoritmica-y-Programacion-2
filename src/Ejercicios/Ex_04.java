package Ejercicios;
import java.util.Scanner; //Program uses class Scanner.

public class Ex_04 {
	
	// Main method begins execution of java application.
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in);//"Creates a Scanner object to read input from the keyboard. 
			
		// Variable declaration
		int number;
		int mod;
			
		System.out.print("Enter one number: ");// prompt
		number = input.nextInt(); // read number.
			
		// Operations 
		mod = number % 2;
			
		// Comparison mod number with 0.
		if (mod != 0) {
			System.out.print("Number is odd."); // Result of screen
		} else {
			System.out.print("Number is even."); // Result of screen
		}
		
		input.close();//Close Scanner
	}

}
