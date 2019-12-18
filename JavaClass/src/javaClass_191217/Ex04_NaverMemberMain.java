package javaClass_191217;

import java.util.ArrayList;
import java.util.List;

public class Ex04_NaverMemberMain {

	public static void main(String[] args) {
		Ex04_NaverMember member = new Ex04_NaverMember("aa","aa","aa","aa","aa","aa","aa");
		Ex04_NaverMember member2 = new Ex04_NaverMember("bb","bb","bb","bb","bb","bb","bb");
		// id 필드에 저장된 값 getter 메소드 이용하여 출력하기 
		System.out.println(member.getId());
		// id 필드값을 bb로 저장 
		member.setId("bb");
		System.out.println(member.getId());
		/* NaverMember 클래스에 기본생성자를 선언하여
		 * 기본 생성자를 이용해 member1 객체를 선언한 뒤 모든 필드 값을 본인 옆사람의 
		 * 정보로 지정해보세요  
		 */
		Ex04_NaverMember member1 = new Ex04_NaverMember();
		member1.setId("cc");
		member1.setName("cc");
		member1.setPassword("cc");
		member1.setBirth("cc");
		member1.setEmail("cc");
		member1.setGender("cc");
		member1.setPhone("cc");
		System.out.println(member1.getEmail());
		
		Ex04_NaverMember member3 = null; 
		member3 = new Ex04_NaverMember();
		
		String[] arr1 = new String[3];
		
		// NaverMember 클래스 타입의 members 배열 선언 
		Ex04_NaverMember[] members = new Ex04_NaverMember[100];
		members[0] = member;
		members[1] = member1;
		members[2] = member2;
		members[3] = member3;
		// members 배열의 0번 인덱스에 저장된 id 필드값을 출력
		System.out.println(members[0].getId());
		
		// ArrayList를 선언하여 member 객체들을 저장하고 
		// 각 객체의 id 필드값을 출력해보세요. 
		
		List<Ex04_NaverMember> memberList = 
				new ArrayList<Ex04_NaverMember>();
		memberList.add(member);
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i).getId());
		}
		
		
		
		
	}

}
