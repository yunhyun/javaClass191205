package javaClass_191216;

public class Ex03_Calculator {
	// 메소드 선언 
	// 덧셈, 뺄셈, 나눗셈, 곱셈 메소드 각각 선언 
	
	void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("덧셈 결과" + result);
		//return result;
	}
	
	void sum1(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Calculator 클래스" + result);
	}

	public void subtract(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺄셈 결과" + result);
		
	}

	public void multiply(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("곱셈 결과" + result);
		
	}
	
	public int multiply1(int num1, int num2) {
		int result = num1 * num2;
//		System.out.println("곱셈 결과" + result);
		return result;
	}

	public void divide(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("나눗셈 결과" + result);
		
	}
	
	
	
}
