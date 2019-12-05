package javaClass_191205;

public class Ex02_SwitchCase {

	public static void main(String[] args) {
		// Switch Case
		int number=0;
		
		switch(number) {
		case 0:
			// number에 0이 저장된 경우
			System.out.println("변수값이 0입니다.");
			
		case 1:
			// number에 1이 저장된 경우
			System.out.println("변수값이 1입니다.");
			break;
		case 2:
			// number에 2가 저장된 경우
			System.out.println("변수값이 2입니다.");
			break;
		default:
			System.out.println("변수값이 없습니다.");
			break;
		}
		
		System.out.println("switch~case 문 종료됨 ");
		
		
//		switch(조건변수) {
//		case 변수값: 
//			해당 조건이 맞을 때 실행내용;
//			break;
//		case 변수값: 
//			해당 조건이 맞을 때 실행내용;
//			break; 		
//		~~~~~
//		default:
//			case에서 어떠한 조건도 맞지 않을 때 실행내용;
//			break;
//		}
		

	}

}
