package com.dharshana;

class A{
	int a=10;
	A(String name){
		System.out.println("Welcome " + name);
	}
	void myMethod1(){
		System.out.println("I am a super class method") ;
	}
}

class B extends A{
	B() {
		super("Dhachu");
	}
	void myMethod2() {
		System.out.println("Super class variable : " + super.a);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		B b = new B();
		b.myMethod2();
		b.myMethod1();

	}

}
