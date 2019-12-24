package javaClass_191224_05;

public interface RemoteControl {
	/* 인터페이스(interface)
	 * 1. 인터페이스는 main 코드와 객체간의 접점 역할을 함. 
	 * 2. 객체의 다형성을 구현하는데 용이함. 
	 * 3. 인터페이스의 구성 요소 
	 * 	3.1 상수 필드만 선언이 가능함. 
	 * 		일반적인 필드로 선언해도 컴파일 과정에서 
	 * 		static final이 자동으로 붙음. 
	 *  3.2 추상메소드를 가짐. 
	 *  3.3 디폴트 메소드 가짐.
	 *  	기본으로 실행내용까지 가지고 있는 메소드 
	 *  3.4 정적(static) 메소드 가짐.
	 *  	인터페이스를 객체화하지 않고도 직접 호출 가능  
	 */
	// 필드 선언 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 메소드 선언(추상메소드)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드 선언
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("음소거 합니다.");
		else
			System.out.println("음소거 해제 합니다.");
	}
	
	// static 메소드 선언
	static void changeBattery() {
		System.out.println("건전지를 교환해주세요");
	}
	
	
	
}














