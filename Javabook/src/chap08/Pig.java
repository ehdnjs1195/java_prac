package chap08;

public class Pig extends Animal{
	
	@Override
	public void animalSound() {//상위클래스 메서드 오버라이딩.
		System.out.println("돼지는 꿀꿀꿀");
	}
}
