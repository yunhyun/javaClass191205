package javaClass_191203;

public class Ex02_VariableExample {

	public static void main(String[] args) {
		/*
		 * 변수를 활용한 계산 
		 * 1. 정수형 변수(number)를 선언하여 값을 대입하고 
		 * 2. 그 변수에 10을 더한 결과를 또 다른 변수(result)에 대입하여
		 * 3. result 값 출력  
		 */
		int number;
		number = 10;
		int result;
		result = number + 10;
		System.out.println(result);
		
		//변수 선언은 중괄호 안에서 1번만 가능함 
		int number1, result1;
		number1 = 1;
		System.out.println(number1);
		
		// 변수값을 초기화하면서 선언
		int number2 = 100000;
		System.out.println(number2);
		
	}

}
