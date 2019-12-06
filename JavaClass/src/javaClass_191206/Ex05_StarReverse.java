package javaClass_191206;

public class Ex05_StarReverse {

	public static void main(String[] args) {
		// 별찍기 역순
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
