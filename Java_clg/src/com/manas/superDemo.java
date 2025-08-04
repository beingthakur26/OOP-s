package com.manas;

class Parenttt{
	void car() {
		System.out.println("BMW");
	}
}

class Sonn extends Parenttt{
	void car() {
		super.car();
		System.out.println("Mercedes");
	}
}

public class superDemo {

	public static void main(String[] args) {
		Sonn obj = new Sonn();
		obj.car();

	}

}
