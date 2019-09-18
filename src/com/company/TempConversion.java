package com.company;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sunny=new Scanner(System.in);
        System.out.println("Enter the current temperature in farenheit");
        double far = sunny.nextDouble();
        double cel = (far - 32) * 5 / 9;
        System.out.println("Fahrenheit: " + far+"°F");
        System.out.print("Celsius: " + cel+"°C");
    }
}


















