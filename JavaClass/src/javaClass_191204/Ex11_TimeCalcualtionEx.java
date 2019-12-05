package javaClass_191204;

import java.util.Scanner;

public class Ex11_TimeCalcualtionEx {
	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		// 입력 및 계산에 필요한 변수 선언 
		int time; // 시간을 입력 받기 위한 변수 
		int hour; // 시 처리를 위한 변수 
		int minute; // 분 처리를 위한 변수 
		int second; // 초 처리를 위한 변수 
		System.out.print("초를 입력하세요 : ");
		time = scan.nextInt();
		// 시간 계산 
		hour = time/3600;
		// 분 계산 
		minute = (time%3600)/60;
		// 초 계산 
		second = (time%3600)%60;
		// 계산 결과 출력 
		System.out.println(time +"초는 "+hour+"시간 "
				+ minute +"분 "+second+"초 입니다.");
		}
	}
}
