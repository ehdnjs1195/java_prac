package chap08;

public class Example04 {

	public static void main(String[] args) {
		Cat objCat = new Cat();
		objCat.meow();
		objCat.eat();	//Cat이 상속받은 Animal 클래스의 메서드
		Dog objDog = new Dog();
		objDog.bark();	
		objDog.eat();	//Dog이 상속받은 Animal 클래스의 메서드
	}

}
