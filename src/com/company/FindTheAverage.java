package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[]args) {
        Scanner fta=new Scanner(System.in);
        System.out.println("Enter four values");
        System.out.println("value 1");
        System.out.println("value 2");
        System.out.println("value 3");
        System.out.println("value 4");  I need to edit this part
        double total = 0;
        double vone = fta.nextDouble();
        total += vone;
        double vtwo = fta.nextDouble();
        total += vtwo;
        double vthree = fta.nextDouble();
        total += vthree;
        double vfour = fta.nextDouble();
        total += vfour;
        total /= 4;
        System.out.println("Average ="+total);











    }

}
