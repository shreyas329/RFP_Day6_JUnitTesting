package com.bridgelabz.junit_testing;

import java.util.*;

import java.util.Scanner;

public class SquareRoot {
	public static double sqrt(int number)
    {
        double sqrtValue = number;
        double epsilon = 1e-15;
        while (Math.abs(sqrtValue - number / sqrtValue) > epsilon * sqrtValue) {
            sqrtValue = (number / sqrtValue + sqrtValue) / 2;
        }
        return sqrtValue;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double sqrt = sqrt(number);
        System.out.println("The Square Root of " + number + " is: " + sqrt);
    }

}
