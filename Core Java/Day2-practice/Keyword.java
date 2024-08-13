package com.dharshana;

//this keyword refers current class object
public class Keyword {
	String name;
	
	Keyword(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	
	Keyword(int a,int b){
		System.out.println("Sum : " + (a+b));
	}
	
	void greeting() {
		System.out.println("Welcome " + name);
	}
	
	public static void main(String[] args) {
		Keyword obj = new Keyword("Dhachu");
	}
	
}
