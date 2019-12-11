package javaClass_191211;

import java.util.Scanner;

public class Ex02_UpDown {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0 ;
		int count=0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Up&Down");
		do {
			count++;
			System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
			input=scan.nextInt();
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				run = false;
			} 
		} while(run);
	}

}
