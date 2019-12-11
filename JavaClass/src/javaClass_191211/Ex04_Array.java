package javaClass_191211;

public class Ex04_Array {

	public static void main(String[] args) {
		// 배열(Array) : 같은 타입의 데이터를 하나의 변수에 저장하는 구조
		// 배열 선언
		// 타입[] 배열이름 or 타입 배열이름[]
		// 배열 선언
		int[] number;
		int number1[];
		// 배열을 선언하면서 값을 주기
		int[] number2 = { 1, 2, 3 };
		// number2 배열의 첫번째 칸에 저장된 값 출력
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
//		System.out.println(number2[3]);

		String[] name = { "임현우", "김선재", "김성우", "전석종" };

		System.out.println(name[0]);
		// for문을 이용해서 name 배열에 저장된 값을 모두 출력해보세요
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		// 정수형 배열 변수를 하나 선언해서 값을 4개 저장하고 
		// 배열변수에 저장된 모든 값의 총합과 평균을 출력하세요. 
		int[] numbers = {1, 2, 3, 5};// index : 3, length(크기) :4
		//numbers[4] = 1;
		int sum = 0;
		System.out.println(numbers.length);
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/numbers.length);
		
		// 배열선언하면서 크기만 지정하기 
		int[] num = new int[3];
		System.out.println(num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		//System.out.println(num[3]);
		num[0] = 5;
		num[1] = 7;
		num[2] = 100;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		
		
		
		
		
	}

}









