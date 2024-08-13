package Assigment;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
	
	public static void main(String[] args) {
		Person obj1 = new Person("Raj",20);
		Person obj2 = new Person("Ravi",40);
		
		obj1.display();
		obj2.display();

	}

}
