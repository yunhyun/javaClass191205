package javaClass_191223;

public class Ex05_Computer extends Ex05_Calculator {
	// 리턴타입이 int인 calculation 메소드 정의 
	// 매개변수는 정수 2개, 정수2개의 평균값을 리턴
	// Override : 메소드재정의 
	// Annotation(어노테이션, 애노테이션)
	@Override
	int calculation(int num1, int num2) {
		// 부모 클래스의 메소드 호출(재정의 되지 않은)
		System.out.println(super.calculation(num1, num2));
		
		System.out.println("Computer의 메소드 호출 ");
		return (num1+num2)/2;
	}
	
	
}
