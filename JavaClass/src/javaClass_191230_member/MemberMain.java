package javaClass_191230_member;

import java.sql.Connection;
import java.util.*;


public class MemberMain {

	public static void main(String[] args) {

		DBsql sql = new DBsql();
		Member member = null;
		Scanner scan = new Scanner(System.in);
		int selectNum = 0;
		
		List<Member> memberList = new ArrayList<Member>();
		
		boolean run = true;
		
		
		while (run) {
			System.out.println("0.DB 접속  1.회원가입 2.회원정보수정 3.회원탈퇴 4.관리자 9.종료");
			selectNum = scan.nextInt();
			switch (selectNum) {
			case 0:
				sql.dbConnection();
				break;
			case 1:
				member = new Member();
				System.out.print("아이디");
				String id = scan.next();
				member.setId(id);

				System.out.print("비밀번호");
				String password = scan.next();
				member.setPassword(password);

				System.out.print("이름");
				String name = scan.next();
				member.setName(name);

				System.out.print("생일(YYYYMMDD)");
				String birth = scan.next();
				member.setBirth(birth);

				System.out.print("이메일");
				String email = scan.next();
				member.setEmail(email);

				System.out.print("전화번호");
				String phone = scan.next();
				member.setPhone(phone);
				
				sql.memberJoin(member);
				break;
			case 2:
				System.out.print("아이디");
				id = scan.next();

				System.out.print("비밀번호");
				password = scan.next();
				
				boolean checkResult = sql.idCheck(id, password);
				if(checkResult) {
					System.out.print("변경할 전화번호 입력");
					phone = scan.next();
					sql.memberModify(id, phone);
				}
				else
					System.out.println("아이디 또는 비번이 틀립니다!!");
				break;
			case 3:
				break;				
				
			case 4:
				System.out.print("아이디");
				id = scan.next();

				System.out.print("비밀번호");
				password = scan.next();
				
				checkResult = sql.idCheck(id, password);
				if(checkResult) {
					sql.memberList();
				}
				else
					System.out.println("관리자가 아닙니다!!");
				break;
				
			case 6:
				
				break;
			case 7:
//				System.out.print("수정할 학생 번호를 입력하세요 : ");
//				int stuNo = scan.nextInt();
//				System.out.print("수정할 전화 번호를 입력하세요 : ");
//				String changePhone = scan.next();
//				sql.changeInformation(stuNo, changePhone);
				break;
			case 9:
				run=false;
				break;
			}
		}

		// DB에서 조회한 전체 학생목록을 while문 밖에서 출력
		for(int i=0;i<memberList.size();i++) {
			System.out.println(memberList.get(i).toString());
		}
	}

}
