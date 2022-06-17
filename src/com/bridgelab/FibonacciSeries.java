package com.bridgelab;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number ");

        int number1 = 0, number2 = 1, temp = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(0 + " " + 1 + " ");
        for (int i = 1; i < n - 1; i++) {
            temp = number1 + number2;
            System.out.print(temp + " ");
            number1 = number2;
            number2 = temp;
        }
    }
}
