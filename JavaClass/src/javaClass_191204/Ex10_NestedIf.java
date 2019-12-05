package javaClass_191204;

import java.util.Scanner;

public class Ex10_NestedIf {

	public static void main(String[] args) {
		/*
		 * 중첩 if문 성적 출력 프로그램 1. 100점을 초과하는 점수 입력은 입력범위를 초과하였습니다. 출력 2. 학점 처리 95~100 :
		 * 당신의 학점은 A+ 입니다. 90~94 : 당신의 학점은 A 입니다. 85~89 : 당신의 학점은 B+ 입니다. 80~84 : 당신의
		 * 학점은 B 입니다. ~~~~~ 65~69 : 당신의 학점은 D+ 입니다. 60~64 : 당신의 학점은 D 입니다. 60 미만 : 당신의
		 * 학점은 F입니다.
		 * 
		 * 3. print 출력문은 한번만 쓸 것!
		 */
		Scanner scan = new Scanner(System.in);
		int score;
		score = scan.nextInt();
		String grade = "";

		if (score <= 100) {
			if (score >= 90) {
				if (score >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (score >= 80) {
				if (score >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			}

//			if(score>=95) {
//				System.out.println("A+ 학점입니다.");
//				grade = "A+";
//			} else if(score>=90) {
//				System.out.println("A 학점입니다.");
//				grade = "A";
//			}
		} else {
			System.out.println("입력범위 초과!!");
		}
		System.out.println("당신의 학점은" + grade + "입니다.");

	}

}
