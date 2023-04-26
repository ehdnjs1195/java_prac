package chap09;

public class Pig implements Animal02{

	//인터페이스를 상속받았으므로 반드시 오버라이딩이 필요하다.
	@Override
	public void animalSound() {
		System.out.println("꿀꿀꿀");
	}

	@Override
	public void animalWalk() {
		System.out.println("네발로 걷다");
	}
	
}
