package javaClass_191205;

public class Ex06_For1To10Sum {

	public static void main(String[] args) {
		// 1+2+3+~~+10=55 출력하기 
		int sum = 0;
		for(int i=1; i<=10;i++) {
			sum+=i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
		}
		
		
		
		
	}

}
