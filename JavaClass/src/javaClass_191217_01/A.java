package javaClass_191217_01;

public class A {
	// 필드 선언 
	public int field1;
	protected int field2;
	int field3;
	private int field4;
	
	// 메소드 4가지 선언 
	public void method1() {
	}
	protected void method2() {
	}
	void method3() {
	}
	private void method4() {
	}
	
	/*
	 * 접근제한자(Access Modifier)
	 * 1. public 
	 * 		- 적용대상 : 클래스, 필드, 생성자, 메소드 
	 * 		- 모든 클래스에서 접근 가능 
	 * 2. protected
	 * 		- 적용대상 : 필드, 생성자, 메소드
	 * 		- 자식클래스가 아닌 다른 패키지에 소속되어 있으면 
	 * 		  접근 불가능 
	 * 3. default
	 * 		- 적용대상 : 클래스, 필드, 생성자, 메소드 
	 * 		- 다른 패키지에 소속된 클래스는 접근 불가능 
	 * 4. private 
	 * 		- 적용대상 : 필드, 생성자, 메소드 
	 * 		- 자신이 아닌 다른 클래스에서는 접근 불가능  
	 */
}


