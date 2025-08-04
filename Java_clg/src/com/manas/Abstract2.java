package com.manas;

abstract class car{
	abstract void musicPlayer();
}

class JBL extends car{
	public void musicPlayer() {
		System.out.println("Bass 50");
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		JBL b = new JBL();
		b.musicPlayer();
	}
}
