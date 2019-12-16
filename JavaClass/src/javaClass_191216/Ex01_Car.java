package javaClass_191216;

public class Ex01_Car {
	/* 클래스의 3요소
	 *  1. 필드(field)
	 *   => 데이터를 저장하는 공간 
	 *   => 변수랑 비슷한 개념 
	 *  2. 생성자(constructor)
	 *   => 객체를 만들때 따라야 하는 규칙을 정의
	 *   => 객체 생성을 도와주는 블록 
	 *   => 객체 생성시 필요한 매개변수를 규정함. 
	 *   => 매개변수가 있을수도 없을수도 있다. 
	 *   => 매개변수가 없으면 : 기본생성자 
	 *   => 생성자의 이름은 클래스 이름과 동일함. 
	 *  3. 메소드(method) 
	 *   => 특정 기능을 정의한 블록 
	 *   => 매개변수 있을수도 없을수도 있다. 
	 *   => 메소드가 호출되면 자신이 가지고 있는 기능을 수행함. 
	 *   => 기능 수행이 끝나면 리턴값이 존재한다.  
	 */
	
	// 필드 선언 
	// 자동차색(color), 최고속도(speed), 연료타입(type), 모델명(model)
	String color;
	int speed;
	String type;
	String model;
	String company = "벤츠";
	
	// 기본생성자 선언
	Ex01_Car() {
		// 필드값 세팅
		// 매개변수로 넘겨받은 값을 필드값으로 세팅
		type = "하이브리드";
	}
	// Overriding
	// Overloading
	
	// 매개변수가 있는 생성자 선언
	// 매개변수 : color, speed
	Ex01_Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	Ex01_Car(String color, String company){
		this.color = color;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Ex01_Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company="
				+ company + "]";
	}
	
	Ex01_Car(String color, int speed, String type, String model, String company){
		this.color = color;
		this.speed = speed;
		this.type = type;
		this.model = model;
		this.company = company;
	}
	
	
	
	
	
	
	
	
	
//	Ex01_Car(String cl, int sp){
//		color = cl;
//		speed = sp;
//	}
	
	
	
	
	
}













