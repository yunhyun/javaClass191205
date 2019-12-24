package javaClass_191224_02;

public class Employee {
	
	private String name;
	private int salary;
	
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	double raiseSalary() {
		return salary * 1.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
