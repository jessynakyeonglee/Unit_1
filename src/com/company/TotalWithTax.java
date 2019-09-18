package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main (String[]args){
Scanner tempo=new Scanner(System.in);
        System.out.println("Enter the price of your item");

        final double TAXRATE = 0.0825;
        double price = tempo.nextDouble();
        double salestax = price*TAXRATE;
        double total = price+salestax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+salestax);
        System.out.print("Total: $"+total);



    }
}