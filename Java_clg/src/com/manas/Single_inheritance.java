package com.manas;


class Father{
	public void property() {
		System.out.println("hello");
	}
}

class Child extends Father{
	
}


public class Single_inheritance {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.property();
	}
}
