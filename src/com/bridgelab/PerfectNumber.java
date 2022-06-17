package com.bridgelab;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n / 2];

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                arr[number] = i;
                number++;
            }
        }
        int i = 0, sum = 0;
        while (i <= number) {
            sum += arr[i];
            i++;
        }
        if (sum == n)
            System.out.println(n + " This is a perfect number");
        else
            System.out.println(n + " is not a perfect number");

    }
}
