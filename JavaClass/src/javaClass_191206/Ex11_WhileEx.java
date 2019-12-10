package javaClass_191206;

public class Ex11_WhileEx {

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if( (num1+num2) == 5) {
				run = false;
			}
		}
		System.out.println("종료되었습니다.");

	}

}
