package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[]args){
        Scanner jessy=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        System.out.println("width?");
        int length = jessy.nextInt();
        int width = jessy.nextInt();
        int area = length*width;
        System.out.print("Area = "+area);
    }
}
