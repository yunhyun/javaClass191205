package jdbcTest;

import java.sql.Connection;
import java.util.Scanner;

import jdbcTest.Client;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		// DBConnection 클래스의 getConnection 메소드 호출하여 DB 접속
		// 리턴받은 con을 가지고 DB를 활용함
		Connection con = null;

		con = DBConnection.makeConnection();

		Client client = null;
		DBsql sql = new DBsql();

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.입금 | 3.출금 | 4.잔액 | 5.송금 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				int clientNumber = sql.clientNumber(con) + 1;
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("계좌 : ");
				String accountNumber = scan.next();
				System.out.print("입금액 : ");
				int balance = scan.nextInt();
				client = new Client(clientNumber, name, accountNumber, balance);
				int insertResult = sql.insertClient(con, client);
				if (insertResult > 0)
					System.out.println("등록 성공");
				else
					System.out.println("등록 실패");
				break;
			case 2:
				System.out.print("계좌 : ");
				accountNumber = scan.next();
				System.out.print("입금액 : ");
				balance = scan.nextInt();
				int depositResult = sql.deposit(con, accountNumber, balance);
				if (depositResult > 0)
					System.out.println("입금 성공");
				else
					System.out.println("입금 실패");
				break;
			case 3:
				System.out.print("계좌 : ");
				accountNumber = scan.next();
				System.out.print("출금액 : ");
				balance = scan.nextInt();
				int withdrawResult = sql.withdraw(con, accountNumber, balance);
				if (withdrawResult > 0)
					System.out.println("출금 성공");
				else
					System.out.println("출금 실패");
				break;
			case 4:
				System.out.print("계좌 : ");
				accountNumber = scan.next();
				balance = sql.balanceCheck(con, accountNumber);
				System.out.println("잔액은 " + balance + "입니다.");
				break;
			case 5:
				System.out.print("보내는분계좌 : ");
				String sendAccount = scan.next();
				System.out.print("받는분계좌 : ");
				String receiveAccount = scan.next();
				System.out.print("송금액 : ");
				balance = scan.nextInt();
				int transferResult = sql.transfer(con, sendAccount, receiveAccount, balance);
				if (transferResult > 0)
					System.out.println("송금 성공");
				else
					System.out.println("송금 실패");
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("메뉴에 없는 번호 입니다.");
				break;
			}
		}

		scan.close();
	}

}
