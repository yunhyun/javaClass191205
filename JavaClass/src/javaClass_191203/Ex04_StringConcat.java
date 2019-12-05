package javaClass_191203;

public class Ex04_StringConcat {

	public static void main(String[] args) {
		// String 타입 변수 
		String stringVar;
		stringVar = "변수에 저장하고 싶은 내용";
		System.out.println(stringVar);
		
		String strVar1 = "자바";
		String strVar2 = "아직은 할만해";
		String strVar3 = "난 틀렸어";
		String result;
		result = strVar1 + strVar2;
		System.out.println(result);
		result = strVar1 + strVar3;
		System.out.println(result);
		result = result + strVar3;
		System.out.println(result);
		result = strVar1 + 8.0;
		System.out.println(result);
		
		
	}

}
