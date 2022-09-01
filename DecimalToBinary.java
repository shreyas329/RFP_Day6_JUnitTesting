package com.bridgelabz.junit_testing;

public class DecimalToBinary {
	 public static void toBinary(int decimal)
	    {
	        System.out.println("Binary Representation of " + decimal + " is:");
	        int[] binaryArray = new int[1000];
	        int index = 0;
	        while (decimal > 0) {
	            binaryArray[index] = decimal % 2;
	            decimal = decimal / 2;
	            index++;
	        }
	        for (int arrayIndex = index - 1; arrayIndex >= 0; arrayIndex--) {
	            System.out.print(binaryArray[arrayIndex]);
	        }
	    }
	    public static void main(String[] args) {

	        int decimalNumber = 10;
	        toBinary(decimalNumber);
	    }

}
