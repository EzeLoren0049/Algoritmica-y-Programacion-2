package Ejercicios;

public class Ex_07 {
	
	// Main method begins execution of java application
	public static void main(String[] args) {
		
		// variable declaration 
		int i = 0;
		int i2 = 0;
		int square;
		int cube;
		
		//Limits declaration of condition "while"
		int limit = 10;
		int limit2 = limit / 2;
		
		System.out.println("squares:");//title on screen 
		//First part of squares
		while (i<=limit2) {
			square = i*i; //calculation of squares
			System.out.printf("%d|", square);// results on screen
			i++;// increment i
		}
		
		System.out.print("\n");// blank line
		
		//Second part of cubes
		while (i<=limit) {
			square = i*i;//calculation of squares
			System.out.printf("%d|", square);// results on screen
			i++;// increment i
		}
		
		System.out.print("\n");// blank line

		System.out.println("cubes:");//title on screen 
		//First part of cubes
		while (i2<=limit2) {
			cube = i2*i2*i2;//calculation of cubes
			System.out.printf("%d|", cube);// results on screen
			i2++;// increment i2
		}
		
		System.out.print("\n");// blank line
		
		//Second part of cubes
		while (i2<=limit) {
			cube = i2*i2*i2;//calculation of cubes
			System.out.printf("%d|", cube);// results on screen
			i2++;// increment i2
		}
	}

}
