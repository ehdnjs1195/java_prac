package chap09;

public class Cat extends Animal{
	
	public void printSound() {	//Animal에서 추상메서드로 정의 되어있던 메서드를 오버라이딩해서 재정의한다.
		System.out.println("야오오오오오오오오옹~~!");
	}
}
