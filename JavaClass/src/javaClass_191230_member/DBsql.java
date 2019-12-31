package javaClass_191230_member;

import java.sql.*;
import java.util.*;

// 쿼리문을 모아놓은 클래스 
public class DBsql {
	// DB 접속을 위한 변수 선언
	Connection con = null;
	// 쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;
	// 조회(SELECT) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;

	public void dbConnection() {
		con = DBConnection.makeConnection();
	}

//	// STUDENT 테이블 전체 조회 메소드
//	public void selectDB() {
//		// 실행하고자 하는 쿼리문을 String 변수로 지정
//		String sql = "SELECT * FROM STUDENT";
//
//		try {
//			// 접속한 DB에 쿼리문을 전송할 준비
//			pstmt = con.prepareStatement(sql);
//			// 쿼리문을 실행하고 실행결과를 rs에 저장
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.print(rs.getString("studentno")+"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getInt("age")+"\t");
//				System.out.print(rs.getString("address")+"\t");
//				System.out.print(rs.getString("gender")+"\t");
//				System.out.println(rs.getString("phone")+"\t");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	// STUDENT 테이블에 데이터 추가
//	public void insertDB() {
//		String sql = "INSERT INTO STUDENT VALUES(6, '학생6', 11, '강원도 강릉시', '남성', '010-7777-7777')";
//
//		try {
//			pstmt = con.prepareStatement(sql);
//
//			int result = pstmt.executeUpdate();
//
//			System.out.println("insert 결과 " + result);
//
//			System.out.println("DB에 저장 성공!!");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void insertDB2() {
//		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 10);
//			pstmt.setString(2, "학생10");
//			pstmt.setInt(3, 99);
//			pstmt.setString(4, "경기도 성남시");
//			pstmt.setString(5, "여성");
//			pstmt.setString(6, "010-6666-6666");
//
//			pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public void insertDB3(int studentNo, String name, int age, String address, String gender, String phone) {
//		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, studentNo);
//			pstmt.setString(2, name);
//			pstmt.setInt(3, age);
//			pstmt.setString(4, address);
//			pstmt.setString(5, gender);
//			pstmt.setString(6, phone);
//
//			pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void insertDB4(Student stu) {
//		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, stu.getStudentNo());
//			pstmt.setString(2, stu.getName());
//			pstmt.setInt(3, stu.getAge());
//			pstmt.setString(4, stu.getAddress());
//			pstmt.setString(5, stu.getGender());
//			pstmt.setString(6, stu.getPhone());
//
//			pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public List<Student> selectDB2() {
//		List<Student> stuList = new ArrayList<Student>();
//		String sql = "SELECT * FROM STUDENT";
//		Student stu = null;
////		Student stu = new Student();
//		try {
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				stu = new Student();
//				stu.setStudentNo(rs.getInt("studentno"));
//				stu.setName(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
//				stu.setAddress(rs.getString("address"));
//				stu.setGender(rs.getString("gender"));
//				stu.setPhone(rs.getString("phone"));
//				stuList.add(stu);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return stuList;
//	}
//
//	public void selectIncheon() {
//		String sql = "SELECT * FROM STUDENT WHERE ADDRESS LIKE ?";
//		List<Student> stuList = new ArrayList<Student>();
//		Student stu = null;
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "%인천%");
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				stu = new Student();
//				stu.setStudentNo(rs.getInt("studentno"));
//				stu.setName(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
//				stu.setAddress(rs.getString("address"));
//				stu.setGender(rs.getString("gender"));
//				stu.setPhone(rs.getString("phone"));
//				stuList.add(stu);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		for(int i=0;i<stuList.size();i++) {
//			System.out.println(stuList.get(i).toString());
//		}
//		
//	}
//
//	public void selectAdd(String city) {
//		String sql = "SELECT * FROM STUDENT WHERE ADDRESS LIKE ?";
//		List<Student> stuList = new ArrayList<Student>();
//		Student stu = null;
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, "%"+city+"%");
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				stu = new Student();
//				stu.setStudentNo(rs.getInt("studentno"));
//				stu.setName(rs.getString("name"));
//				stu.setAge(rs.getInt("age"));
//				stu.setAddress(rs.getString("address"));
//				stu.setGender(rs.getString("gender"));
//				stu.setPhone(rs.getString("phone"));
//				stuList.add(stu);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		for(int i=0;i<stuList.size();i++) {
//			System.out.println(stuList.get(i).toString());
//		}
//		
//	}
//
//	public void changeInformation(int stuNo, String changePhone) {
//		String sql = "UPDATE STUDENT SET PHONE=? WHERE STUDENTNO=?";
//		try {
//			pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, changePhone);
//			pstmt.setInt(2, stuNo);
//			pstmt.executeUpdate();
//			System.out.println("수정 성공");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}

	public void memberJoin(Member member) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,TO_DATE(?,'YYYY/MM/DD'),?,?,SYSDATE)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getBirth());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getPassword());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("회원가입 완료!!");
		
	}

	public boolean idCheck(String id, String password) {
		String sql = "SELECT ID FROM MEMBER WHERE ID=? AND PASSWORD=?";
		boolean checkResult = false;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next())
				checkResult = true;
			else 
				checkResult = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return checkResult;
	}

	public void memberModify(String id, String phone) {
		String sql = "UPDATE MEMBER SET PHONE=? WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("수정 성공");
	}

	public void memberList() {
		String sql = "SELECT * FROM MEMBER ORDER BY BIRTH DESC";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("ID")+"\t");
				System.out.print(rs.getString("PASSWORD")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.print(rs.getString("BIRTH")+"\t");
				System.out.print(rs.getString("EMAIL")+"\t");
				System.out.print(rs.getString("PHONE")+"\t");
				System.out.println(rs.getString("JOINDATE")+"\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}









