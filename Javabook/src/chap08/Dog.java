package chap08;

public class Dog extends Animal{	
	void bark() {
		System.out.println("멍멍멍멍!");
	}
	
	@Override
	public void animalSound() {
		System.out.println("개는 멍멍ㅁ엄엄엉멍!!");
	}
}
