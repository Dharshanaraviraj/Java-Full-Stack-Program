package com.dharshana;

//Types of Methods
public class Methods {
	void myMethod1() {
		System.out.println("Instance or Object Method");
	}
	
	static void myMethod2() {
		System.out.println("Static or Class Method");
	}
	
	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();

	}

}
