package com.dharshana;

public class ThisOverloading {
	ThisOverloading (String name) {
		System.out.println("Welcome "+ name);
	}
	
	ThisOverloading (int a,int b) {
		this("Dhachu");
		System.out.println("Addition : " + (a+b) );
	}
	
	ThisOverloading (int n) {
		this(10,20);
		int fact = 1;
		for(int i=0; i<=n;i++)
			fact = fact * i;
		System.out.println("Factorial : " + fact);
	}

	public static void main(String[] args) {
		ThisOverloading obj1 = new ThisOverloading(5);
	}

}
