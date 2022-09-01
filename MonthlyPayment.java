package com.bridgelabz.junit_testing;

import java.util.Scanner;

public class MonthlyPayment {
	public static double generateMonthlyPayment(double principal, int years, double rate)
    {
        double n = 12 * years;
        double r = rate / (12 * 100);
        double monthlyPayment = (principal * r) / (1 - Math.pow(1 + r, -n));
        return monthlyPayment;
    }
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter principal: ");
    	double principal = sc.nextDouble();
    	System.out.println("Enter year: ");
        int years = sc.nextInt(); 
        System.out.println("Enter rate: ");
        double rate = sc.nextDouble();

        double payment = generateMonthlyPayment(principal, years, rate);
        System.out.println("The monthly Payment is: "+payment);
    }

}
