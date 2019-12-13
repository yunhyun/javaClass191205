package javaClass_191213;

import java.util.Scanner;

public class Ex06_CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		do {
		int[] coin = {500, 100, 50, 10};
		System.out.print("금액 입력 :");
		int change = scan.nextInt();
		for(int i=0; i<coin.length;i++) {
			// 동전의 갯수 출력
			int coinCount = change/coin[i];
			System.out.println(coin[i]+"원 동전:"
					+ coinCount + "개");
			// 나머지 값을 사용하기 위한 식 
			change = change%coin[i];
		}
		}while(true);
	}

}
