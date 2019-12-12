package javaClass_191212;

import java.util.Scanner;

public class Ex03_ArrayMax {

	public static void main(String[] args) {
		// 정수형 배열에 5개 입력받아서 최댓값 찾기
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max=0;
		for(int i=0;i<num.length;i++) {
			System.out.print("숫자입력 : ");
			num[i]=scan.nextInt();
			// 최댓값 찾기 
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("최댓값은 : "+max);


	}

}
