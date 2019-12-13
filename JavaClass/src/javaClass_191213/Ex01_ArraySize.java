package javaClass_191213;

import java.util.Scanner;

public class Ex01_ArraySize {

	public static void main(String[] args) {
		// 배열 크기 유동적으로 설정하기 
		Scanner scan = new Scanner(System.in);
		int[] num = null;
		System.out.print("지정할 배열 크기 입력 : ");
		int size = scan.nextInt();
		num = new int[size];
		System.out.println("배열 크기 : "+num.length);
		
	}

}
