package javaClass_191204;

public class Ex09_RandomMethod {

	public static void main(String[] args) {
		// random 메소드
		// 특정 범위 내에서 숫자 하나를 출력해주는 메소드
		// 1~10 사이의 숫자 하나를 무작위로 발생
		// (int)(Math.random() * 10) + 1
		// Math.random() : 0보다 크거나 같고 1.0보다 작은 숫자
		int number = (int) Math.random() * 6 + 1;
		System.out.println(number + "가 나왔습니다.");
		if (number == 1) {
			System.out.println("1이 나왔습니다.");
		} else if (number == 2) {
			System.out.println("2가 나왔습니다.");
		} else {
			System.out.println("6이 나왔습니다.");
		}
	}

}
