package javaClass_191224_02;

public class Executive extends Manager {
	private int bonus;

	Executive(String name, int salary, int allowance, int bonus) {
		super(name, salary, allowance);
		this.bonus = bonus;
	}

	@Override
	double raiseSalary() {
		setSalary((int) (getSalary() * 1.3));
		return getSalary();
	}
}
