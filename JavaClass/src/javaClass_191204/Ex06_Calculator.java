package javaClass_191204;

import java.util.Scanner;

public class Ex06_Calculator {

	public static void main(String[] args) {
		// 간단한 계산기 만들기
		// 덧셈만 가능한 계산기를 만들어 봅시다. 
		// 두 개의 숫자만 더해서 더한 결과를 출력 
		int num1, num2, result;
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scan.nextInt();
		result = num1 + num2;
		System.out.println("덧셈 결과는 "+ result +"입니다.");
		
		
		
		
		
		
		
	}

}
