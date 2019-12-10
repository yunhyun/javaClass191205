package javaClass_191210;

public class Ex01_xyfunction {

	public static void main(String[] args) {
		/*
		 * 4x+5y=60 을 만족하는 모든 해를 구하시오. 
		 * 단, x,y는 0이상 10이하의 자연수이다. 
		 */
		for(int x=1;x<=10;x++) {
			// x가 1일때 y를 1~10까지 하나하나 입력해보기 
			// 위해 중복 for문 사용 
			for(int y=1;y<=10;y++) {
				//4x+5y=60을 만족하는 값을 찾기 위해 if문 사용
				if((4*x+5*y)==60) {
					System.out.println
					("("+x+","+y+")");
				}
			}
		}

	}

}
