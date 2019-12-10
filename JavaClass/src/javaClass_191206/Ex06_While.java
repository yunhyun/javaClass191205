package javaClass_191206;

public class Ex06_While {

	public static void main(String[] args) {
		// while 문
//		while(반복조건) {
//			반복실행내용 
//		}
		// while문을 이용하여 1~10까지 출력하기 
		// 반복 실행을 위한 반복변수 선언
		int i=1;
		boolean run = true;
		while(run) {
			System.out.println(i);
			i++;
			if(i==100)
				run = false;
		}
		System.out.println("while문 종료");
		System.out.println(i);

	}

}
