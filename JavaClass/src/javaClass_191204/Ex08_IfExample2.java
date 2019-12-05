package javaClass_191204;

import java.util.Scanner;

public class Ex08_IfExample2 {

	public static void main(String[] args) {
		// 학점출력 예제
		// 점수가 90점 이상이면 A학점입니다. 출력
		// 90미만이면 B학점입니다. 출력
		// 스캐너 사용하여 점수를 입력
		// A : 90~100점
		// B : 80~89점
		// C : 70~79점
		// D : 60~69점
		// F : 60점 미만
		Scanner scan = new Scanner(System.in);
		int score;
		System.out.println("점수를 입력하세요 : ");
		score = scan.nextInt();
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else if (score >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
	}

}
