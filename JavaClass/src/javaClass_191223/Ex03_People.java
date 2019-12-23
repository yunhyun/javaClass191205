package javaClass_191223;

public class Ex03_People {
	/*
	 * 부모클래스 : People
	 * 자식클래스 : Student
	 * People 클래스 
	 *  - 이름, 주민번호(Resident Registration Number) 필드
	 *  - 이름, 주민번호를 매개변수로 하는 생성자 
	 * Student 클래스 
	 * 	- People 상속 
	 * 	- 학번, 학과 필드 
	 *  - 이름, 주민번호, 학번, 학과를 매개변수로 하는 생성자 
	 * StudentMain 클래스 
	 * 	- Student 클래스 객체 생성하여 필드값 출력  
	 */
	
	String name;
	String rrn;
	
	Ex03_People(String name, String rrn){
		this.name = name;
		this.rrn = rrn;
	}
	
	
}
