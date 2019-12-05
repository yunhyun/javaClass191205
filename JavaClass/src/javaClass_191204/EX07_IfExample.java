package javaClass_191204;

public class EX07_IfExample {

	public static void main(String[] args) {

//		if(조건식) {
//			조건이 true일 때 실행되는 부분 
//		} else {
//			조건이 false일 때 실행되는 부분 
//		}
		boolean condition;
		condition = false;

		System.out.println("if문 시작");
		if (condition) {
			System.out.println("조건만족");
		} else {
			System.out.println("조건불만족");
		}

		System.out.println("if문 종료");

		int num1, num2;
		num1 = 5;
		num2 = 3;
		if (num1 > num2) {
			System.out.println("num1이 큽니다.");
		} else {
			System.out.println("num2가 큽니다.");
		}

	}

}
