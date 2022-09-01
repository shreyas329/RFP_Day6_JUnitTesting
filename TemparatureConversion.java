package com.bridgelabz.junit_testing;

import java.util.*;

public class TemparatureConversion {
	public static void convertCelciusToFahrenheit(float temperature) {
        float temperatureInFahrenheit = (temperature*9/5)+32;
        System.out.println(temperature+" C = "+temperatureInFahrenheit+" F");
    }
    public static void convertFahrenheitToCelcius(float temperature) {
        float temperatureInCelcius = (temperature-32)*5/9;
        System.out.println(temperature+" F = "+temperatureInCelcius+" C");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float temperature;

        while(true)
        {
            System.out.println("Enter:\n1 - Celcius To Fahrenheit\n2 - Fahrenheit To Celcius\n3 - EXIT\n");
            int userchoice = sc.nextInt();
            switch (userchoice) {
                case 1:
                    System.out.println("Enter temperature in Celcius: ");
                    temperature = sc.nextFloat();
                    convertCelciusToFahrenheit(temperature);
                    break;

                case 2:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextFloat();
                    convertFahrenheitToCelcius(temperature);
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

}
