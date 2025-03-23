package Ejercicios;

import java.util.Scanner;// Program uses scanner.

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//Creates a Scanner object to read input from the keyboard.
	
		//variable declaration. Type String
		String name;
		String surname;
		
		System.out.print("Enter your name:"); //prompt
		name = input.nextLine(); //Read the string "name".
		System.out.print("Enter your Surname:");//prompt
		surname = input.nextLine();//Read the string "surname".
		
		System.out.printf("Welcome, %s %s\n", name, surname);// result on screen 
		
		input.close();//Close Scanner
		
	}

}

