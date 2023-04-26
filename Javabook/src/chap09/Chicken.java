package chap09;

public class Chicken implements Fly, Walk {
	//나는 기능, 걷는 기능을 상속받아 재정의함.
	@Override
	public void walk() {
		System.out.println("닭은 날 수 있다.");
	}

	@Override
	public void fly() {
		System.out.println("닭은 걸을 수 있다.");
	}

}
