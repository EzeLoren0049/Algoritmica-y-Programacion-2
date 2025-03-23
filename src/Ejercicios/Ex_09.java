package Ejercicios;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println("Ingresa 10 números:");
		
		for (int i = 0; i < 5; i++) {
            System.out.printf("Number %d",(i + 1),": ");
            int num = input.nextInt();
            
            if (num > max) {
            	max = num;
            }
            if (num < min) {
            	min = num;
            }
		}
		
		System.out.printf("Max is %d\n", max);
		System.out.printf("Min is %d", min);
		
		input.close();
		
	}
		
}
