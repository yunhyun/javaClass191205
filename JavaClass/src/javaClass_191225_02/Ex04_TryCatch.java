package javaClass_191225_02;

public class Ex04_TryCatch {

	public static void main(String[] args) {
		try {
		String str1 = "100";
		String str2 = "a100";
		System.out.println(str1+str1);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num1);
		} catch(Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		}
		
	}

}
