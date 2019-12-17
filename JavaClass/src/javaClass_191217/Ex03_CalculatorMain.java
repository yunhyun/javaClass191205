package javaClass_191217;

public class Ex03_CalculatorMain {

	public static void main(String[] args) {
		Ex03_Calculator cal = new Ex03_Calculator();
		// 필드값 호출 
		System.out.println(cal.pi1);
		System.out.println(cal.pi);
		System.out.println(Ex03_Calculator.pi);
		
		// 메소드 호출
		System.out.println(cal.add(5, 5));
		System.out.println(cal.subtract(5, 5));
		System.out.println(Ex03_Calculator.subtract(5, 5));
		
		System.out.println(cal.EARTH_RADIUS);
		System.out.println(Ex03_Calculator.EARTH_RADIUS);
	}

}









