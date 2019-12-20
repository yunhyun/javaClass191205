package javaClass_191220;

import java.util.List;

public class Student {
	private int studentNumber;
	private String name;
	private String birth;
	private String address;
	private String phoneNumber;
	private int javaScore;
	private int servletScore;
	private int springScore;
	private Major major;
		
	public Student() {
		
	}

	public Student(int studentNumber, String name, String birth, String address, String phoneNumber) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getServletScore() {
		return servletScore;
	}

	public void setServletScore(int servletScore) {
		this.servletScore = servletScore;
	}

	public int getSpringScore() {
		return springScore;
	}

	public void setSpringScore(int springScore) {
		this.springScore = springScore;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", birth=" + birth + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", javaScore=" + javaScore + ", servletScore="
				+ servletScore + ", springScore=" + springScore + "]";
	}

	public void servletMax(List<Student> studentList) {
		int max=0;
		for(int i=0; i<studentList.size();i++) {
			if(max<studentList.get(i).getServletScore()) {
				max = i;
			}
		}
		System.out.println("Java 최고점수는 "+studentList.get(max).getName()+"의 "+studentList.get(max).getServletScore()+"입니다.");
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}
		
	
	
		
	
	
}
