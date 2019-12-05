package javaClass_191204;

public class Ex01_AssignmentOperator {

	public static void main(String[] args) {
		// 대입연산자 
		// +=, -=, *=, /=, %=
		// 정수형 변수 2개 선언해서 대입연산자를 이용하여 연산을 수행하고 
		// 연산결과를 출력하시오. 
		// a += b => a = a + b
		int num1, num2, result;
		num1 = 5;
		num2 = 3;
		result = num1+=num2;
		System.out.println(result);
		num1 += num2;
		
	}

}
