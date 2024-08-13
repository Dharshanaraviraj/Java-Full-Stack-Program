package com.dharshana;

//Single Inheritance in Java 
class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two Wheeler");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Vespa");
    }
}

public class SingleInheritance {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();

	}

}
