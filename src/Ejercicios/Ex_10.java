package Ejercicios;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a;
		
		System.out.print("Number 1: ");
		a = input.nextInt();
		
		for (int i = 1; i < a; i++) {
            System.out.printf("Number %d: ", (i+1));
            int num = input.nextInt();
            
            if (num > max) {
            	max = num;
            }
            if (num < min) {
            	min = num;
            }
            if (a > max) {
            	max = a;
            }
            if (a < min) {
            	min = a;
            }
		}
		
		System.out.printf("Max is %d\n", max);
		System.out.printf("Min is %d", min);
		
		input.close();

	}

}
