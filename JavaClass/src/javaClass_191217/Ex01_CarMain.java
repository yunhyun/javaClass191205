package javaClass_191217;

public class Ex01_CarMain {

	public static void main(String[] args) {
		Ex01_Car car = new Ex01_Car();
		car.setGas(5);
		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		if(gasState) {
			System.out.println("출발");
			car.run();
		}
	}

}
