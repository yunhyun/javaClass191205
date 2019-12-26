package javaClass_191225_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// static 메소드 
	public static Connection makeConnection() {
		// DB 접속정보 저장을 위한 Connection 변수 선언
		Connection con = null;
		// 접속할 DB의 계정정보 
		String user = "JYH191226";
		String password = "1234";
		// 접속할 DB의 주소 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			// ojdbc6 파일을 현재 소스에 적용 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println("DB 접속 성공 ");
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
		
		// DB 접속이 정상적으로 되면 접속상태를 리턴해줌 
		return con;
	}
}
