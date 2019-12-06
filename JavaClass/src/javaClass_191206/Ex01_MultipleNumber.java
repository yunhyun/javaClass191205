package javaClass_191206;

public class Ex01_MultipleNumber {

	public static void main(String[] args) {
		// 1부터 100까지 숫자중에서 3의 배수 출력하기
		// 3의 배수 조건 : 3으로 나눴을 때 나머지가 0인 숫자
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
