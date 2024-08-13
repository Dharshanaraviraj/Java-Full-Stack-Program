package com.dharshana;

public class ConstructorOverloading {
	
	ConstructorOverloading (String name) {
		System.out.println("Welcome "+ name);
	}
	
	ConstructorOverloading (int a,int b) {
		System.out.println("Addition : " + (a+b) );
	}
	
	ConstructorOverloading (int n) {
		int fact = 1;
		for(int i=0; i<=n;i++)
			fact = fact * i;
		System.out.println("Factorial : " + fact);
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading (5);
		ConstructorOverloading  obj2 = new ConstructorOverloading ("Dhachu");
		ConstructorOverloading  obj3 = new ConstructorOverloading (5,10);
	}

}
