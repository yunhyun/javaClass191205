package javaClass_191210;

import java.util.Scanner;

public class Ex02_EvenOdd {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 홀수 인지 짝수인지를 출력하고 0을 입력하면 프로그램이 종료되도록 하세요.
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		boolean end = true;
		do {
			System.out.print("숫자입력 : ");
			num = scan.nextInt();

			if (num % 2 == 0 && num > 0)
				System.out.println("짝수");
			else if (num % 2 == 1)
				System.out.println("홀수");
			else
				end = false;
		} while (end);
		System.out.println("종료");

	}

}
