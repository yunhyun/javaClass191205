package javaClass_200102_bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBsql {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		public void dbConnection() {
			con = DBConnection.makeConnection();
		}
		
		public int clientNumber() {
			String sql = "SELECT COUNT(*) FROM BANK";
			int clientNumber=0;
			try {
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					clientNumber = rs.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return clientNumber;
		}
		
		// 고객 등록 메소드 
		public int insertClient(Client client) {
			String sql = "INSERT INTO BANK VALUES(?,?,?,?)";
			int insertResult=0;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, client.getClientNumber());
				pstmt.setString(2, client.getName());
				pstmt.setString(3, client.getAccountNumber());
				pstmt.setInt(4, client.getBalance());
				insertResult = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return insertResult;
		}
		
		// 전체 고객 조회 메소드 
		public void selectDB() {
		
		// 실행할 쿼리문을 미리 변수로 지정 
		String sql = "SELECT * FROM BANK";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

		public int deposit(String accountNumber, int balance) {
			String sql = "UPDATE BANK SET BALANCE = BALANCE+? WHERE ACCOUNTNUMBER=?";
			int depositResult = 0;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, accountNumber);
				depositResult = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return depositResult;
		}

		public int withdraw(String accountNumber, int balance) {
			String sql = "UPDATE BANK SET BALANCE = BALANCE-? WHERE ACCOUNTNUMBER=?";
			int withdrawResult = 0;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, accountNumber);
				withdrawResult = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return withdrawResult;
		}

		public int balanceCheck(String accountNumber) {
			String sql = "SELECT BALANCE FROM BANK WHERE ACCOUNTNUMBER=?";
			int balance = 0;
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, accountNumber);
				rs = pstmt.executeQuery();
				if(rs.next())
					balance = rs.getInt("BALANCE");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
			return balance;
		}

		public int transfer(String sendAccount, String receiveAccount, int balance) {
			String sendSql = "UPDATE BANK SET BALANCE = BALANCE-? WHERE ACCOUNTNUMBER=?";
			String receiveSql = "UPDATE BANK SET BALANCE = BALANCE+? WHERE ACCOUNTNUMBER=?";
			int transferResult = 0;
			try {
				pstmt = con.prepareStatement(sendSql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, sendAccount);
				pstmt.executeUpdate();
				pstmt = con.prepareStatement(receiveSql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, receiveAccount);
				transferResult = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return transferResult;
		}
}	

