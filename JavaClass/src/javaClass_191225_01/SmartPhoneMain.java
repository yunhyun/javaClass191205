package javaClass_191225_01;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.sendMessage();
		sp.receiveMessage();
		sp.play();
		sp.stop();
		System.out.println(sp.add(5, 3));
		
	}

}
