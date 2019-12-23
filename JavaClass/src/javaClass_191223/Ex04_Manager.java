package javaClass_191223;

public class Ex04_Manager extends Ex04_Employee {
	int bonus;

	public Ex04_Manager(String name, String address, int salary, int bonus) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Ex04_Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	

}
