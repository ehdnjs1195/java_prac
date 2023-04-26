package chap09;

public class Example01 {

	public static void main(String[] args) {
		//Animal은 추상클래스이므로 일반적으로 객체를 생성할 수 없다.
		//Animal myObj = new Animal(); 
		
		Cat cat = new Cat();
		cat.printSound();
		cat.dispayInfo();
		
	}

}
