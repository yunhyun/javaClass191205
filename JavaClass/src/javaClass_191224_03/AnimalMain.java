package javaClass_191224_03;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal ani = new Animal();
		Dog dog = new Dog();
		dog.sound();
		dog.breath();
		Cat cat = new Cat();
		cat.sound();
		cat.breath();
		
		// 다형성(polymorphism) 
		Animal ani = new Dog();
		ani.sound();
		ani = new Cat();
		ani.sound();
		
//		cat = new Dog();
		
	}

}
