package com.manas;

import java.util.Scanner;

public class NameInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = sc.nextLine();
		System.out.println("Enter your phone number");
		long ph = sc.nextLong();
		
		System.out.println("Your name is :" + name);
		System.out.println("Your phone number :" + ph);
		System.out.println("Thankyou");
		sc.close();
				
	}
}
