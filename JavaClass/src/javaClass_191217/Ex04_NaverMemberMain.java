package javaClass_191217;

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
		
		
		
		Ex04_NaverMember[] members = new Ex04_NaverMember[10];
		members[0] = member;
		members[1] = member2;
		System.out.println(members[0].getId());
		System.out.println(members[1].getId());
		
	}

}
