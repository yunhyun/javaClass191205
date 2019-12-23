package javaClass_191223;

/*
 * Phone : 부모클래스
 * CellPhone : 자식클래스 
 */
public class Ex02_CellPhone extends Ex02_Phone  {
	String button;
	String message;
	
	// 생성자
	Ex02_CellPhone(){
		
	}
	// button, model, color를 매개변수로 하는 생성자 선언 
	Ex02_CellPhone(String button, String model, String color){
		this.button = button;
		this.model = model;
		this.color = color;
	}
	
	// 메소드 
	void sendMessage(String message) {
		System.out.println("메시지 전송 : "+message);
	}
	void receiveMessage(String message) {
		System.out.println("메시지 수신 : "+message);
	}
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
	
	
	
	
	
}
