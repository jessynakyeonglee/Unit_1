package com.company;

public class Painting {

    public static void main(String[]args) {
        int width = 40;
        int length = 32;
        int height = 16;
        int wall1 = width*height;
        int wall2 = length*height;
        int wall1s = wall1*2;
        int wall2s = wall2*2;
        int ceiling = width*length;
        int total = wall1s+wall2s+ceiling;
        int doors = 20*2;
        int windows = 15*4;
        int doorsandwindows = doors+windows;
        int finale = total-doorsandwindows;
        double finalefr = finale/350;
        System.out.println ("You will need "+finalefr+" gallons of paint");

}
}