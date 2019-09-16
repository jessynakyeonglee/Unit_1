package com.company;

public class TotalWithTax {
    public static void main (String[]args){

        final double TAXRATE = 0.0825;
        double price = 52.75;
        double salestax = price*TAXRATE;
        double total = price+salestax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+salestax);
        System.out.print("Total: $"+total);


    }
}