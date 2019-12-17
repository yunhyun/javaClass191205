package javaClass_191216;

import java.util.Scanner;

public class Ex03_CalculatorMain {

	public static void main(String[] args) {
		// Calculator 클래스의 객체 생성 
		Ex03_Calculator cal = new Ex03_Calculator();
//		int sumResult = cal.sum(5, 5);
//		int sumResult = 10;
//		System.out.println(sumResult);
//		System.out.println(cal.sum(5, 5));
		
		cal.sum1(5, 5, 5);
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				int num1=5;
				int num2=5;
				System.out.println(num1+num2);
				cal.sum(5, 5);
				break;
			case 2:
				System.out.print("숫자입력");
				num1 = scan.nextInt();
				System.out.print("숫자입력");
				num2 = scan.nextInt();
				cal.subtract(num1,num2);
				break;
			case 3:
				System.out.print("숫자입력");
				num1 = scan.nextInt();
				System.out.print("숫자입력");
				num2 = scan.nextInt();
				cal.multiply(num1,num2);
				int result = cal.multiply1(num1, num2);
				System.out.println("곱셈결과(main) : "+result);
				break;
			case 4:
				cal.divide(5,5);
				break;
			}
		}
		
		
		
		
		
	}

}
