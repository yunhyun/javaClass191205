package javaClass_191205;

import java.util.Scanner;

public class Ex01_MaxNumberEx {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수를 출력하시오. 
		// 응용 : 3개 받아서 큰 수 출력 
		Scanner scan = new Scanner(System.in);
		int num1, num2, max;
		System.out.print("첫번째 숫자 입력 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		num2 = scan.nextInt();

		if(num1>num2) {
			max = num1;
		} else {
			max = num2;
		}
		System.out.println("큰 수는 "+max +"입니다.");
		
	}

}







