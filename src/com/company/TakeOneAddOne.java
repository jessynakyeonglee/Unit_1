package com.company;

import javax.swing.plaf.basic.BasicMenuUI;
import java.nio.channels.GatheringByteChannel;
import java.util.Scanner;

public class TakeOneAddOne {
    public static void main (String[]args){
        Scanner toao=new Scanner(System.in);
        System.out.print("Enter a number :");
        int urnum = toao.nextInt();
        int sss=urnum;
        int adding = sss++;
        int fff=urnum;
        int another = fff--;
        System.out.print(fff--+" "+urnum+" "+sss++);
    }
}
