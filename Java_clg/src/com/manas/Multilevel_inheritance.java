package com.manas;


class Animal 
{
	void eat() {
		System.out.println("Animal can eat");
		
	}
}
class cat extends Animal {
	public void Meow ()
	{
		System.out.println("Meowwwwwwwwwww");
		
	}
}

class Kitten extends cat{
	public void jump() {
		System.out.println("Jump like rabbit");
		
	}
}


public class Multilevel_inheritance {
	public static void main (String[] args) {
		Kitten k = new Kitten();
		
		k.eat();
		k.Meow();
		k.jump();
		
	}
	

}
