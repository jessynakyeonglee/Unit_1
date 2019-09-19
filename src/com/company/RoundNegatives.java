package com.company;

import java.util.Scanner;

public class RoundNegatives {
    public static void main (String[]args) {
        Scanner onepfive=new Scanner(System.in);
        System.out.println("Enter a negative decimal number");
        double ndn = onepfive.nextDouble();
        double roundedndn = (int)(ndn-0.5);
        System.out.print(ndn+" rounded to a whole number"+roundedndn);




    }
}
