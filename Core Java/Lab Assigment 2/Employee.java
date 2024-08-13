package Assigment;

public class Employee {
	String name;
    String jobTitle;
    double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    String getName() {
        return name;
    }
    String getJobTitle() {
        return jobTitle;
    }
    double getSalary() {
        return salary;
    }
    void setName(String name) {
        this.name = name;
    }
    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    void setSalary(double salary) {
        this.salary = salary;
    }
    double calculateYearlySalary() {
        return salary * 12;
    }
    void Raise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

	public static void main(String[] args) {
		Employee employee = new Employee("Dhanu", "Software Engineer", 5000);
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Yearly Salary: " + employee.calculateYearlySalary());
        employee.Raise(10);
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Yearly Salary: " + employee.calculateYearlySalary());

	}

}
