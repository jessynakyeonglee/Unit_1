package com.company;

import java.util.Scanner;

public class RoundTenth {
    public static void main (String[]args){
        Scanner tenten=new Scanner(System.in);
        System.out.println("Decimal number?");
        double givennum = tenten.nextDouble();
        double multiple = givennum*10;
        int plus = (int)(multiple+0.5);
        double real = plus/10.0;
        System.out.println(givennum+" rounded to the nearest tenth is"+real);
    }
}
