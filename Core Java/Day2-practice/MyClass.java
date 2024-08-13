package com.dharshana;

class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//Constructor
	
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	
   //Method
   void display() {
	   System.out.println("Employee Id : " + employeeId);
	   System.out.println("Employee Name : " + employeeName);
	   System.out.println("Employee Salary : " + employeeSalary);
   }

}
public class MyClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee(102,"dhachu",2000);
		emp1.display();
		
		Employee emp2 = new Employee(102,"ravi",2000);
		emp2.display();
	}

}
