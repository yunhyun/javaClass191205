package javaClass_191213;

import java.util.Scanner;

public class Ex07_StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean run = true;		
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			if(selectNo==1) {
				System.out.print("학생수>");
				int studentNum = scan.nextInt();
				scores = new int[studentNum];
			} else if(selectNo==2) {
				for(int i=0;i<scores.length;i++) {
					System.out.print((i+1)+"번 째 학생점수 : ");
					scores[i]=scan.nextInt();
				}
			} else if(selectNo==3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println((i+1)+"번 째 학생점수:"+scores[i]);
				}
			} else if(selectNo==4) {
				int sum=0, max=0;
				double avg=0;
				for(int i=0;i<scores.length;i++) {
					if(max<scores[i]) {
						max = scores[i];
						}
					sum = sum+scores[i];
				}
				avg = sum/scores.length;
				System.out.println("최고점수 :"+max);
				System.out.println("평균점수 :"+avg);
				
				int temp;
				for (int i = 0; i < scores.length; i++) {
					for (int j = i + 1; j < scores.length; j++) {
						if (scores[i] < scores[j]) {
							// num[i]가 가지고 있는 값을 temp에 대입 
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
					}
				}
				for (int n = 0; n < scores.length; n++)
					System.out.println(scores[n]);
				
			} else if(selectNo==5) {
				// while문 종료 
				run = false;
			}
		}	
		System.out.println("프로그램 종료");
	}

}
