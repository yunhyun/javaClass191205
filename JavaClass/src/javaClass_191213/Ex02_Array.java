package javaClass_191213;

public class Ex02_Array {

	public static void main(String[] args) {
		// 2차원 배열 
		int[][] number = new int[2][3];
		int[][] number1 = new int[3][3];
		// 배열의 크기 확인 
		System.out.println(number.length);
		System.out.println(number[0].length);
		System.out.println(number[1].length);
		System.out.println(number1.length);
		
		// for문 이용해서 배열에 저장된 데이터 모두 출력하기 
		number[0][0] = 1;
		number[0][1] = 2;
		number[0][2] = 3;
		number[1][0] = 4;
		number[1][1] = 5;
		number[1][2] = 6;
		
		for(int i=0;i < number.length;i++) {
			for(int j=0; j < number[i].length;j++) {
				System.out.println(
						"number["+i+"]["+j+"]="
						+number[i][j]);
			}
		}
		
		
		
		int[][] number2 = {
							{1,2,3},
							{4,5,6}
						  };
		
		
		
	}

}






