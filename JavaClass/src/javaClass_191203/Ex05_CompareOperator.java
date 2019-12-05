package javaClass_191203;

public class Ex05_CompareOperator {

	public static void main(String[] args) {
		// 비교연산자 
		/* 
		 * 정수형 변수 2개를 선언하고 값을 저장한다음 
		 * 비교 연산 결과를 result에 대입하여 
		 * result 값을 출력하시오.  
		 */
		int num1, num2;
		num1 = 5;
		num2 = 3;
		boolean result;
		result = num1 > num2;
		System.out.println(result);
		result = num1 < num2;
		System.out.println(result);
		num1 = 3;
		result = num1 <= num2;
		System.out.println(result);
		result = num1 == num2;
		System.out.println(result);
		result = num1 != num2;
		System.out.println(result);
		
		String str1 = "자바";
		String str2 = "자바";
		// 문자열이 같은지 비교할 때 
		result = str1.equals(str2);
		System.out.println(result);
		
		num1 = 1;
		double num3 = 1.0;
		result = num1 == num3;
		System.out.println(num1 + "" + num3 + "" + result);
		
	}

}










