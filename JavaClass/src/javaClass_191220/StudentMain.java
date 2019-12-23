package javaClass_191220;

import java.util.*;

import javaClass_191219.Bank;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		Student student = null;
		// 다루는 객체가 한개일 때 
//		Student student = new Student();
		List<Student> studentList = new ArrayList<Student>();

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생등록 | 2.과목별 점수입력 | 3.점수리스트 | 4.과목별 최고점수 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 정보를 입력하세요 ");
				int studentNumber = studentList.size() + 1;
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("생년월일 : ");
				String birth = scan.next();
				System.out.print("주소 : ");
				String address = scan.next();
				System.out.print("전화번호 : ");
				String phoneNumber = scan.next();
				System.out.print("학과 : 1.컴퓨터 2.전자 3.정보통신 4.경영");
				int major = scan.nextInt();
				// Student 객체를 생성하여 ArrayList에 저장 
				student = new Student(studentNumber, name, birth, address, phoneNumber);
				if(major==1) {
					// major 필드에 컴퓨터공학 저장
					student.setMajor(Major.컴퓨터공학);
				} else if(major==2) {
					// major 필드에 전자공학 저장
					student.setMajor(Major.전자공학);
				}
				
				
				studentList.add(student);
				break;
			case 2:
				System.out.println("과목별 성적을 입력하세요 ");
				System.out.print("학생이름을 입력하세요 ");
				name = scan.next();
				for(int i=0; i<studentList.size();i++) {
					if(studentList.get(i).getName().equals(name)) {
						System.out.print("java 점수 : ");
						int javaScore = scan.nextInt();
						System.out.print("servlet 점수 : ");
						int servletScore = scan.nextInt();
						System.out.print("spring 점수 : ");
						int springScore = scan.nextInt();
						studentList.get(i).setJavaScore(javaScore);
						studentList.get(i).setServletScore(servletScore);
						studentList.get(i).setSpringScore(springScore);
					}
				}
				break;
			case 3:
				for(int i=0;i<studentList.size();i++) {
					System.out.println(studentList.get(i).toString());
				}
				break;
			case 4:
				System.out.println("과목을 선택하세요 ");
				System.out.println("1.java | 2.servlet | 3.spring");
				int subjectSelect = scan.nextInt();
				// 최고점수를 가지고 있는 인덱스 값을 저장하기 위한 변수 
				int max = 0;
				if(subjectSelect==1) {
					for(int i=0; i<studentList.size();i++) {
						if(studentList.get(max).getJavaScore()<studentList.get(i).getJavaScore()) {
							max = i;
						}
					}
					System.out.println("Java 최고점수는 "+studentList.get(max).getName()+
							"의 "+studentList.get(max).getJavaScore()+"입니다.");
				} else if(subjectSelect==2) {
					student.servletMax(studentList);
				} else if(subjectSelect == 3) {
					student.springMax(studentList);
				}
				break;
			case 5:
				

			}

		}

	}
}









