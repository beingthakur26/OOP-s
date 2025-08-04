package com.manas;

class Calculator{
	Calculator(int a , int b){
		int sum = a+b;
		System.out.println("Addition : "+ sum);
	}
	
	Calculator (int a , int b , boolean multiply) {
		int multiplication = a*b;
		System.out.println("Multiplication : "+ multiplication);
	}
	
	public Calculator(double a , double b) {
		double substraction = a-b;
		System.out.println("Substracton : "+ substraction);
	}
}

public class MainCalculator {
	public static void main(String[] args) {
		new Calculator(23, 2);  // addition
//      Calculator obj = new Calculator(2,4);
		Calculator obj1 = new Calculator(3,4,true); // multiplication
		Calculator obj2 = new Calculator(4.0,5.0); // Subs
	}
}
