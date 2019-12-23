package javaClass_191223;

public class Ex03_Student extends Ex03_People {
	int sn;
	String major;
	
//	Ex03_Student(String name, String rrn) {
//		// super : 부모클래스의 생성자 
//		super(name, rrn);
////		this.name = name;
////		this.rrn = rrn;
//		// TODO Auto-generated constructor stub
//	}
	
	Ex03_Student(String name, String rrn, int sn, String major){
//		this.name = name;
//		this.rrn = rrn;
		super(name, rrn);
		this.sn = sn;
		this.major = major;
	}
	
	
	
	
}
