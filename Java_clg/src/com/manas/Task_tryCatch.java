package com.manas;

import java.util.Scanner;

public class Task_tryCatch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            
            System.out.print("Enter the first number: ");
            int a = obj.nextInt();

            System.out.print("Enter the second number: ");
            int b = obj.nextInt();

            
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            
            System.out.println("Division by zero is not possible .");
        } finally {
        	  System.out.println("Program ended safely.");
              obj.close();
         }
    }
}
 
