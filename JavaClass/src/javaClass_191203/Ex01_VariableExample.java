package javaClass_191203;

public class Ex01_VariableExample {

	public static void main(String[] args) {
		/*
		 * 변수 선언하고 값 대입해서 출력해보기 
		 * 1. byte 타입 변수 1개 선언해서 값 대입하고 출력
		 * 2. char 타입 변수 1개 선언해서 값 대입하고 출력
		 * 3. long 타입 변수 1개 선언해서 값 대입하고 출력  
		 * 4. double 타입 변수 1개 선언해서 값 대입하고 출력
		 * 5. float 타입 변수 1개 선언해서 값 대입하고 출력 
		 * 6. boolean 타입 변수 1개 선언해서 값 대입하고 출력 
		 */
		byte byteVariable;// -128 ~ 127
		byteVariable = 127;
		System.out.println(byteVariable);
		
		char charVar;
		charVar = 90;// 아스키코드 값으로 인식
		charVar = 'A';
		System.out.println(charVar);
		
		long longVar;
		longVar = 10000000000000L;
		System.out.println(longVar);
		
		double doubleVar;
		doubleVar = 100.01236547657657657;
		System.out.println(doubleVar);
		
		float floatVar;
		floatVar = 100.123f;
		System.out.println(floatVar);
		
		boolean boolVar;
		boolVar = false;
		System.out.println(boolVar);
		
		
	}

}
