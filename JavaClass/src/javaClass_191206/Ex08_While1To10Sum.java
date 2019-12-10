package javaClass_191206;

public class Ex08_While1To10Sum {

	public static void main(String[] args) {
		// while문 이용하여 1부터 10까지 합 출력
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
			} else {
				System.out.println("=" + sum);
			}
			i++;
		}

	}

}
