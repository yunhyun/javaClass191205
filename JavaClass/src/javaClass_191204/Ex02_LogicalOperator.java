package javaClass_191204;

public class Ex02_LogicalOperator {

	public static void main(String[] args) {
		/* 
		 * 논리연산자 
		 * &&(AND 연산) : A && B 일 때 A, B 모두 true여야 결과가 true
		 *		A, B 중에 하나라도 false가 있다면 결과는 false  		 
		 * ||(OR 연산) : A || B 일 때 A, B 중에 하나라도 true면 결과는 true
		 * 		A, B 모두 false여야 결과가 false
		 * !(NOT 연산) : boolean 변수 앞에 사용하면 결과 반전 
		 */
		
		boolean result;
		result = true && true;
		System.out.println(result);
		result = true && false;
		System.out.println(result);
		result = (5>3) && (3>1);
		System.out.println(result);
		
		result = true || false;
		System.out.println(result);
		result = false || false;
		System.out.println(result);
		result = (5>3) || (3<1);
		System.out.println(result);
		
		result = !result;
		System.out.println(result);
		
	}

}
