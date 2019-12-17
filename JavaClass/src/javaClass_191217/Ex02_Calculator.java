package javaClass_191217;

public class Ex02_Calculator {
	
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = add(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		System.out.println("실행결과:" + result);
	}

}
