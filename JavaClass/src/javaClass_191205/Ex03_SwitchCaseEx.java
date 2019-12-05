package javaClass_191205;

import java.util.Scanner;

public class Ex03_SwitchCaseEx {

	public static void main(String[] args) {
		/*
		 * switch case를 이용하여 간단한 사전 만들기 
		 * 영어 단어를 입력하면 그 단어에 해당하는 한글 의미를 출력 
		 * 사전에 입력된 단어는 총 4개 
		 * desk, chair, pencil, mouse
		 * 4개 중에 없는 단어를 입력하면 사전에 없는 단어 입니다 출력 
		 */
		Scanner scan = new Scanner(System.in);
		String word = null;
		word = scan.next();
		switch(word) {
		case "desk":
			System.out.println("책상입니다.");
			break;
		case "chair":
			System.out.println("의자입니다.");
			break;
		case "monitor":
			System.out.println("모니터입니다.");
			break;
		case "mouse":
			System.out.println("마우스입니다.");
			break;
		default:
			System.out.println("사전에 없는 단어입니다.");
			break;
		}
	}

}
















