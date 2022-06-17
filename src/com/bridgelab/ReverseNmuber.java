package com.bridgelab;

import java.util.Scanner;

public class ReverseNmuber {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0, temp = 0;

        while (number != 0) {
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number / 10;
        }
        System.out.println("Reverse" + " " + reverse);
    }
}
