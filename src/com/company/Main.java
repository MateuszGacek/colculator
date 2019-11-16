package com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long a=0, b=0;
        int c =0;

     System.out.println("Choose you first number: ");
     a = scan.nextInt();

     System.out.println("Choose you second number: ");
     b = scan.nextInt();

     System.out.println("Choose mathematical operation: ");
     System.out.println("Addition: 1 ");
     System.out.println("Subtraction: 2 ");
     System.out.println("Multiplication: 3 ");
     System.out.println("Division: 4 ");
     c = scan.nextInt();

     while (c>=5 || c<0) {
         System.out.println("You choose bad mathematical operation, choose again: ");
         System.out.println("Addition: 1 ");
         System.out.println("Subtraction: 2 ");
         System.out.println("Multiplication: 3 ");
         System.out.println("Division: 4 ");
         c = scan.nextInt();
     }
     switch (c) {
         case 1:
             System.out.println("Result: " + (a + b));
             break;
         case 2:
             System.out.println("Result: " + (a - b));
             break;
         case 3:
             System.out.println("Result: " + (a * b));
             break;
         case 4:
             System.out.println("Result: " + (a / b));
             break;
            }
    }
}




    //TODO - Calculator
    //TODO - only number
