package javaClass_191206;

public class Ex03_MultiTable {

	public static void main(String[] args) {
		// 구구단 출력하기 
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				//실행문
				System.out.print(i+"x"+j+"=" +(i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
		
		
	}

}
