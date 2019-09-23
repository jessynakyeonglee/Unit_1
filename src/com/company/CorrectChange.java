package com.company;
/*Jessy Lee
9/23/19
To find correct change for number of cents
 */
import java.util.Scanner;

public class CorrectChange {
    public static void main (String[]args){
        Scanner cc=new Scanner(System.in);
        System.out.println ("Please enter a whole number of cents");
        int numofwholecents = cc.nextInt();
        int numofdollars = numofwholecents/100;
        int remainder1 = numofwholecents%100;
        int numofquarters = remainder1/25;
        int remainder2 = remainder1%25;
        int numofdimes = remainder2/10;
        int remainder3 = remainder2%10;
        int numofnickels = remainder3/5;
        int remainder4 = remainder3%5;
        int numofpennies = remainder4;
        System.out.println("You have "+numofdollars+" dollars, "+numofquarters+" quarters, "+numofdimes+" dimes, "+numofnickels+" nickels, and "+numofpennies+" pennies.");

    }

}
