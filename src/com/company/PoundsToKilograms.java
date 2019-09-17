package com.company;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[]args){
        Scanner snapple=new Scanner(System.in);
        System.out.println("Enter the number of pounds");

        double lbs = snapple.nextInt();
        double kg = lbs/2.205;
        System.out.print(lbs+" pounds =");
        System.out.print(kg+"kilograms");
    }
}
