package javaClass_191216;

public class Ex02_Student {
	// 교육원에 다니는 훈련생에 대한 클래스를 만들고 
	// 메인 클래스에서 각자 같은 줄에 앉은 사람들에 대한 
	// 객체를 각각 선언해서 필드값 출력 

	// 이름, 나이, 생년월일, 주소, 성별, 출신학교
	String name;
	int age;
	String birth;
	String address;
	String gender;
	String school;
	String grade;
	
	Ex02_Student(String name, int age, String birth, String address, String gender, String school){
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.address = address;
		this.gender = gender;
		this.school = school;
	}
	
	Ex02_Student(){
		
	}
	
	
	
}
