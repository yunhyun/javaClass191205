package javaClass_191210;

import java.util.Scanner;

public class Ex03_23Times {

	public static void main(String[] args) {
		/*
		 * 정수 하나를 입력 받아 1부터 입력받은 정수중에서 2, 3의 배수를 제외한 수의 총 합을 구하시오.
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			// 2의배수, 3의배수 걸러내고 합 구하기
			if (i % 2 != 0 && i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("합계 :" + sum);

	}

}
