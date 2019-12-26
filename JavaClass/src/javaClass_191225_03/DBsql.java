package javaClass_191225_03;

import java.sql.*;

// 쿼리문을 모아놓은 클래스 
public class DBsql {
	// DB 접속을 위한 변수 선언
	Connection con = null;
	// 쿼리문 전송을 위한 변수 선언
	PreparedStatement pstmt = null;
	// 조회(SELECT) 결과를 저장하기 위한 변수 선언
	ResultSet rs = null;

	// STUDENT 테이블 전체 조회 메소드
	public void selectDB(Connection con) {
		// 실행하고자 하는 쿼리문을 String 변수로 지정
		String sql = "SELECT * FROM STUDENT";

		try {
			// 접속한 DB에 쿼리문을 전송할 준비
			pstmt = con.prepareStatement(sql);
			// 쿼리문을 실행하고 실행결과를 rs에 저장
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("studentno"));
				System.out.print(rs.getString("name"));
				System.out.print(rs.getInt("age"));
				System.out.print(rs.getString("address"));
				System.out.print(rs.getString("gender"));
				System.out.println(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// STUDENT 테이블에 데이터 추가
	public void insertDB(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(6, '학생6', 11, '강원도 강릉시', '남성', '010-7777-7777')";

		try {
			pstmt = con.prepareStatement(sql);

			int result = pstmt.executeUpdate();

			System.out.println("insert 결과 " + result);

			System.out.println("DB에 저장 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDB2(Connection con) {
		String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 10);
			pstmt.setString(2, "학생10");
			pstmt.setInt(3, 99);
			pstmt.setString(4, "경기도 성남시");
			pstmt.setString(5, "여성");
			pstmt.setString(6, "010-6666-6666");
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}











