package javaClass_191206;

import java.util.Scanner;

public class Ex09_DoWhileEcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		boolean run = true;
		do {
			System.out.print(">");
			inputString = scan.next();
			System.out.println(inputString);
			if(inputString.equals("종료"))
				run=false;
//		} while( ! inputString.equals("종료") );
		} while(run);
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
