package Assigment;

public class Circle {
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double getRadius(){
		return radius;		
	}
	void setRadius(double radius) {
		this.radius=radius;		
	}
	double calculateArea() {
		return Math.PI*radius*radius;
		
	}
	double calculateCircumference(){
		return 2*Math.PI*radius;		
	}

	public static void main(String[] args) {
		Circle myCircle=new Circle(5.0);
	    System.out.println("Original Calculation");
		System.out.println("Area of circle: "+myCircle.calculateArea());
		System.out.println("Circumference of a circle of circle: "+myCircle.calculateCircumference());
		myCircle.setRadius(7.5);
		System.out.println("Updated Calculation");
		System.out.println("Area of circle: "+myCircle.calculateArea());
		System.out.println("Circumference of a circle of circle: "+myCircle.calculateCircumference());

	}

}
