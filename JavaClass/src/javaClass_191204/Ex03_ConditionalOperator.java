package javaClass_191204;

public class Ex03_ConditionalOperator {

	public static void main(String[] args) {
		/*
		 * 삼항연산자 
		 * 문법 
		 * (조건식) ? 조건식 true 결과 : 조건식 false 결과
		 */
		int score;
		score = 90;
		String grade;
		grade = (score > 60) ? "합격" : "불합격";
		System.out.println("grade 변수 값 :"+ grade);
		
	}

}






