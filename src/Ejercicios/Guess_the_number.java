package Ejercicios;

import java.util.Scanner; // Program uses Class Scanner
import java.util.Random; // Program uses Class Random

public class Guess_the_number {
	
	// Main method begins execution of java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);// Scanner object to read console input
		Random random = new Random();// Random object to generate random numbers
		Boolean playAgain = true; // Variable to control if the game repeats
		
		// Loop to keep the game active
		while(playAgain) {
			int randomNumber = random.nextInt(1000) + 1; // Random number between 1 and 1000
			int count = 0; // Counter for attempts 
			int num; // Number entered by the player
			
			// Welcome message
			System.out.print("Welcome to Guess the number\n");
			System.out.print("chosse a number into 1 and 1000 and continue ;)\n");
			
			//loop to compare the numbers
			do {
				System.out.print("Enter your number: ");
				num = input.nextInt();
				count++;
				
				// to high, to low, and correct guess conditions 
				if (num > randomNumber) {
					System.out.print("Too high\n");
				} else if (num < randomNumber) {
					System.out.print("Too low\n");
				}else {
					System.out.print("¡¡You Won!!\n");
					System.out.printf("You Guessed it in %d attempts\n", count);
				}

			} while (num != randomNumber); // Condition for loop
			
			// Menu to continue
			System.out.print("Doy you want to play again?\n 1: Yes.\n 2: No.\n");
			int continu = input.nextInt();
			
            if(continu == 1) {
            	playAgain = true; // Repeat the game
            } else if (continu == 2) {
            	playAgain = false; // End the game 
                System.out.println("¡Thank you for playing! See you next time.");
            } else {
            	System.out.print("Invalid option. Exiting the game"); // Invalid input so the game ends.
            	playAgain = false;
            }

		}
		
		input.close();// Closes the Scanner object

	}

}
