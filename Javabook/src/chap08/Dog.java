package chap08;

//Animal을 상속받음
public class Dog extends Animal{	
	void bark() {
		System.out.println("멍멍멍멍!");
	}
	
	@Override
	public void animalSound() { //동물소리 재정의
		System.out.println("개는 멍멍ㅁ엄엄엉멍!!");
	}
}
