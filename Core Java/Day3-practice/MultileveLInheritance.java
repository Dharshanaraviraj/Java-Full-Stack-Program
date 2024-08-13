package com.dharshana;

//Multilevel Inheritance in Java 
class Vehicle{
	void noOfEngine() {
		System.out.println("I hava one engine");
	}
}

class TwoWheeler1 extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
		}
}

class Bike1 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}

public class MultileveLInheritance {

	public static void main(String[] args) {
		Bike1 bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
