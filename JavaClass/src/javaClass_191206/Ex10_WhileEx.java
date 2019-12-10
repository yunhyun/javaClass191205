package javaClass_191206;

public class Ex10_WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("숫자: "+num);
			if(num==6) {
				System.out.println("6이 나왔네요 종료합니다.");
				run=false;
			}
		}
		System.out.println("반복문 종료됨.");
	}

}
