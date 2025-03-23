package Ejercicios;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int zeros = 0;

        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = input.nextInt();

            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zeros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Números positivos: " + pos);
        System.out.println("Números negativos: " + neg);
        System.out.println("Ceros: " + zeros);

        input.close();
    }
}
