package javaClass_191212;

import java.util.Scanner;

public class Ex06_ArraySearch {

	public static void main(String[] args) {
		int num[] = {1, 2, 5, 3, 4, 7, 6, 9, 10, 8};
		int value, index=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		value = scan.nextInt();
		for(int i=0; i<num.length; i++) {
			if(num[i]==value) {
				index = i;
			}
			
		}
		System.out.println(value+"는 "+(index+1)+"번째 있습니다.");
		
		
		
		
				
	}

}
