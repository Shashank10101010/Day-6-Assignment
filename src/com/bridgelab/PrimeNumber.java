package com.bridgelab;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print(" Please Enter a number : ");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                number++;
                if (number == 2)
                    break;
            }
        }
        if (number == 1)
            System.out.println(n + " a prime number");
        else
            System.out.println(n + " is not a prime number");
    }
}
