package javaClass_191225_01;
// PDA 상속
// MobilePhone, MP3 구현 
public class SmartPhone extends PDA implements MP3, MobilePhone {

	@Override
	public void sendCall() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화를 받습니다.");
		
	}

	@Override
	public void sendMessage() {
		System.out.println("메시지를 보냅니다.");
	}

	@Override
	public void receiveMessage() {
		System.out.println("메시지를 받습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 재생을 정지합니다.");
	}
	

}
