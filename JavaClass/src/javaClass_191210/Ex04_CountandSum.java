package javaClass_191210;

import java.util.Scanner;

public class Ex04_CountandSum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// 숫자 입력을 위한 변수 
		int num=0;
		// 합계 계산을 위한 변수 
		int sum=0;
		// 숫자 갯수를 세기 위한 변수 
		int count=0;
		// while문 제어를 위한 변수 
		boolean run = true;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요 :");
		while(run) {
			sum = sum + num;
			num = scan.nextInt();
			if(num==0) {
				run=false;
			} else {
				count++;
			}
		}
		System.out.println("입력한 수는 "+count+"개");
		System.out.println("평균은 "+(sum/count)+"입니다.");
	}
}
