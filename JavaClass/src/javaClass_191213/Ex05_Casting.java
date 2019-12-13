package javaClass_191213;

public class Ex05_Casting {

	public static void main(String[] args) {
		/*
		 * 형변환
		 * 특정 타입의 변수가 다른 타입의 변수로 변환되는 것  
		 *  1. 자동형변환(Promotion)
		 *  	크기가 작은 타입이 큰 타입으로 변환 
		 *  2. 강제형변환(Casting)
		 *  	크기가 큰 타입을 작은 타입으로 변환  
		 */
		byte byteValue = 10;
		int intValue = 10;
		double doubleValue = 1.0;
		// byte 타입(1)의 변수를 int 타입(4)의 변수에 저장 
//		intValue = byteValue;
		byteValue = (byte) intValue;
		intValue = (int) doubleValue;
		
		
		
		
	}

}
