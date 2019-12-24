package javaClass_191224_02;

public class EmployeeMain {

	public static void main(String[] args) {
		Executive ex = new Executive("대표", 100000000, 5000000, 50000000);
		System.out.println(ex.getName());
		System.out.println(ex.getSalary());
		ex.raiseSalary();
		System.out.println(ex.getSalary());
	}
}
