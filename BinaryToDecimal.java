package com.bridgelabz.junit_testing;

public class BinaryToDecimal {
	public static int toDecimal(int binary)
    {
        int baseValue = 1, decimal = 0;
        int number = binary;
        int temporary = number;

        while (temporary > 0) {
            int lastDigit = temporary % 10;
            temporary = temporary / 10;
            decimal += lastDigit * baseValue;
            baseValue *= 2;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int binaryNumber = 103;
        int decimalRepresenatation = toDecimal(binaryNumber);
        System.out.println("The Decimal representation of " + binaryNumber + " is : " + decimalRepresenatation);

    }

}
