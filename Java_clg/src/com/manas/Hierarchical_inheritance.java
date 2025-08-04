package com.manas;

class Dad{
	public void bike() {
		System.out.println("Ninja zx10r");
	}
	public void car() {
		System.out.println("Defender");
	}
}

class son_1 extends Dad{
	public void cycle() {
		System.out.println("Ride");
	}
}

class son_2 extends Dad {
	public void skateboard() {
		System.out.println("Yonex");
	}
}


public class Hierarchical_inheritance {
	public static void main(String[] args) {
		son_1 obj = new son_1();
		son_2 objj = new son_2();
		obj.bike();
		obj.car();
		obj.cycle();
		objj.skateboard();
	}
}
