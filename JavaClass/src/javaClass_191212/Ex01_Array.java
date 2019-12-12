package javaClass_191212;

import java.util.Scanner;

public class Ex01_Array {

	public static void main(String[] args) {
		// 크기가 5인 double 타입의 배열 변수 선언
		// 각각 값을 저장해보고 for문을 이용하여 저장된 값 출력
		double[] num1 = null;
		num1 = new double[5];

		num1[0] = 1.111;
		num1[1] = 2.222;
		num1[2] = 3.333;
		num1[3] = 4.444;
		num1[4] = 5.555;
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}

		// 배열 new 연산자 이용하기
		Scanner scan = new Scanner(System.in);
		int number = 1;
		int[] num = null;
		//num[0] = 1;
		if (number == 1) {
			num = new int[3];
			System.out.println(num.length);
			System.out.println(num[0]);
		} else {
			System.out.println(num.length);
			System.out.println(num[0]);
		}

	}

}
