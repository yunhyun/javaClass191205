package javaClass_191205;

import java.util.Scanner;

public class Ex07_ForSum {

	public static void main(String[] args) {
		/*
		 * 시작값, 끝값을 입력받아 
		 * 시작값 부터 끝값까지의 총합을 출력하는 프로그램을 작성하시오. 
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int startValue = 0, lastValue = 0;
		System.out.print("시작값을 입력하세요 : ");
		startValue = scan.nextInt();
		System.out.print("끝값을 입력하세요 : ");
		lastValue = scan.nextInt();
		
		for(int i=startValue; i<=lastValue;i++) {
			sum+=i;
			System.out.print(i);
			if(i<=lastValue-1) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
		System.out.println(startValue+"부터 "+lastValue+"까지의 합은"+
				sum+"입니다.");
	}

}
