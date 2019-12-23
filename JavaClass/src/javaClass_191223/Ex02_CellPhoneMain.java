package javaClass_191223;

public class Ex02_CellPhoneMain {

	public static void main(String[] args) {
		/*
		 * CellPhone 클래스 객체 선언해서 
		 *  - 부모클래스 필드값 출력
		 *  - 부모클래스 메소드 호출
		 *  - 자식클래스 필드값 출력
		 *  - 자식클래스 메소드 호출 
		 */
		Ex02_CellPhone cp = new Ex02_CellPhone("버튼","모토로라","검정");
		// 필드값 출력
		System.out.println(cp.button);
		System.out.println(cp.color);
		System.out.println(cp.message);
		System.out.println(cp.model);
		cp.button="버튼 10개";
		cp.color="빨강";
		cp.message = "메시지";
		cp.model ="애니콜";
		System.out.println(cp.button);
		System.out.println(cp.color);
		System.out.println(cp.message);
		System.out.println(cp.model);		
		
		// 부모 클래스 메소드 호출 
		cp.call("여보세요");
		cp.hangOn();
		cp.hangOff();
		
		// 자식 클래스 메소드 호출 
		cp.powerOn();
		cp.powerOff();
		cp.sendMessage("자니?");
		cp.receiveMessage("......");
		
		
	}

}
