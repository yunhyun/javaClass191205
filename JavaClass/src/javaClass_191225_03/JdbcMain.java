package javaClass_191225_03;

import java.sql.Connection;
import java.util.*;

public class JdbcMain {

	public static void main(String[] args) {
		/*
		 * 1. DBConnection 클래스의 makeConnection 메소드 호출하여 DB 접속 정보(con)를 가져옴 2. con 객체를
		 * 가지고 DBsql 클래스의 메소드 호출하여 원하는 쿼리문 실행
		 */
//		Connection con = null;
//		con = DBConnection.makeConnection();

		DBsql sql = new DBsql();
		/*
		 * 1번 선택하면 전체 조회, 2번 선택하면 데이터 저장
		 */
		Student stu = null;
		Scanner scan = new Scanner(System.in);
		int selectNum = 0;
		
		List<Student> stuList = new ArrayList<Student>();
		
		boolean run = true;
		
		
		while (run) {
			System.out.println("0.DB 접속 1. 전체 조회, 2. 데이터 추가, 3.데이터 추가(?사용) " + "4. 전체조회(ArrayList사용)"
					+ "6. 인천학생조회, 7.전화번호수정, 9.종료");
			selectNum = scan.nextInt();
			switch (selectNum) {
			case 0:
				sql.dbConnection();
				break;
			case 1:
				sql.selectDB();
				break;
			case 2:
				sql.insertDB();
				break;
			case 3:
				stu = new Student();
				System.out.print("학생번호");
				int studentNo = scan.nextInt();
				stu.setStudentNo(studentNo);

				System.out.print("학생이름");
				String name = scan.next();
				stu.setName(name);

				System.out.print("학생나이");
				int age = scan.nextInt();
				stu.setAge(age);

				System.out.print("학생주소");
				String address = scan.next();
				stu.setAddress(address);

				System.out.print("학생성별");
				String gender = scan.next();
				stu.setGender(gender);

				System.out.print("학생전화번호");
				String phone = scan.next();
				stu.setPhone(phone);

				sql.insertDB4(stu);

//			sql.insertDB3(studentNo, name, age, address, gender, phone);
				break;
			case 4:
				// 전체조회 메소드를 호출하여 호출 결과를 가져옴
//				stuList = new ArrayList<Student>();
				stuList = sql.selectDB2();
				break;
				
			case 6:
				System.out.print("검색할 주소를 입력하세요 : ");
				String city = scan.next();
//				sql.selectIncheon();
				sql.selectAdd(city);
				break;
			case 7:
				System.out.print("수정할 학생 번호를 입력하세요 : ");
				int stuNo = scan.nextInt();
				System.out.print("수정할 전화 번호를 입력하세요 : ");
				String changePhone = scan.next();
				sql.changeInformation(stuNo, changePhone);
				break;
			case 9:
				run=false;
				break;
			}
		}

		// DB에서 조회한 전체 학생목록을 while문 밖에서 출력
		for(int i=0;i<stuList.size();i++) {
			System.out.println(stuList.get(i).toString());
		}
	}

}
