package javaClass_191224_02;

public class Manager extends Employee {
	private int allowance;

	Manager(String name, int salary, int allowance) {
		super(name, salary);
		this.allowance = allowance;
	}

	@Override
	double raiseSalary() {
		return getSalary() * 1.2;
	}

}
