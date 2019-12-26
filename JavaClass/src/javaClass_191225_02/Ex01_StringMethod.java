package javaClass_191225_02;

public class Ex01_StringMethod {

	public static void main(String[] args) {
		// String 메소드 
		String str = "자바는 재밌다.";
		// String 변수 글자수 리턴 
		System.out.println(str.length());
		// 일부 문자 교체 메소드 
		String newStr = str.replace("자바", "JAVA");
		System.out.println(newStr);
		System.out.println(str);
		// 글자 잘라내기 메소드 
		String str2 = str.substring(0, 1);
		System.out.println(str2);
		String str3 = str.substring(2);
		System.out.println(str3);
		// 대소문자 변경 메소드 
		String str4 = "abcdEFGHijklMN";
		String str4Lower = str4.toLowerCase();
		System.out.println(str4Lower);
		String str4Upper = str4.toUpperCase();
		System.out.println(str4Upper);
		// 공백 제거 메소드 
		String str5 = "           자바";
		String str6 = "JAVA           ";
		String str7 = "      이클립스          ";
		String str8 = str5.trim() + str6.trim() + str7.trim();
		String str9 = str5 + str6 + str7;
		System.out.println(str8);
		System.out.println(str9);
		
		
		
		
		
	}

}





