package javaClass_191212;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 크기가 3인 정수형 배열을 선언 
		 * 스캐너를 이용하여 값을 3개 저장 후 
		 * 입력된 값의 총합, 평균 계산 
		 */
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int sum=0;
		for(int i=0; i<num.length;i++) {
			System.out.print((i+1)+"번 째 숫자 입력 : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		System.out.println(sum);
		System.out.println(sum/num.length);
		scan.close();
		
		
		
	}

}
