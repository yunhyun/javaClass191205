package javaClass_200102_bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//	public static Connection con;
	// DB 접속을 위한 static 메소드 
	public static Connection makeConnection() {
		// connection 변수 
		Connection con = null;
		// 접속할 DB의 계정 정보 
		String user = "JDBCJAVA";
		String password = "1234";
		// 접속할 DB의 주소 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			// 오라클 DB의 드라이버 클래스를 프로그램에 적용 
			// 정상적 적용을 위해선 ojdbc6 파일을 jre폴더-lib-ext 폴더에 넣어야 함 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager 클래스의 getConnection 메소드 호출하여 
			// DB 접속. 접속을 위해 계정, 비번, 주소값을 매개변수로 넘김 
			con = DriverManager.getConnection(url, user, password);
			// main 메소드에서 makeConnection 메소드를 호출했을 때 DB 접속이 
			// 성공하면 아래 메시지가 출력됨 
			System.out.println("DB 연결 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버 로딩 실패 "+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패 "+e.toString());
			e.printStackTrace();
		}
		
		
		// 접속이 완료되면 접속된 상태를 리턴해줌 
		return con;
		
	}
}
