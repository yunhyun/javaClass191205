package javaClass_191216;

public class Ex01_CarMain {
	public static void main(String[] args) {
		// Car 클래스를 객체로 선언 
		// 객체 선언 문법 
		// 클래스이름 객체이름 = new 클래스이름();
		//						     생성자이름();
		Ex01_Car car = new Ex01_Car();
		Ex01_Car car1 = new Ex01_Car();
		Ex01_Car car2 = new Ex01_Car();
		Ex01_Car car3 = null;
		car3 = new Ex01_Car();
		// Car 클래스에 있는 필드 사용 
		int num= 0;
		num=10;
		car.color = "검정";
		System.out.println(car.color);
		System.out.println(car.speed);
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car3.color);
		
		car.company = "BMW";
		System.out.println(car.company);
		System.out.println(car1.company);
		System.out.println(car2.company);
		System.out.println(car3.company);
		
		car.speed = 100;
		int speedUp = car.speed + 50;
		System.out.println(speedUp);
		
		System.out.println(car.type);
		
		// 매개변수가 있는 생성자를 호출하여 객체 선언 
		Ex01_Car car4 = new Ex01_Car("빨강", 150);
		// car4 객체가 가지고 있는 필드값 모두 출력
		System.out.println(car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
		
		
		
		
	}
}




