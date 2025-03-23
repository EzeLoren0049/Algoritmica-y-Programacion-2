package Ejercicios;

import java.util.Scanner; // Program uses class scanner

public class Ex_02 
{
	// Main method begins execution of java application
	public static void main(String[] args) 
	{
		try (Scanner input = new Scanner(System.in)) {
			// Variable declaration
			double pi = 3.14159;
			double radius;
			
			double diameter;
			double circumference;
			double area;
			
			//scan radius of a circle
			System.out.print("Enter radius of a circle: ");
			radius = input.nextDouble(); 
			
			System.out.println(); // Blank lin
			
			// Operations
			diameter = 2 * radius;
			circumference = 2 * pi * radius;
			area = pi * (radius * radius);
			
			// Results on screen 
			System.out.printf("Radius is: %f\n", radius);
			System.out.printf("Diameter is: %f\n", diameter);
			System.out.printf("Circumference is: %f\n", circumference);
			System.out.printf("Area is: %f\n", area);
		}

	} // End method Main

}// End class Ex_02
